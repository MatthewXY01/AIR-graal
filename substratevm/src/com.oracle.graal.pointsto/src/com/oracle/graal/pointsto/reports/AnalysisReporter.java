/*
 * Copyright (c) 2021, 2021, Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2021, 2021, Alibaba Group Holding Limited. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.graal.pointsto.reports;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.graalvm.compiler.options.OptionValues;

import com.oracle.graal.pointsto.BigBang;
import com.oracle.graal.pointsto.api.PointstoOptions;
import com.oracle.graal.pointsto.meta.AnalysisType;
import com.oracle.graal.pointsto.typestate.PointsToStats;
import com.oracle.graal.pointsto.typestate.TypeState;

public class AnalysisReporter {
    public static void printAnalysisReports(String imageName, OptionValues options, String reportsPath, BigBang bb) {
        if (bb != null) {
            if (AnalysisReportsOptions.PrintAnalysisStatistics.getValue(options)) {
                StatisticsPrinter.print(bb, reportsPath, ReportUtils.extractImageName(imageName));
            }

            if (AnalysisReportsOptions.PrintAnalysisCallTree.getValue(options)) {
                CallTreePrinter.print(bb, reportsPath, ReportUtils.extractImageName(imageName));
            }

            if (AnalysisReportsOptions.PrintImageObjectTree.getValue(options)) {
                ObjectTreePrinter.print(bb, reportsPath, ReportUtils.extractImageName(imageName));
                AnalysisHeapHistogramPrinter.print(bb, reportsPath, ReportUtils.extractImageName(imageName));
            }

            if (PointstoOptions.PrintPointsToStatistics.getValue(options)) {
                PointsToStats.report(bb, ReportUtils.extractImageName(imageName));
            }

            if (PointstoOptions.PrintSynchronizedAnalysis.getValue(options)) {
                TypeState allSynchronizedTypeState = bb.getAllSynchronizedTypeState();
                String typesString = allSynchronizedTypeState.closeToAllInstantiated(bb) ? "close to all instantiated" : //
                                StreamSupport.stream(allSynchronizedTypeState.types().spliterator(), false).map(AnalysisType::getName).collect(Collectors.joining(", "));
                System.out.println();
                System.out.println("AllSynchronizedTypes");
                System.out.println("Synchronized types #: " + allSynchronizedTypeState.typesCount());
                System.out.println("Types: " + typesString);
                System.out.println();
            }
        }
    }
}
