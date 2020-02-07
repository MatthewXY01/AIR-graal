/*
 * Copyright (c) 2020, 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The Universal Permissive License (UPL), Version 1.0
 *
 * Subject to the condition set forth below, permission is hereby granted to any
 * person obtaining a copy of this software, associated documentation and/or
 * data (collectively the "Software"), free of charge and under any and all
 * copyright rights in the Software, and any and all patent rights owned or
 * freely licensable by each licensor hereunder covering either (i) the
 * unmodified Software as contributed to or provided by such licensor, or (ii)
 * the Larger Works (as defined below), to deal in both
 *
 * (a) the Software, and
 *
 * (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
 * one is included with the Software each a "Larger Work" to which the Software
 * is contributed by such licensors),
 *
 * without restriction, including without limitation the rights to copy, create
 * derivative works of, display, perform, and distribute the Software and make,
 * use, sell, offer for sale, import, export, have made, and have sold the
 * Software and the Larger Work(s), and to sublicense the foregoing rights on
 * either these or other terms.
 *
 * This license is subject to the following condition:
 *
 * The above copyright notice and either this complete permission notice or at a
 * minimum a reference to the UPL must be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.oracle.truffle.regex.tregex.parser.ast;

import java.util.Objects;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.regex.tregex.parser.Token;

/**
 * A common supertype for all {@link RegexASTNode}s except {@link Sequence}s.
 * <p>
 * Roughly corresponds to the goal symbol <em>Term</em> in the ECMAScript RegExp syntax. A
 * <em>Term</em> ({@link QuantifiableTerm}) can be either an <em>Assertion</em>
 * ({@link PositionAssertion} or {@link RegexASTSubtreeRootNode}) or an <em>Atom</em>
 * ({@link CharacterClass}, {@link BackReference} or {@link Group}). <em>Quantifier</em>s are
 * handled by the {@link Group#isLoop()} flag of {@link Group}s.
 */
public abstract class QuantifiableTerm extends Term {

    private short quantifierIndex = -1;
    private Token.Quantifier quantifier;

    QuantifiableTerm() {
    }

    QuantifiableTerm(QuantifiableTerm copy) {
        super(copy);
    }

    @Override
    public abstract QuantifiableTerm copy(RegexAST ast, boolean recursive);

    public boolean hasQuantifier() {
        return quantifier != null;
    }

    public Token.Quantifier getQuantifier() {
        return quantifier;
    }

    public void setQuantifier(Token.Quantifier quantifier) {
        this.quantifier = quantifier;
    }

    boolean quantifierEquals(QuantifiableTerm o) {
        return Objects.equals(quantifier, o.quantifier);
    }

    public short getQuantifierIndex() {
        return quantifierIndex;
    }

    public void setQuantifierIndex(int quantifierIndex) {
        assert quantifierIndex <= Short.MAX_VALUE;
        this.quantifierIndex = (short) quantifierIndex;
    }

    @Override
    public boolean equalsSemantic(RegexASTNode obj) {
        return equalsSemantic(obj, false);
    }

    public abstract boolean equalsSemantic(RegexASTNode obj, boolean ignoreQuantifier);

    @TruffleBoundary
    protected String quantifierToString() {
        return hasQuantifier() ? quantifier.toString() : "";
    }

    @Override
    public RegexASTSubtreeRootNode getSubTreeParent() {
        RegexASTNode current = this;
        while (current.getParent() != null) {
            assert current instanceof QuantifiableTerm;
            if (current.getParent() instanceof RegexASTSubtreeRootNode) {
                return (RegexASTSubtreeRootNode) current.getParent();
            }
            // structure is always Group -> Sequence -> Term
            current = current.getParent().getParent();
        }
        // this should only be reached by nodes generated by RegexAST#createNFAInitialStates()!
        return null;
    }
}
