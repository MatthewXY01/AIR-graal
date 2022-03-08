package com.mxy;

public class smallest {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main(String[] args) throws Exception {
//        smallest mainClass = new smallest();
//        String output;
//        if(args.length > 0) {
//            mainClass.scanner = new java.util.Scanner(args[0]);
//        } else {
//            mainClass.scanner = new java.util.Scanner(System.in);
//        }
//        mainClass.exec0();
//        System.out.println(mainClass.output);
    }

    // smallest_cb243beb_000.java
    public void exec0() throws Exception {
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj(), n4 =
                new IntObj(), min = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        n4.value = scanner.nextInt();
        if (n1.value <= n2.value) {
            min.value = n1.value;
        } else {
            min.value = n2.value;
        }
        if (min.value >= n3.value) {
            min.value = n3.value;
        }
        if (min.value >= n4.value) {
            min.value = n4.value;
        } else {
            output += (String.format("%d is the smallest\n", min.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_346b1d3c_002.java
    public void exec1() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj(), num_1 = new IntObj(), num_2 = new IntObj(), num_3 =
                new IntObj(), num_4 = new IntObj();
        output +=
                (String.format("Please enter 4 numbers seperated by spaces > "));
        num_1.value = scanner.nextInt();
        num_2.value = scanner.nextInt();
        num_3.value = scanner.nextInt();
        num_4.value = scanner.nextInt();
        a.value = (num_1.value);
        b.value = (num_2.value);
        c.value = (num_3.value);
        d.value = (num_4.value);
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format("%d is the smallest\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format("%d is the smalles\n", b.value));
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            output += (String.format("%d is the smallest\n", c.value));
        } else if (d.value < a.value && d.value < b.value && d.value < c.value) {
            output += (String.format("%d is the smallest\n", d.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_346b1d3c_003.java
    public void exec2() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj(), num_1 = new IntObj(), num_2 = new IntObj(), num_3 =
                new IntObj(), num_4 = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        num_1.value = scanner.nextInt();
        num_2.value = scanner.nextInt();
        num_3.value = scanner.nextInt();
        num_4.value = scanner.nextInt();
        a.value = (num_1.value);
        b.value = (num_2.value);
        c.value = (num_3.value);
        d.value = (num_4.value);
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format("%d is the smallest\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format("%d is the smalles\n", b.value));
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            output += (String.format("%d is the smallest\n", c.value));
        } else if (d.value < a.value && d.value < b.value && d.value < c.value) {
            output += (String.format("%d is the smallest\n", d.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_346b1d3c_005.java
    public void exec3() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj(), num_1 = new IntObj(), num_2 = new IntObj(), num_3 =
                new IntObj(), num_4 = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        num_1.value = scanner.nextInt();
        num_2.value = scanner.nextInt();
        num_3.value = scanner.nextInt();
        num_4.value = scanner.nextInt();
        a.value = (num_1.value);
        b.value = (num_2.value);
        c.value = (num_3.value);
        d.value = (num_4.value);
        if (a.value <= b.value && a.value <= c.value && a.value <= d.value) {
            output += (String.format("%d is the smallest\n", a.value));
        } else if (b.value <= a.value && b.value <= c.value && b.value <= d.value) {
            output += (String.format("%d is the smalles\n", b.value));
        } else if (c.value <= a.value && c.value <= b.value && c.value <= d.value) {
            output += (String.format("%d is the smallest\n", c.value));
        } else if (d.value <= a.value && d.value <= b.value && d.value <= c.value) {
            output += (String.format("%d is the smallest\n", d.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_346b1d3c_010.java
    public void exec4() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj(), num_1 = new IntObj(), num_2 = new IntObj(), num_3 =
                new IntObj(), num_4 = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        num_1.value = scanner.nextInt();
        num_2.value = scanner.nextInt();
        num_3.value = scanner.nextInt();
        num_4.value = scanner.nextInt();
        a.value = (num_1.value);
        b.value = (num_2.value);
        c.value = (num_3.value);
        d.value = (num_4.value);
        if (a.value <= b.value && a.value <= c.value && a.value <= d.value) {
            output += (String.format("%d is the smallest\n", a.value));
            if (true)
                return;
            ;
        } else if (b.value <= a.value && b.value <= c.value && b.value <= d.value) {
            output += (String.format("%d is the smalles\n", b.value));
            if (true)
                return;
            ;
        } else if (c.value <= a.value && c.value <= b.value && c.value <= d.value) {
            output += (String.format("%d is the smallest\n", c.value));
            if (true)
                return;
            ;
        } else if (d.value <= a.value && d.value <= b.value && d.value <= c.value) {
            output += (String.format("%d is the smallest\n", d.value));
            if (true)
                return;
            ;
        }
        if (true)
            return;
        ;
    }

    // smallest_15cb07a7_007.java
    public void exec5() throws Exception {
        IntObj frst = new IntObj(), scnd = new IntObj(), thrd =
                new IntObj(), frth = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        frst.value = scanner.nextInt();
        scnd.value = scanner.nextInt();
        thrd.value = scanner.nextInt();
        frth.value = scanner.nextInt();
        if (frst.value < scnd.value && frst.value < thrd.value
                && frst.value < frth.value) {
            output += (String.format("%d is the smallest\n", frst.value));
        } else if (scnd.value < frst.value && scnd.value < thrd.value
                && scnd.value < frth.value) {
            output += (String.format("%d is the smallest\n", scnd.value));
        } else if (thrd.value < frst.value && thrd.value < scnd.value
                && thrd.value < frth.value) {
            output += (String.format("%d is the smallest\n", thrd.value));
        } else {
            output += (String.format("%d is the smallest\n", frth.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_f8d57dea_000.java
    public void exec6() throws Exception {
        IntObj v1 = new IntObj(), v2 = new IntObj(), v3 = new IntObj(), v4 =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        v1.value = scanner.nextInt();
        v2.value = scanner.nextInt();
        v3.value = scanner.nextInt();
        v4.value = scanner.nextInt();
        if (v1.value < v2.value && v1.value < v3.value && v1.value < v4.value) {
            output += (String.format("%d is the smallest\n", v1.value));
        } else if (v2.value < v1.value && v2.value < v3.value
                && v2.value < v4.value) {
            output += (String.format("%d is the smallest\n", v2.value));
        } else if (v3.value < v1.value && v3.value < v2.value
                && v3.value < v4.value) {
            output += (String.format("%d is the smallest\n", v3.value));
        } else {
            output += (String.format("%d is the smallest\n", v4.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_3cf6d33a_003.java
    public void exec7() throws Exception {
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c =
                new DoubleObj(), d = new DoubleObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format("%.0f is the smallest\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format("%.0f is the smallest\n", b.value));
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            output += (String.format("%.0f is the smallest\n", c.value));
        } else if (d.value < a.value && d.value < b.value && d.value < c.value) {
            output += (String.format("%.0f is the smallest\n", d.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_c9d718f3_003.java
    public void exec8() throws Exception {
        DoubleObj num1 = new DoubleObj(), num2 = new DoubleObj(), num3 =
                new DoubleObj(), num4 = new DoubleObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        num1.value = scanner.nextDouble();
        num2.value = scanner.nextDouble();
        num3.value = scanner.nextDouble();
        num4.value = scanner.nextDouble();
        if (num1.value < num2.value && num1.value < num3.value
                && num1.value < num4.value) {
            output += (String.format("%.0f is the smallest\n", num1.value));
        }
        if (num2.value < num1.value && num2.value < num3.value
                && num2.value < num4.value) {
            output += (String.format("%.0f is the smallest\n", num2.value));
        }
        if (num3.value < num1.value && num3.value < num2.value
                && num3.value < num4.value) {
            output += (String.format("%.0f is the smallest\n", num3.value));
        }
        if (num4.value < num1.value && num4.value < num2.value
                && num4.value < num3.value) {
            output += (String.format("%.0f is the smallest\n", num4.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_c9d718f3_000.java
    public void exec9() throws Exception {
        DoubleObj num1 = new DoubleObj(), num2 = new DoubleObj(), num3 =
                new DoubleObj(), num4 = new DoubleObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        num1.value = scanner.nextDouble();
        num2.value = scanner.nextDouble();
        num3.value = scanner.nextDouble();
        num4.value = scanner.nextDouble();
        if (num1.value < num2.value && num1.value < num3.value
                && num1.value < num4.value) {
            output += (String.format("%.0f is the smallest\n", num1.value));
        }
        if (num2.value < num1.value && num2.value < num3.value
                && num2.value < num4.value) {
            output += (String.format("%.0f is the smallest\n", num2.value));
        }
        if (num3.value < num1.value && num3.value < num2.value
                && num3.value < num4.value) {
            output += (String.format("%.0f is the smallest\n", num3.value));
        }
        if (num4.value < num1.value && num4.value < num2.value
                && num4.value < num4.value) {
            output += (String.format("%.0f is the smallest\n", num4.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_5a568359_000.java
    public void exec10() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers seperated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if ((a.value < b.value) && (a.value < c.value) && (a.value < d.value)) {
            output += (String.format("%d is the smallest", a.value));
        } else if ((b.value < a.value) && (b.value < c.value)
                && (b.value < d.value)) {
            output += (String.format("%d is the smallest", b.value));
        } else if ((c.value < a.value) && (c.value < b.value)
                && (c.value < d.value)) {
            output += (String.format("%d is the smallest", c.value));
        } else if ((d.value < a.value) && (d.value < b.value)
                && (d.value < c.value)) {
            output += (String.format("%d is the smallest", d.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_68eb0bb0_000.java
    public void exec11() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format("%d is the smallest\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format("%d is the smallest\n", b.value));
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            output += (String.format("%d is the smallest\n", c.value));
        } else {
            output += (String.format("%d is the smallest\n", d.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_1b31fa5c_003.java
    public void exec12() throws Exception {
        IntObj A = new IntObj(), B = new IntObj(), C = new IntObj(), D =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        A.value = scanner.nextInt();
        B.value = scanner.nextInt();
        C.value = scanner.nextInt();
        D.value = scanner.nextInt();
        if (A.value < B.value && A.value < C.value && A.value < D.value) {
            output += (String.format("%d is the smallest\n", A.value));
            if (true)
                return;
            ;
        } else if (B.value < A.value && B.value < C.value && B.value < D.value) {
            output += (String.format("%d is the smallest\n", B.value));
            if (true)
                return;
            ;
        } else if (C.value < A.value && C.value < B.value && C.value < D.value) {
            output += (String.format("%d is the smallest\n", C.value));
            if (true)
                return;
            ;
        } else if (D.value < A.value && D.value < B.value && D.value < C.value) {
            output += (String.format("%d is the smallest\n", D.value));
            if (true)
                return;
            ;
        }
    }

    // smallest_95362737_009.java
    public void exec13() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers seperated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value > b.value) {
            if (b.value > c.value) {
                if (c.value > d.value) {
                    output += (String.format("%d is the smallest\n", d.value));
                } else {
                    output += (String.format("%d is the smallest\n", c.value));
                }
            } else if (b.value > d.value) {
                output += (String.format("%d is the smallest\n", d.value));
            } else {
                output += (String.format("%d is the smallesst\n", b.value));
            }
        } else if (a.value > c.value) {
            if (c.value > d.value) {
                output += (String.format("%d is the smallest\n", d.value));
            } else {
                output += (String.format("%d is the smallest\n", c.value));
            }
        } else if (a.value > d.value) {
            output += (String.format("%d is the smallest\n", d.value));
        } else {
            output += (String.format("%d is the smallest\n", a.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_90a14c1a_001.java
    public void exec14() throws Exception {
        IntObj one = new IntObj(), two = new IntObj(), three =
                new IntObj(), four = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        one.value = scanner.nextInt();
        two.value = scanner.nextInt();
        three.value = scanner.nextInt();
        four.value = scanner.nextInt();
        if ((one.value < two.value) && (one.value < three.value)
                && (one.value < four.value)) {
            output += (String.format("%d is the smallest\n", one.value));
        }
        if ((two.value < one.value) && (two.value < three.value)
                && (two.value < four.value)) {
            output += (String.format("%d is the smallest\n", two.value));
        }
        if ((three.value < one.value) && (three.value < two.value)
                && (three.value < four.value)) {
            output += (String.format("%d is the smallest\n", three.value));
        }
        if ((four.value < one.value) && (four.value < two.value)
                && (four.value < three.value)) {
            output += (String.format("%d is the smallest\n", four.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_90a14c1a_000.java
    public void exec15() throws Exception {
        IntObj one = new IntObj(), two = new IntObj(), three =
                new IntObj(), four = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        one.value = scanner.nextInt();
        two.value = scanner.nextInt();
        three.value = scanner.nextInt();
        four.value = scanner.nextInt();
        if ((one.value < two.value) && (two.value < three.value)
                && (three.value < four.value)) {
            output += (String.format("%d is the smallest\n", one.value));
        }
        if ((two.value < one.value) && (one.value < three.value)
                && (three.value < four.value)) {
            output += (String.format("%d is the smallest\n", two.value));
        }
        if ((three.value < one.value) && (one.value < two.value)
                && (two.value < four.value)) {
            output += (String.format("%d is the smallest\n", three.value));
        }
        if ((four.value < one.value) && (one.value < two.value)
                && (two.value < three.value)) {
            output += (String.format("%d is the smallest\n", four.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_e9c6206d_000.java
    public void exec16() throws Exception {
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c =
                new DoubleObj(), d = new DoubleObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format("%.0f is the smallest\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format("%.0f is the smallest\n", b.value));
        } else if (c.value < b.value && c.value < a.value && c.value < d.value) {
            output += (String.format("%.0f is the smallest\n", c.value));
        } else if (d.value < b.value && d.value < c.value && d.value < a.value) {
            output += (String.format("%.0f is the smallest\n", d.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_36d8008b_003.java
    public void exec17() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj(), e = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            e.value = a.value;
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            e.value = b.value;
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            e.value = c.value;
        } else {
            e.value = d.value;
        }
        output += (String.format("%d is the smallest\n", e.value));
        if (true)
            return;
        ;
    }

    // smallest_f2997e14_000.java
    public void exec18() throws Exception {
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 =
                new IntObj(), num4 = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        num4.value = scanner.nextInt();
        if (num1.value < num2.value && num1.value < num3.value
                && num1.value < num4.value) {
            output += (String.format("%d is the smallest\n", num1.value));
        } else if (num2.value < num1.value && num2.value < num3.value
                && num2.value < num4.value) {
            output += (String.format("%d is the smallest\n", num2.value));
        } else if (num3.value < num1.value && num3.value < num2.value
                && num3.value < num4.value) {
            output += (String.format("%d is the smallest\n", num3.value));
        } else if (num4.value < num1.value && num4.value < num2.value
                && num4.value < num3.value) {
            output += (String.format("%d is the smallest\n", num4.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_90834803_005.java
    public void exec19() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj(), sm = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format("%d is the smallest\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format("%d is the smallest\n", b.value));
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            output += (String.format("%d is the smallest\n", c.value));
        } else if (d.value < a.value && d.value < b.value && d.value < c.value) {
            output += (String.format("%d is the smallest\n", d.value));
        } else {
            output += (String.format("They have to be different numbers"));
        }
        if (true)
            return;
        ;
    }

    // smallest_6aaeaf2f_001.java
    public void exec20() throws Exception {
        IntObj int1 = new IntObj(), int2 = new IntObj(), int3 =
                new IntObj(), int4 = new IntObj(), tmp = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        int1.value = scanner.nextInt();
        int2.value = scanner.nextInt();
        int3.value = scanner.nextInt();
        int4.value = scanner.nextInt();
        tmp.value = int1.value;
        if (int1.value > int2.value) {
            tmp.value = int2.value;
        } else if (tmp.value > int3.value) {
            tmp.value = int3.value;
        } else if (tmp.value > int4.value) {
            tmp.value = int4.value;
        }
        output += (String.format("%d is the smallest\n", tmp.value));
        if (true)
            return;
        ;
    }

    // smallest_6aaeaf2f_000.java
    public void exec21() throws Exception {
        IntObj int1 = new IntObj(), int2 = new IntObj(), int3 =
                new IntObj(), int4 = new IntObj(), tmp = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by space > "));
        int1.value = scanner.nextInt();
        int2.value = scanner.nextInt();
        int3.value = scanner.nextInt();
        int4.value = scanner.nextInt();
        tmp.value = int1.value;
        if (int1.value > int2.value) {
            tmp.value = int2.value;
        } else if (tmp.value > int3.value) {
            tmp.value = int3.value;
        } else if (tmp.value > int4.value) {
            tmp.value = int4.value;
        }
        output += (String.format("%d is the smallest\n", tmp.value));
        if (true)
            return;
        ;
    }

    // smallest_88394fc0_002.java
    public void exec22() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        IntObj smallest = new IntObj();
        smallest.value = a.value;
        if (a.value > b.value) {
            smallest.value = b.value;
        }
        if (b.value > c.value) {
            smallest.value = c.value;
        }
        if (c.value > d.value) {
            smallest.value = d.value;
        } else if (a.value > d.value) {
            smallest.value = d.value;
        }
        output += (String.format("%d is the smallest", smallest.value));
        if (true)
            return;
        ;
    }

    // smallest_88394fc0_006.java
    public void exec23() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        IntObj smallest = new IntObj();
        smallest.value = a.value;
        if (a.value >= b.value) {
            smallest.value = b.value;
        }
        if (b.value >= c.value) {
            smallest.value = c.value;
        }
        if (c.value >= d.value) {
            smallest.value = d.value;
        } else if (a.value >= d.value) {
            smallest.value = d.value;
        }
        output += (String.format("%d is the smallest\n", smallest.value));
        if (true)
            return;
        ;
    }

    // smallest_88394fc0_003.java
    public void exec24() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        IntObj smallest = new IntObj();
        smallest.value = a.value;
        if (a.value > b.value) {
            smallest.value = b.value;
        }
        if (b.value > c.value) {
            smallest.value = c.value;
        }
        if (c.value > d.value) {
            smallest.value = d.value;
        } else if (a.value > d.value) {
            smallest.value = d.value;
        }
        output += (String.format("%d is the smallest\n", smallest.value));
        if (true)
            return;
        ;
    }

    // smallest_88394fc0_007.java
    public void exec25() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format("%d is the smallest number\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format("%d is the smallest number\n", b.value));
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            output += (String.format("%d is the smallest number\n", c.value));
        } else if (d.value < a.value && d.value < b.value && d.value < c.value) {
            output += (String.format("%d is the smallest number\n", d.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_c868b30a_000.java
    public void exec26() throws Exception {
        IntObj x = new IntObj(), i = new IntObj(), smallest = new IntObj(), j =
                new IntObj(), k = new IntObj(), temp = new IntObj();
        int[] numbers = new int[4];
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        for (i.value = 0; i.value < 3; i.value++) {
            x.value = scanner.nextInt();
            numbers[i.value] = x.value;
        }
        for (k.value = 3; k.value > 0; k.value--) {
            for (j.value = 1; j.value <= k.value; j.value++) {
                if (numbers[j.value - 1] > numbers[j.value]) {
                    temp.value = numbers[j.value - 1];
                    numbers[j.value - 1] = numbers[j.value];
                    numbers[j.value] = temp.value;
                }
            }
        }
        smallest.value = numbers[0];
        output += (String.format("%d is the smallest\n", smallest.value));
        if (true)
            return;
        ;
    }

    // smallest_97f6b152_003.java
    public void exec27() throws Exception {
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 =
                new IntObj(), num4 = new IntObj(), small = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        num4.value = scanner.nextInt();
        if (num1.value < num2.value && num1.value < num3.value
                && num1.value < num4.value) {
            small.value = num1.value;
        } else if (num2.value < num1.value && num2.value < num3.value
                && num2.value < num4.value) {
            small.value = num2.value;
        } else if (num3.value < num1.value && num3.value < num2.value
                && num3.value < num4.value) {
            small.value = num3.value;
        } else {
            small.value = num4.value;
        }
        output += (String.format("%d is the smallest\n", small.value));
        if (true)
            return;
        ;
    }

    // smallest_9013bd3b_000.java
    public void exec28() throws Exception {
        IntObj first = new IntObj(), second = new IntObj(), third =
                new IntObj(), fourth = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        first.value = scanner.nextInt();
        second.value = scanner.nextInt();
        third.value = scanner.nextInt();
        fourth.value = scanner.nextInt();
        if ((first.value < second.value) && (first.value < third.value)
                && (first.value < fourth.value)) {
            output += (String.format("%d is the smallest\n", first.value));
        }
        if ((second.value < first.value) && (second.value < third.value)
                && (second.value < fourth.value)) {
            output += (String.format("%d is the smallest\n", second.value));
        }
        if ((third.value < first.value) && (third.value < second.value)
                && (third.value < fourth.value)) {
            output += (String.format("%d is the smallest\n", third.value));
        }
        if ((fourth.value < third.value) && (fourth.value < second.value)
                && (fourth.value < first.value)) {
            output += (String.format("%d is the smallest\n", fourth.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_d009aa71_001.java
    public void exec29() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if ((a.value < b.value) && (a.value < c.value) && (a.value < d.value)) {
            output += (String.format("%d is the smallest\n", a.value));
        } else if ((b.value < a.value) && (b.value < c.value)
                && (b.value < d.value)) {
            output += (String.format("%d is the smallest\n", b.value));
        } else if ((c.value < a.value) && (c.value < b.value)
                && (c.value < d.value)) {
            output += (String.format("%d is the smallest\n", c.value));
        } else if ((d.value < a.value) && (d.value < b.value)
                && (d.value < c.value)) {
            output += (String.format("%d is the smallest\n", d.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_818f8cf4_002.java
    public void exec30() throws Exception {
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 =
                new IntObj(), num4 = new IntObj(), num_smallest = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        num4.value = scanner.nextInt();
        if ((num1.value < num2.value) && (num1.value < num3.value)
                && (num1.value < num4.value)) {
            num_smallest.value = num1.value;
            output += (String.format("%d is the smallest\n", num_smallest.value));
        } else if ((num2.value < num1.value) && (num2.value < num3.value)
                && (num2.value < num4.value)) {
            num_smallest.value = num2.value;
            output += (String.format("%d is the smallest\n", num_smallest.value));
        } else if ((num3.value < num1.value) && (num3.value < num2.value)
                && (num3.value < num4.value)) {
            num_smallest.value = num3.value;
            output += (String.format("%d is the smallest\n", num_smallest.value));
        } else if ((num4.value < num1.value) && (num4.value < num2.value)
                && (num4.value < num3.value)) {
            num_smallest.value = num1.value;
            output += (String.format("%d is the smallest\n", num_smallest.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_818f8cf4_003.java
    public void exec31() throws Exception {
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 =
                new IntObj(), num4 = new IntObj(), num_smallest = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        num4.value = scanner.nextInt();
        if ((num1.value <= num2.value) && (num1.value <= num3.value)
                && (num1.value <= num4.value)) {
            num_smallest.value = num1.value;
            output += (String.format("%d is the smallest\n", num_smallest.value));
        } else if ((num2.value <= num1.value) && (num2.value <= num3.value)
                && (num2.value <= num4.value)) {
            num_smallest.value = num2.value;
            output += (String.format("%d is the smallest\n", num_smallest.value));
        } else if ((num3.value <= num1.value) && (num3.value <= num2.value)
                && (num3.value <= num4.value)) {
            num_smallest.value = num3.value;
            output += (String.format("%d is the smallest\n", num_smallest.value));
        } else if ((num4.value <= num1.value) && (num4.value <= num2.value)
                && (num4.value <= num3.value)) {
            num_smallest.value = num1.value;
            output += (String.format("%d is the smallest\n", num_smallest.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_48b82975_001.java
    public void exec32() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj(), r = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            r.value = a.value;
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            r.value = b.value;
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            r.value = c.value;
        } else {
            r.value = d.value;
        }
        output += (String.format("%d is the smallest\n", r.value));
        if (true)
            return;
        ;
    }

    // smallest_48b82975_000.java
    public void exec33() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj(), r = new IntObj();
        output +=
                (String.format("Please enter 4 numbers seperated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            r.value = a.value;
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            r.value = b.value;
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            r.value = c.value;
        } else {
            r.value = d.value;
        }
        output += (String.format("%d is the smallest\n", r.value));
        if (true)
            return;
        ;
    }

    // smallest_30074a0e_007.java
    public void exec34() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format("%d is the smallest\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format("%d is the smallest\n", b.value));
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            output += (String.format("%d is the smallest\n", c.value));
        } else if (d.value < a.value && d.value < c.value && d.value < b.value) {
            output += (String.format("%d is the smallest\n", d.value));
        } else {
            output += (String.format("I don't know what I'm doing. \n"));
        }
        if (true)
            return;
        ;
    }

    // smallest_30074a0e_000.java
    public void exec35() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format("%d is the smallest integer\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format("%d is the smallest integer\n", b.value));
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            output += (String.format("%d is the smallest integer\n", c.value));
        } else if (d.value < a.value && d.value < c.value && d.value < b.value) {
            output += (String.format("%d is the smallest integer\n", d.value));
        } else {
            output += (String.format("I don't know what I'm doing. \n"));
        }
        if (true)
            return;
        ;
    }

    // smallest_dedc2a7c_000.java
    public void exec36() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        if ((a.value < b.value) && (a.value < c.value) && (a.value < d.value)) {
            output += (String.format("%.0f is the smallest\n", a.value));
        } else if ((b.value < a.value) && (b.value < c.value)
                && (b.value < d.value)) {
            output += (String.format("%.0f is the smallest\n", b.value));
        } else if ((c.value < a.value) && (c.value < b.value)
                && (c.value < d.value)) {
            output += (String.format("%.0f is the smallest\n", c.value));
        } else {
            output += (String.format("%.0f is the smallest\n", d.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_2694af73_000.java
    public void exec37() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value < b.value && a.value < c.value && a.value < d.value) {
            output += (String.format("%d is the smallest\n", a.value));
        } else if (b.value < a.value && b.value < c.value && b.value < d.value) {
            output += (String.format("%d is the smallest\n", b.value));
        } else if (c.value < a.value && c.value < b.value && c.value < d.value) {
            output += (String.format("%d is the smallest\n", c.value));
        } else if (d.value < a.value && d.value < b.value && d.value < c.value) {
            output += (String.format("%d is the smallest\n", d.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_3b2376ab_006.java
    public void exec38() throws Exception {
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj(), n4 =
                new IntObj(), small = new IntObj();
        output +=
                (String.format("Please enter 4 numbers seperated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        n4.value = scanner.nextInt();
        small.value = n1.value;
        if (n2.value < n1.value) {
            small.value = n2.value;
        }
        if (n3.value < n2.value) {
            small.value = n3.value;
        }
        if (n4.value < n3.value) {
            small.value = n4.value;
        } else if (n4.value < n1.value) {
            small.value = n4.value;
        }
        output += (String.format("%d is the smallest", small.value));
        if (true)
            return;
        ;
    }

    // smallest_3b2376ab_003.java
    public void exec39() throws Exception {
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj(), n4 =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers seperated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        n4.value = scanner.nextInt();
        if (n1.value < n2.value && n1.value < n3.value && n1.value < n4.value) {
            output += (String.format("%d is the smallest", n1.value));
        } else if (n2.value < n1.value && n2.value < n3.value
                && n2.value < n4.value) {
            output += (String.format("%d is the smallest", n2.value));
        } else if (n3.value < n1.value && n3.value < n2.value
                && n3.value < n4.value) {
            output += (String.format("%d is the smallest", n3.value));
        } else {
            output += (String.format("%d is the smallest", n4.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_3b2376ab_007.java
    public void exec40() throws Exception {
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj(), n4 =
                new IntObj(), small = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        n4.value = scanner.nextInt();
        small.value = n1.value;
        if (n2.value < n1.value) {
            small.value = n2.value;
        }
        if (n3.value < n2.value) {
            small.value = n3.value;
        }
        if (n4.value < n3.value) {
            small.value = n4.value;
        } else if (n4.value < n1.value) {
            small.value = n4.value;
        }
        output += (String.format("%d is the smallest\n", small.value));
        if (true)
            return;
        ;
    }

    // smallest_3b2376ab_008.java
    public void exec41() throws Exception {
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj(), n4 =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        n4.value = scanner.nextInt();
        if (n1.value < n2.value && n1.value < n3.value && n1.value < n4.value) {
            output += (String.format("%d is the smallest ", n1.value));
        } else if (n2.value < n1.value && n2.value < n3.value
                && n2.value < n4.value) {
            output += (String.format("%d is the smallest", n2.value));
        } else if (n3.value < n1.value && n3.value < n2.value
                && n3.value < n4.value) {
            output += (String.format("%d is the smallest", n3.value));
        } else {
            output += (String.format("%d is the smallest", n4.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_af81ffd4_000.java
    public void exec42() throws Exception {
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c =
                new DoubleObj(), d = new DoubleObj(), m = new DoubleObj(), n =
                new DoubleObj(), p = new DoubleObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        if (a.value > b.value) {
            m.value = b.value;
        } else if (a.value < b.value) {
            m.value = a.value;
        }
        if (m.value > c.value) {
            n.value = c.value;
        } else if (m.value < c.value) {
            n.value = m.value;
        }
        if (n.value > d.value) {
            p.value = d.value;
        } else if (n.value < d.value) {
            p.value = n.value;
        }
        output += (String.format("%.0f is the smallest\n", p.value));
        if (true)
            return;
        ;
    }

    // smallest_769cd811_002.java
    public void exec43() throws Exception {
        IntObj x = new IntObj(), y = new IntObj(), z = new IntObj(), t =
                new IntObj(), a = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        x.value = scanner.nextInt();
        y.value = scanner.nextInt();
        z.value = scanner.nextInt();
        t.value = scanner.nextInt();
        if (x.value >= y.value) {
            a.value = y.value;
        } else {
            a.value = x.value;
        }
        if (y.value >= z.value) {
            a.value = z.value;
        }
        if (z.value >= t.value) {
            a.value = t.value;
        }
        output += (String.format("%d is the smallest \n", a.value));
        if (true)
            return;
        ;
    }

    // smallest_769cd811_009.java
    public void exec44() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj(), x = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value > b.value) {
            x.value = b.value;
        } else {
            x.value = a.value;
        }
        if (b.value > c.value) {
            x.value = c.value;
        }
        if (c.value > d.value) {
            x.value = d.value;
        }
        output += (String.format("%d is the smallest\n", x.value));
        if (true)
            return;
        ;
    }

    // smallest_769cd811_004.java
    public void exec45() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj(), x = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value >= b.value) {
            x.value = b.value;
        } else {
            x.value = a.value;
        }
        if (b.value >= c.value) {
            x.value = c.value;
        }
        if (c.value >= d.value) {
            x.value = d.value;
        }
        output += (String.format("%d is the smallest\n", a.value));
        if (true)
            return;
        ;
    }

    // smallest_769cd811_003.java
    public void exec46() throws Exception {
        IntObj x = new IntObj(), y = new IntObj(), z = new IntObj(), t =
                new IntObj(), a = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        x.value = scanner.nextInt();
        y.value = scanner.nextInt();
        z.value = scanner.nextInt();
        t.value = scanner.nextInt();
        if (x.value >= y.value) {
            a.value = y.value;
        } else {
            a.value = x.value;
        }
        if (y.value >= z.value) {
            a.value = z.value;
        }
        if (z.value >= t.value) {
            a.value = t.value;
        }
        output += (String.format("%d is the smallest\n", a.value));
        if (true)
            return;
        ;
    }

    // smallest_769cd811_007.java
    public void exec47() throws Exception {
        IntObj x = new IntObj(), y = new IntObj(), z = new IntObj(), t =
                new IntObj(), a = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        x.value = scanner.nextInt();
        y.value = scanner.nextInt();
        z.value = scanner.nextInt();
        t.value = scanner.nextInt();
        if (x.value > y.value) {
            a.value = y.value;
        } else {
            a.value = x.value;
        }
        if (y.value > z.value) {
            a.value = z.value;
        }
        if (z.value > t.value) {
            a.value = t.value;
        }
        output += (String.format("%d is the smallest\n", a.value));
        if (true)
            return;
        ;
    }

    // smallest_769cd811_010.java
    public void exec48() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj(), x = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if (a.value >= b.value) {
            x.value = b.value;
        } else {
            x.value = a.value;
        }
        if (b.value >= c.value) {
            x.value = c.value;
        }
        if (c.value >= d.value) {
            x.value = d.value;
        }
        output += (String.format("%d is the smallest\n", x.value));
        if (true)
            return;
        ;
    }

    // smallest_93f87bf2_000.java
    public void exec49() throws Exception {
        IntObj first = new IntObj(), second = new IntObj(), third =
                new IntObj(), fourth = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        first.value = scanner.nextInt();
        second.value = scanner.nextInt();
        third.value = scanner.nextInt();
        fourth.value = scanner.nextInt();
        if (first.value < second.value && first.value < third.value
                && first.value < fourth.value) {
            output += (String.format("%d is the smallest \n ", first.value));
        } else if (second.value < first.value && second.value < third.value
                && second.value < fourth.value) {
            output += (String.format("%d is the smallest \n ", second.value));
        } else if (third.value < first.value && third.value < second.value
                && third.value < fourth.value) {
            output += (String.format("%d is the smallest \n ", third.value));
        } else if (fourth.value < first.value && fourth.value < second.value
                && fourth.value < third.value) {
            output += (String.format("%d is the smallest \n ", fourth.value));
        }
        if (true)
            return;
        ;
    }

    // smallest_ea67b841_003.java
    public void exec50() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj(), SN = new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if ((a.value < b.value) && (a.value < c.value) && (a.value < d.value)) {
            SN.value = a.value;
        } else if ((b.value < a.value) && (b.value < c.value)
                && (b.value < d.value)) {
            SN.value = b.value;
        } else if ((c.value < a.value) && (c.value < b.value)
                && (c.value < d.value)) {
            SN.value = c.value;
        } else {
            SN.value = d.value;
        }
        output += (String.format("%d is the smallest\n", SN.value));
        if (true)
            return;
        ;
    }

    // smallest_84602125_007.java
    public void exec51() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if ((a.value < b.value) && (a.value < c.value) && (a.value < d.value)) {
            output += (String.format("%d is the smallest\n", a.value));
        } else if ((b.value < a.value) && (b.value < c.value)
                && (b.value < d.value)) {
            output += (String.format("%d is the smallest\n", b.value));
        } else if ((c.value < b.value) && (c.value < a.value)
                && (c.value < d.value)) {
            output += (String.format("%d is the smallest\n", c.value));
        } else if ((d.value < b.value) && (d.value < c.value)
                && (d.value < a.value)) {
            output += (String.format("%d is the smallest\n", d.value));
        }
        if (true)
            return;
        ;
    }
}
