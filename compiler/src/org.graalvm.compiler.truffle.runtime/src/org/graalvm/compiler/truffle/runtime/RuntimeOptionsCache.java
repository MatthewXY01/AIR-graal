/*
 * Copyright (c) 2019, Oracle and/or its affiliates. All rights reserved.
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
package org.graalvm.compiler.truffle.runtime;

import org.graalvm.options.OptionValues;

/**
 * A cache that enables the Runtime options to be read without the lookup. This is intended to only
 * be used on performance critical paths.
 */
public class RuntimeOptionsCache {

    // Splitting
    private boolean legacySplitting;
    private boolean splitting;
    private boolean splittingAllowForcedSplits;
    private boolean splittingDumpDecisions;
    private boolean splittingTraceEvents;
    private boolean traceSplittingSummary;
    private int splittingMaxCalleeSize;
    private int splittingMaxPropagationDepth;
    // Inlining
    private boolean inlining;
    private int inliningNodeBudget;
    private int inliningRecursionDepth;
    private double splittingGrowthLimit;
    private int splittingMaxNumberOfSplitNodes;

    public RuntimeOptionsCache() {
        // Splitting
        splitting = TruffleRuntimeOptions.getValue(PolyglotCompilerOptions.Splitting);
        legacySplitting = TruffleRuntimeOptions.getValue(SharedTruffleRuntimeOptions.TruffleLegacySplitting);
        splittingAllowForcedSplits = TruffleRuntimeOptions.getValue(SharedTruffleRuntimeOptions.TruffleSplittingAllowForcedSplits);
        splittingDumpDecisions = TruffleRuntimeOptions.getValue(SharedTruffleRuntimeOptions.TruffleSplittingDumpDecisions);
        splittingMaxCalleeSize = TruffleRuntimeOptions.getValue(SharedTruffleRuntimeOptions.TruffleSplittingMaxCalleeSize);
        splittingMaxPropagationDepth = TruffleRuntimeOptions.getValue(SharedTruffleRuntimeOptions.TruffleSplittingMaxPropagationDepth);
        splittingTraceEvents = TruffleRuntimeOptions.getValue(SharedTruffleRuntimeOptions.TruffleSplittingTraceEvents);
        traceSplittingSummary = TruffleRuntimeOptions.getValue(SharedTruffleRuntimeOptions.TruffleTraceSplittingSummary);
        splittingGrowthLimit = TruffleRuntimeOptions.getValue(SharedTruffleRuntimeOptions.TruffleSplittingGrowthLimit);
        splittingMaxNumberOfSplitNodes = TruffleRuntimeOptions.getValue(SharedTruffleRuntimeOptions.TruffleSplittingMaxNumberOfSplitNodes);
        // Inlining
        inlining = TruffleRuntimeOptions.getValue(PolyglotCompilerOptions.Inlining);
        inliningNodeBudget = TruffleRuntimeOptions.getValue(PolyglotCompilerOptions.InliningNodeBudget);
        inliningRecursionDepth = TruffleRuntimeOptions.getValue(PolyglotCompilerOptions.InliningRecursionDepth);
        // Mode overrides
        if (TruffleRuntimeOptions.getValue(PolyglotCompilerOptions.Mode) == PolyglotCompilerOptions.EngineModeEnum.LATENCY) {
            splitting = false;
            inliningNodeBudget = inliningNodeBudget / 4;
        }
    }

    void reinitialize(OptimizedCallTarget target) {
        // Splitting
        splitting = target.getOptionValue(PolyglotCompilerOptions.Splitting);
        final OptionValues optionValues = target.getOptionValues();
        legacySplitting = SharedTruffleRuntimeOptions.TruffleLegacySplitting.getValue(optionValues);
        splittingAllowForcedSplits = SharedTruffleRuntimeOptions.TruffleSplittingAllowForcedSplits.getValue(optionValues);
        splittingDumpDecisions = SharedTruffleRuntimeOptions.TruffleSplittingDumpDecisions.getValue(optionValues);
        splittingMaxCalleeSize = SharedTruffleRuntimeOptions.TruffleSplittingMaxCalleeSize.getValue(optionValues);
        splittingMaxPropagationDepth = SharedTruffleRuntimeOptions.TruffleSplittingMaxPropagationDepth.getValue(optionValues);
        splittingTraceEvents = SharedTruffleRuntimeOptions.TruffleSplittingTraceEvents.getValue(optionValues);
        traceSplittingSummary = SharedTruffleRuntimeOptions.TruffleTraceSplittingSummary.getValue(optionValues);
        splittingGrowthLimit = SharedTruffleRuntimeOptions.TruffleSplittingGrowthLimit.getValue(optionValues);
        splittingMaxNumberOfSplitNodes = SharedTruffleRuntimeOptions.TruffleSplittingMaxNumberOfSplitNodes.getValue(optionValues);
        // Inlining
        inlining = target.getOptionValue(PolyglotCompilerOptions.Inlining);
        inliningNodeBudget = target.getOptionValue(PolyglotCompilerOptions.InliningNodeBudget);
        inliningRecursionDepth = target.getOptionValue(PolyglotCompilerOptions.InliningRecursionDepth);
        // Mode overrides
        if (target.getOptionValue(PolyglotCompilerOptions.Mode) == PolyglotCompilerOptions.EngineModeEnum.LATENCY) {
            splitting = false;
            inliningNodeBudget = inliningNodeBudget / 4;
        }
    }

    boolean isSplittingDumpDecisions() {
        return splittingDumpDecisions;
    }

    boolean isLegacySplitting() {
        return legacySplitting;
    }

    boolean isSplittingAllowForcedSplits() {
        return splittingAllowForcedSplits;
    }

    boolean isSplitting() {
        return splitting;
    }

    boolean isSplittingTraceEvents() {
        return splittingTraceEvents;
    }

    boolean isTraceSplittingSummary() {
        return traceSplittingSummary;
    }

    int getSplittingMaxCalleeSize() {
        return splittingMaxCalleeSize;
    }

    int getSplittingMaxPropagationDepth() {
        return splittingMaxPropagationDepth;
    }

    boolean isInlining() {
        return inlining;
    }

    int getInliningNodeBudget() {
        return inliningNodeBudget;
    }

    int getInliningRecursionDepth() {
        return inliningRecursionDepth;
    }

    double getSplittingGrowthLimit() {
        return splittingGrowthLimit;
    }

    int getSplittingMaxNumberOfSplitNodes() {
        return splittingMaxNumberOfSplitNodes;
    }
}
