package com.mxy;

public class median {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main(String[] args) throws Exception {
//        median mainClass = new median();
//        String output;
//        if(args.length > 0) {
//            mainClass.scanner = new java.util.Scanner(args[0]);
//        } else {
//            mainClass.scanner = new java.util.Scanner(System.in);
//        }
//        mainClass.exec0();
//        System.out.println(mainClass.output);
    }

    // median_d120480a_000.java
    public void exec0() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), median =
                new IntObj(), temp = new IntObj();
        median.value = 0;
        temp.value = 0;
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if (a.value >= b.value) {
            temp.value = b.value;
            b.value = a.value;
            a.value = temp.value;
        }
        if (a.value < c.value) {
            median.value = b.value;
        } else if (b.value > c.value) {
            median.value = a.value;
        } else {
            median.value = c.value;
        }
        output += (String.format("%d is the median\n", median.value));
        if (true)
            return;
        ;
    }

    // median_89b1a701_003.java
    public void exec1() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), m =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value >= b.value && a.value <= c.value)
                || (a.value >= c.value && a.value <= b.value)) {
            m.value = b.value;
        } else if ((b.value >= a.value && b.value <= c.value)
                || (b.value >= c.value && b.value <= a.value)) {
            m.value = b.value;
        } else {
            m.value = c.value;
        }
        output += (String.format("%d is the median\n", m.value));
        if (true)
            return;
        ;
    }

    // median_89b1a701_007.java
    public void exec2() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), m =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value >= b.value && a.value <= c.value)
                || (a.value >= c.value && a.value <= b.value)) {
            m.value = b.value;
        } else if ((b.value >= a.value && b.value <= c.value)
                || (b.value >= c.value && b.value <= a.value)) {
            m.value = b.value;
        } else if ((c.value >= a.value && c.value <= b.value)
                || (c.value >= b.value && c.value <= a.value)) {
            m.value = c.value;
        }
        output += (String.format("%d is the median\n", m.value));
        if (true)
            return;
        ;
    }

    // median_89b1a701_010.java
    public void exec3() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), m =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if (a.value == b.value || a.value == c.value) {
            m.value = a.value;
        } else if (b.value == c.value || b.value == a.value) {
            m.value = b.value;
        } else if (c.value == a.value || c.value == b.value) {
            m.value = c.value;
        } else {
            if ((a.value >= b.value && a.value <= c.value)
                    || (a.value >= c.value && a.value <= b.value)) {
                m.value = b.value;
            } else if ((b.value >= a.value && b.value <= c.value)
                    || (b.value >= c.value && b.value <= a.value)) {
                m.value = b.value;
            } else if ((c.value >= a.value && c.value <= b.value)
                    || (c.value >= b.value && c.value <= a.value)) {
                m.value = c.value;
            }
        }
        output += (String.format("%d is the median\n", m.value));
        if (true)
            return;
        ;
    }

    // median_15cb07a7_003.java
    public void exec4() throws Exception {
        IntObj frst = new IntObj(), scnd = new IntObj(), thrd =
                new IntObj(), cmp1 = new IntObj(), cmp2 = new IntObj(), med =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        frst.value = scanner.nextInt();
        scnd.value = scanner.nextInt();
        thrd.value = scanner.nextInt();
        if (frst.value <= scnd.value) {
            cmp1.value = frst.value;
        } else {
            cmp1.value = scnd.value;
        }
        if (scnd.value <= thrd.value) {
            cmp2.value = scnd.value;
        } else {
            cmp2.value = thrd.value;
        }
        if (cmp1.value >= cmp2.value) {
            med.value = cmp1.value;
        } else {
            med.value = cmp2.value;
        }
        output +=
                (String.format("%d is lesser of first 2\n%d is lesser of second 2\n",
                        cmp1.value, cmp2.value));
        output += (String.format("%d is the median\n", med.value));
        if (true)
            return;
        ;
    }

    // median_6e464f2b_003.java
    public void exec5() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value > b.value && a.value < c.value)
                || (a.value < b.value && a.value > c.value)) {
            output += (String.format("%d is the median\n", a.value));
        } else if ((b.value > a.value && b.value < c.value)
                || (b.value < a.value && b.value > c.value)) {
            output += (String.format("%d is the median\n", b.value));
        } else {
            output += (String.format("%d is the median\n", c.value));
        }
        if (true)
            return;
        ;
    }

    // median_9c9308d4_003.java
    public void exec6() throws Exception {
        DoubleObj n1 = new DoubleObj(), n2 = new DoubleObj(), n3 =
                new DoubleObj(), median = new DoubleObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextDouble();
        n2.value = scanner.nextDouble();
        n3.value = scanner.nextDouble();
        if (n1.value >= n2.value || n1.value >= n3.value) {
            if (n2.value >= n3.value && n1.value >= n2.value) {
                median.value = n2.value;
            } else {
                median.value = n1.value;
            }
        } else if (n2.value >= n3.value) {
            median.value = n3.value;
        } else {
            median.value = n2.value;
        }
        output += (String.format(" %.0f is the median\n", median.value));
    }

    // median_9c9308d4_007.java
    public void exec7() throws Exception {
        DoubleObj n1 = new DoubleObj(), n2 = new DoubleObj(), n3 =
                new DoubleObj(), median = new DoubleObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextDouble();
        n2.value = scanner.nextDouble();
        n3.value = scanner.nextDouble();
        if (n1.value >= n2.value || n1.value >= n3.value) {
            if (n2.value >= n3.value && n1.value >= n2.value) {
                median.value = n2.value;
            } else {
                median.value = n1.value;
            }
        } else if (n2.value >= n3.value) {
            median.value = n3.value;
        } else {
            median.value = n2.value;
        }
        output += (String.format(" %.0f is the median\n", median.value));
        if (true)
            return;
        ;
    }

    // median_9c9308d4_012.java
    public void exec8() throws Exception {
        DoubleObj n1 = new DoubleObj(), n2 = new DoubleObj(), n3 =
                new DoubleObj(), median = new DoubleObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextDouble();
        n2.value = scanner.nextDouble();
        n3.value = scanner.nextDouble();
        if (n1.value >= n2.value || n1.value >= n3.value) {
            if (n2.value >= n3.value && n1.value >= n2.value) {
                median.value = n2.value;
            } else if (n2.value >= n1.value) {
                median.value = n1.value;
            } else {
                median.value = n3.value;
            }
        } else if (n2.value >= n3.value) {
            median.value = n3.value;
        } else {
            median.value = n2.value;
        }
        output += (String.format("%.0f is the median\n", median.value));
        if (true)
            return;
        ;
    }

    // median_1bf73a9c_003.java
    public void exec9() throws Exception {
        IntObj first = new IntObj(), second = new IntObj(), third =
                new IntObj(), ans = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        first.value = scanner.nextInt();
        second.value = scanner.nextInt();
        third.value = scanner.nextInt();
        if ((first.value > second.value && first.value < third.value)
                || (first.value > third.value && first.value < second.value)) {
            ans.value = first.value;
        } else if ((second.value > first.value && second.value < third.value)
                || (second.value > third.value && second.value < first.value)) {
            ans.value = second.value;
        } else {
            ans.value = third.value;
        }
        output += (String.format("%d is the median\n", ans.value));
        if (true)
            return;
        ;
    }

    // median_1bf73a9c_000.java
    public void exec10() throws Exception {
        IntObj first = new IntObj(), second = new IntObj(), third =
                new IntObj(), ans = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separeted by spaces > "));
        first.value = scanner.nextInt();
        second.value = scanner.nextInt();
        third.value = scanner.nextInt();
        if ((first.value > second.value && first.value < third.value)
                || (first.value > third.value && first.value < second.value)) {
            ans.value = first.value;
        } else if ((second.value > first.value && second.value < third.value)
                || (second.value > third.value && second.value < first.value)) {
            ans.value = second.value;
        } else {
            ans.value = third.value;
        }
        output += (String.format("%d is the median\n", ans.value));
        if (true)
            return;
        ;
    }

    // median_3cf6d33a_007.java
    public void exec11() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value > b.value && b.value > c.value)
                || (c.value > b.value && b.value > a.value)) {
            output += (String.format("%d is the median\n", b.value));
        } else if ((b.value > a.value && a.value > c.value)
                || (c.value > a.value && a.value > b.value)) {
            output += (String.format("%d is the median\n", a.value));
        } else if ((a.value > c.value && c.value > b.value)
                || (b.value > c.value && c.value > a.value)) {
            output += (String.format("%d is the median\n", c.value));
        }
        if (true)
            return;
        ;
    }

    // median_68eb0bb0_000.java
    public void exec12() throws Exception {
        IntObj x = new IntObj(), y = new IntObj(), z = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by space  > "));
        x.value = scanner.nextInt();
        y.value = scanner.nextInt();
        z.value = scanner.nextInt();
        if (x.value >= y.value && x.value <= z.value) {
            output += (String.format("%d is the median\n", x.value));
        } else if (y.value >= x.value && y.value <= z.value) {
            output += (String.format("%d is the median\n", y.value));
        } else {
            output += (String.format("%d is the median\n", z.value));
        }
        if (true)
            return;
        ;
    }

    // median_1b31fa5c_000.java
    public void exec13() throws Exception {
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        if ((((num1.value > num2.value) && (num1.value < num3.value)))
                || ((num1.value > num3.value) && (num1.value < num2.value))) {
            output += (String.format("%d is the median\n", num1.value));
            if (true)
                return;
            ;
        } else if ((((num2.value > num1.value) && (num2.value < num3.value)))
                || ((num2.value > num3.value) && (num2.value < num1.value))) {
            output += (String.format("%d is the median\n", num2.value));
            if (true)
                return;
            ;
        } else if ((((num3.value > num2.value) && (num3.value < num1.value)))
                || ((num3.value > num1.value) && (num3.value < num2.value))) {
            output += (String.format("%d is the median\n", num3.value));
            if (true)
                return;
            ;
        }
        if (true)
            return;
        ;
    }

    // median_95362737_003.java
    public void exec14() throws Exception {
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj();
        output +=
                (String.format("Please eneter 3 numbers separated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        if (n1.value == n2.value || n1.value == n3.value
                || (n2.value < n1.value && n1.value < n3.value)
                || (n3.value < n1.value && n1.value < n2.value)) {
            output += (String.format("%d is the median\n", n1.value));
        } else if (n2.value == n3.value
                || (n1.value < n2.value && n2.value < n3.value)
                || (n3.value < n2.value && n2.value < n1.value)) {
            output += (String.format("%d is the median\n", n2.value));
        } else if (n1.value < n3.value && n3.value < n2.value) {
            output += (String.format("%d is the median\n", n3.value));
        }
        if (true)
            return;
        ;
    }

    // median_95362737_000.java
    public void exec15() throws Exception {
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj();
        output +=
                (String.format("Please eneter 3 numbers separated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        if (n1.value == n2.value || n1.value == n3.value || n2.value < n1.value
                && n1.value < n3.value || n3.value < n1.value && n1.value < n2.value) {
            output += (String.format("%d is the median\n", n1.value));
        } else if (n2.value == n3.value || n1.value < n2.value
                && n2.value < n3.value || n3.value < n2.value
                && n2.value < n1.value) {
            output += (String.format("%d is the median\n", n2.value));
        } else if (n1.value < n3.value && n3.value < n2.value) {
            output += (String.format("%d is the median\n", n3.value));
        }
        if (true)
            return;
        ;
    }

    // median_90a14c1a_000.java
    public void exec16() throws Exception {
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        if ((n1.value > n2.value) && (n1.value > n3.value)
                && (n2.value > n3.value)) {
            output += (String.format("%d is the median\n", n2.value));
        } else if ((n1.value > n2.value) && (n1.value > n3.value)
                && (n3.value > n2.value)) {
            output += (String.format("%d is the median\n", n3.value));
        } else if ((n2.value > n1.value) && (n2.value > n3.value)
                && (n3.value > n1.value)) {
            output += (String.format("%d is the median\n", n3.value));
        } else if ((n2.value > n1.value) && (n2.value > n3.value)
                && (n1.value > n3.value)) {
            output += (String.format("%d is the median\n", n1.value));
        } else if ((n3.value > n1.value) && (n3.value > n2.value)
                && (n1.value > n2.value)) {
            output += (String.format("%d is the median\n", n1.value));
        } else if ((n3.value > n1.value) && (n3.value > n2.value)
                && (n2.value > n1.value)) {
            output += (String.format("%d is the median\n", n2.value));
        }
        if (true)
            return;
        ;
    }

    // median_317aa705_002.java
    public void exec17() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), temp1 =
                new IntObj(), temp2 = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        temp1.value = a.value;
        temp2.value = b.value;
        if (a.value > c.value) {
            a.value = b.value;
            b.value = temp1.value;
        }
        if (b.value > c.value) {
            b.value = c.value;
            c.value = temp2.value;
        }
        if (a.value > b.value) {
            a.value = b.value;
            b.value = temp1.value;
        }
        output += (String.format("%d is the median", b.value));
        if (true)
            return;
        ;
    }

    // median_317aa705_003.java
    public void exec18() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((b.value > a.value && b.value < c.value)
                || (b.value < a.value && b.value > c.value)) {
            output += (String.format("%d is the median", b.value));
        }
        if ((c.value > a.value && c.value < b.value)
                || (c.value < a.value && c.value > b.value)) {
            output += (String.format("%d is the median", c.value));
        }
        if ((a.value > b.value && a.value < c.value)
                || (a.value < b.value && a.value > c.value)) {
            output += (String.format("%d is the median", a.value));
        }
        if (true)
            return;
        ;
    }

    // median_317aa705_000.java
    public void exec19() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), temp1 =
                new IntObj(), temp2 = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        temp1.value = a.value;
        temp2.value = b.value;
        if (a.value > b.value) {
            a.value = b.value;
            b.value = temp1.value;
        }
        if (b.value > c.value) {
            b.value = c.value;
            c.value = temp2.value;
        }
        if (a.value > b.value) {
            a.value = b.value;
            b.value = temp1.value;
        }
        output += (String.format("%d is the median", b.value));
        if (true)
            return;
        ;
    }

    // median_e9c6206d_001.java
    public void exec20() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value < b.value && b.value < c.value)
                || (c.value < b.value && b.value < a.value)) {
            output += (String.format("%d is the median\n", b.value));
        } else if ((b.value < a.value && a.value < c.value)
                || (c.value < a.value && a.value < b.value)) {
            output += (String.format("%d is the median\n", a.value));
        } else if ((a.value < c.value && c.value < b.value)
                || (b.value < c.value && c.value < a.value)) {
            output += (String.format("%d is the median\n", c.value));
        }
        if (true)
            return;
        ;
    }

    // median_e9c6206d_000.java
    public void exec21() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value < b.value && b.value < c.value)
                || (c.value < b.value && b.value < a.value)) {
            output += (String.format("%d is the median\n", b.value));
        } else if ((b.value < a.value && a.value < c.value)
                || (c.value < a.value && a.value < b.value)) {
            output += (String.format("%d is the smallest\n", a.value));
        } else if ((a.value < c.value && c.value < b.value)
                || (b.value < c.value && c.value < a.value)) {
            output += (String.format("%d is the smallest\n", c.value));
        }
        if (true)
            return;
        ;
    }

    // median_36d8008b_000.java
    public void exec22() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if (a.value < b.value && a.value > c.value || a.value > b.value
                && a.value < c.value) {
            d.value = a.value;
        } else if (b.value > a.value && b.value < c.value || b.value < a.value
                && b.value > c.value) {
            d.value = b.value;
        } else {
            d.value = c.value;
        }
        output += (String.format("%d is the median\n", d.value));
        if (true)
            return;
        ;
    }

    // median_fe9d5fb9_002.java
    public void exec23() throws Exception {
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 =
                new IntObj(), median = new IntObj(), big = new IntObj(), small =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        if (num1.value >= num2.value) {
            small.value = num2.value;
            big.value = num1.value;
        } else {
            big.value = num2.value;
            small.value = num2.value;
        }
        if (num3.value >= big.value) {
            median.value = big.value;
        } else if (num3.value <= small.value) {
            median.value = small.value;
        } else {
            median.value = num3.value;
        }
        output += (String.format("%d is the median\n", median.value));
        if (true)
            return;
        ;
    }

    // median_fe9d5fb9_000.java
    public void exec24() throws Exception {
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 =
                new IntObj(), median = new IntObj(), big = new IntObj(), small =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        if (num1.value > num2.value) {
            small.value = num2.value;
            big.value = num1.value;
        } else {
            big.value = num2.value;
            small.value = num2.value;
        }
        if (num3.value > big.value) {
            median.value = big.value;
        } else if (num3.value < small.value) {
            median.value = small.value;
        } else {
            median.value = num3.value;
        }
        output += (String.format("%d is the median\n", median.value));
        if (true)
            return;
        ;
    }

    // median_0cdfa335_003.java
    public void exec25() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), median =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value >= b.value && a.value <= c.value)
                || (a.value >= c.value && a.value <= b.value)) {
            median.value = a.value;
        }
        if ((b.value >= a.value && b.value <= c.value)
                || (b.value >= c.value && b.value <= a.value)) {
            median.value = b.value;
        } else {
            median.value = c.value;
        }
        output += (String.format("%d is the median\n", median.value));
        if (true)
            return;
        ;
    }

    // median_c716ee61_002.java
    public void exec26() throws Exception {
        IntObj A = new IntObj(), B = new IntObj(), C = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        A.value = scanner.nextInt();
        B.value = scanner.nextInt();
        C.value = scanner.nextInt();
        if (A.value > B.value && A.value < C.value) {
            output += (String.format("%d is the median\n", A.value));
        }
        if (A.value > C.value && A.value < B.value) {
            output += (String.format("%d is the median\n", A.value));
        }
        if (B.value > C.value && B.value < A.value) {
            output += (String.format("%d is the median\n", B.value));
        }
        if (B.value > A.value && B.value < C.value) {
            output += (String.format("%d is the median\n", B.value));
        }
        if (C.value > A.value && C.value < B.value) {
            output += (String.format("%d is the median\n", C.value));
        }
        if (C.value > B.value && C.value < A.value) {
            output += (String.format("%d is the median\n", C.value));
        }
        if (true)
            return;
        ;
    }

    // median_c716ee61_001.java
    public void exec27() throws Exception {
        IntObj A = new IntObj(), B = new IntObj(), C = new IntObj();
        output +=
                (String.format("Pleaes enter 3 numbers separated by spaces > "));
        A.value = scanner.nextInt();
        B.value = scanner.nextInt();
        C.value = scanner.nextInt();
        if (A.value > B.value && A.value < C.value) {
            output += (String.format("%d is the median\n", A.value));
        }
        if (A.value > C.value && A.value < B.value) {
            output += (String.format("%d is the median\n", A.value));
        }
        if (B.value > C.value && B.value < A.value) {
            output += (String.format("%d is the median\n", B.value));
        }
        if (B.value > A.value && B.value < C.value) {
            output += (String.format("%d is the median\n", B.value));
        }
        if (C.value > A.value && C.value < B.value) {
            output += (String.format("%d is the median\n", C.value));
        }
        if (C.value > B.value && C.value < A.value) {
            output += (String.format("%d is the median\n", C.value));
        }
        if (true)
            return;
        ;
    }

    // median_c716ee61_000.java
    public void exec28() throws Exception {
        IntObj A = new IntObj(), B = new IntObj(), C = new IntObj();
        output +=
                (String.format("Pleaes enter 3 numbers seperated by spaces > "));
        A.value = scanner.nextInt();
        B.value = scanner.nextInt();
        C.value = scanner.nextInt();
        if (A.value > B.value && A.value < C.value) {
            output += (String.format("%d is the median\n", A.value));
        }
        if (A.value > C.value && A.value < B.value) {
            output += (String.format("%d is the median\n", A.value));
        }
        if (B.value > C.value && B.value < A.value) {
            output += (String.format("%d is the median\n", B.value));
        }
        if (B.value > A.value && B.value < C.value) {
            output += (String.format("%d is the median\n", B.value));
        }
        if (C.value > A.value && C.value < B.value) {
            output += (String.format("%d is the median\n", C.value));
        }
        if (C.value > B.value && C.value < A.value) {
            output += (String.format("%d is the median\n", C.value));
        }
        if (true)
            return;
        ;
    }

    // median_90834803_015.java
    public void exec29() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), median =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((b.value >= a.value && a.value >= c.value)
                || (c.value <= a.value && a.value <= b.value) || (a.value < b.value
                && a.value <
                c.value)) {
            output += (String.format("%d is the median\n", a.value));
        } else if ((a.value >= b.value && b.value >= c.value)
                || (a.value <= b.value && b.value <= c.value)
                || (b.value < c.value && b.value < a.value)) {
            output += (String.format("%d is the median\n", b.value));
        } else if ((a.value >= c.value && c.value >= b.value)
                || (a.value <= c.value && c.value <= b.value)
                || (c.value < a.value && c.value < b.value)) {
            output += (String.format("%d is the median\n", c.value));
        } else {
            if (true)
                return;
            ;
        }
        if (true)
            return;
        ;
    }

    // median_90834803_003.java
    public void exec30() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), median =
                new IntObj();
        output += (String.format("Enter first integer > "));
        a.value = scanner.nextInt();
        output += (String.format("Enter second integer > "));
        b.value = scanner.nextInt();
        output += (String.format("Enter third integer > "));
        c.value = scanner.nextInt();
        if ((a.value >= b.value && b.value >= c.value)
                || (a.value <= b.value && b.value <= c.value)) {
            output += (String.format("%d is the median\n", b.value));
        } else if ((b.value >= a.value && a.value >= c.value)
                || (c.value <= a.value && a.value <= b.value)) {
            output += (String.format("%d is the median\n", a.value));
        } else if ((a.value >= c.value && c.value >= b.value)
                || (a.value <= c.value && c.value <= b.value)) {
            output += (String.format("%d is the median\n", c.value));
        } else {
            if (true)
                return;
            ;
        }
        if (true)
            return;
        ;
    }

    // median_90834803_010.java
    public void exec31() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), median =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((b.value >= a.value && a.value >= c.value)
                || (c.value <= a.value && a.value <= b.value)) {
            output += (String.format("%d is the median\n", a.value));
        } else if ((a.value >= b.value && b.value >= c.value)
                || (a.value <= b.value && b.value <= c.value)) {
            output += (String.format("%d is the median\n", b.value));
        } else if ((a.value >= c.value && c.value >= b.value)
                || (a.value <= c.value && c.value <= b.value)) {
            output += (String.format("%d is the median\n", c.value));
        } else {
            if (true)
                return;
            ;
        }
        if (true)
            return;
        ;
    }

    // median_6aaeaf2f_000.java
    public void exec32() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), median =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if (((a.value > b.value) && (a.value < c.value))
                || ((a.value < b.value) && (a.value > c.value))) {
            median.value = a.value;
        } else if (((b.value > a.value) && (c.value > b.value))
                || ((b.value < a.value) && (b.value > c.value))) {
            median.value = b.value;
        } else {
            median.value = c.value;
        }
        output += (String.format("%d is the median\n", median.value));
        if (true)
            return;
        ;
    }

    // median_aaceaf4a_003.java
    public void exec33() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value > b.value) && (a.value < c.value)) {
            output += (String.format("%d is the median\n", a.value));
        }
        if ((a.value > c.value) && (a.value < b.value)) {
            output += (String.format("%d is the median\n", a.value));
        }
        if ((b.value > a.value) && (b.value < c.value)) {
            output += (String.format("%d is the median\n", b.value));
        }
        if ((b.value > c.value) && (b.value < a.value)) {
            output += (String.format("%d is the median\n", b.value));
        }
        if ((c.value > b.value) && (c.value < a.value)) {
            output += (String.format("%d is the median\n", c.value));
        }
        if ((c.value > a.value) && (c.value < b.value)) {
            output += (String.format("%d is the median\n", c.value));
        }
        if (true)
            return;
        ;
    }

    // median_9013bd3b_000.java
    public void exec34() throws Exception {
        DoubleObj first = new DoubleObj(), second = new DoubleObj(), third =
                new DoubleObj();
        output +=
                (String.format("Please enter 3 numbers seperated by spaces > "));
        first.value = scanner.nextDouble();
        second.value = scanner.nextDouble();
        third.value = scanner.nextDouble();
        if ((first.value > second.value && first.value < third.value)
                || (first.value < second.value && first.value > third.value)) {
            output += (String.format("%.0f is the median\n", first.value));
        }
        if ((second.value > first.value && second.value < third.value)
                || (second.value < first.value && second.value > third.value)) {
            output += (String.format("%.0f is the median\n", second.value));
        }
        if ((third.value > first.value && third.value < second.value)
                || (third.value < first.value && third.value > second.value)) {
            output += (String.format("%.0f is the median\n", third.value));
        }
        if (true)
            return;
        ;
    }

    // median_cd2d9b5b_010.java
    public void exec35() throws Exception {
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 =
                new IntObj(), median = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        if ((num1.value < num2.value && num1.value > num3.value)
                || (num1.value > num2.value && num1.value < num3.value)) {
            median.value = num1.value;
        } else if ((num2.value < num1.value && num2.value > num3.value)
                || (num2.value > num1.value && num2.value < num3.value)) {
            median.value = num2.value;
        } else {
            median.value = num3.value;
        }
        output += (String.format("%d is the median", median.value));
        if (true)
            return;
        ;
    }

    // median_d009aa71_000.java
    public void exec36() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces  > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value < c.value) && (a.value > b.value)) {
            output += (String.format("%d is the median\n", a.value));
        } else if ((a.value < b.value) && (a.value > c.value)) {
            output += (String.format("%d is the median\n", a.value));
        }
        if ((b.value < a.value) && (b.value > c.value)) {
            output += (String.format("%d is the median\n", b.value));
        } else if ((b.value > a.value) && (b.value < c.value)) {
            output += (String.format("%d is the median\n", b.value));
        }
        if ((c.value > a.value) && (c.value < b.value)) {
            output += (String.format("%d is the median\n", c.value));
        } else if ((c.value < a.value) && (c.value > b.value)) {
            output += (String.format("%d is the median\n", c.value));
        }
        if (true)
            return;
        ;
    }

    // median_d2b889e1_000.java
    public void exec37() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), median =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value <= b.value && b.value < +c.value)
                || (c.value <= b.value && b.value <= a.value)) {
            median.value = b.value;
        } else if ((b.value <= c.value && c.value <= a.value)
                || (a.value <= c.value && c.value <= b.value)) {
            median.value = b.value;
        } else if ((c.value <= a.value && a.value <= b.value)
                || (b.value <= a.value && a.value <= c.value)) {
            median.value = c.value;
        }
        output += (String.format("%d is the median\n", median.value));
        if (true)
            return;
        ;
    }

    // median_48b82975_000.java
    public void exec38() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value <= b.value && b.value <= c.value)
                || (c.value <= b.value && b.value <= a.value)) {
            output += (String.format("%d is the median\n", b.value));
        }
        if ((b.value <= a.value && a.value <= c.value)
                || (c.value <= a.value && a.value <= b.value)) {
            output += (String.format("%d is the median\n", a.value));
        } else {
            output += (String.format("%d is the median\n", c.value));
        }
        if (true)
            return;
        ;
    }

    // median_30074a0e_000.java
    public void exec39() throws Exception {
        IntObj a = new IntObj();
        IntObj b = new IntObj();
        IntObj c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers seperated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value < b.value && b.value < c.value)
                || (b.value < a.value && c.value < b.value)) {
            output += (String.format("%d is the median\n", b.value));
        }
        if ((b.value < a.value && a.value < c.value)
                || (a.value < b.value && c.value < a.value)) {
            output += (String.format("%d is the median\n", a.value));
        }
        if ((a.value < c.value && c.value < b.value)
                || (b.value < c.value && c.value < a.value)) {
            output += (String.format("%d is the median\n", c.value));
        }
        if (true)
            return;
        ;
    }

    // median_1c2bb3a4_000.java
    public void exec40() throws Exception {
        IntObj x = new IntObj(), y = new IntObj(), z = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        x.value = scanner.nextInt();
        y.value = scanner.nextInt();
        z.value = scanner.nextInt();
        if (x.value == y.value) {
            output += (String.format("%d is the median\n", x.value));
        }
        if (x.value == z.value) {
            output += (String.format("%d is the median\n", x.value));
        }
        if (y.value == z.value) {
            output += (String.format("%d is the median\n", y.value));
        }
        if (true)
            return;
        ;
    }

    // median_d43d3207_000.java
    public void exec41() throws Exception {
        IntObj int1 = new IntObj(), int2 = new IntObj(), int3 = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        int1.value = scanner.nextInt();
        int2.value = scanner.nextInt();
        int3.value = scanner.nextInt();
        if ((int1.value < int2.value && int1.value > int3.value)
                || (int1.value > int2.value && int1.value < int3.value)) {
            output += (String.format("%d is the median\n", int1.value));
        } else if ((int2.value < int3.value && int2.value > int1.value)
                || (int2.value > int3.value && int2.value < int1.value)) {
            output += (String.format("%d is the median\n", int2.value));
        } else {
            output += (String.format("%d is the median\n", int3.value));
        }
        if (true)
            return;
        ;
    }

    // median_b6fd408d_001.java
    public void exec42() throws Exception {
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj(), temp =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        if (n2.value < n1.value) {
            temp.value = n2.value;
            n2.value = n1.value;
            n1.value = temp.value;
        }
        if ((n3.value < n2.value) && (n3.value >= n1.value)) {
            temp.value = n2.value;
            n2.value = n3.value;
            n3.value = temp.value;
        }
        output += (String.format("%d is the median\n", n2.value));
        if (true)
            return;
        ;
    }

    // median_b6fd408d_000.java
    public void exec43() throws Exception {
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj(), temp =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        if (n2.value < n1.value) {
            temp.value = n2.value;
            n2.value = n1.value;
            n1.value = temp.value;
        }
        if ((n3.value < n2.value) && (n3.value > n1.value)) {
            temp.value = n2.value;
            n2.value = n3.value;
            n3.value = temp.value;
        }
        output += (String.format("%d is the median\n", n2.value));
        if (true)
            return;
        ;
    }

    // median_3b2376ab_006.java
    public void exec44() throws Exception {
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj(), small =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        if (n1.value <= n2.value) {
            small.value = n1.value;
            if (small.value > n3.value) {
                output += (String.format("%d is the median\n", n1.value));
            } else if (n3.value > n2.value) {
                output += (String.format("%d is the median\n", n2.value));
            } else {
                output += (String.format("%d is the median\n", n3.value));
            }
        } else {
            small.value = n2.value;
            if (small.value > n3.value) {
                output += (String.format("%d is the median\n", n2.value));
            } else if (n3.value > n1.value) {
                output += (String.format("%d is the median\n", n1.value));
            } else {
                output += (String.format("%d IS the median\n", n3.value));
            }
        }
        if (true)
            return;
        ;
    }

    // median_3b2376ab_003.java
    public void exec45() throws Exception {
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj(), small =
                new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        if (n1.value < n2.value) {
            small.value = n1.value;
            if (small.value > n3.value) {
                output += (String.format("%d is the median\n", n1.value));
            } else if (n3.value > n2.value) {
                output += (String.format("%d is the median\n", n2.value));
            } else {
                output += (String.format("%d is the median\n", n3.value));
            }
        } else {
            small.value = n2.value;
            if (small.value > n3.value) {
                output += (String.format("%d is the median\n", n2.value));
            } else if (n3.value > n1.value) {
                output += (String.format("%d is the median\n", n3.value));
            } else {
                output += (String.format("%d is the median\n", n1.value));
            }
        }
        if (true)
            return;
        ;
    }

    // median_af81ffd4_004.java
    public void exec46() throws Exception {
        DoubleObj first = new DoubleObj(), second = new DoubleObj(), third =
                new DoubleObj();
        DoubleObj median = new DoubleObj();
        DoubleObj comp_fir = new DoubleObj(), comp_sec =
                new DoubleObj(), comp_thi = new DoubleObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        first.value = scanner.nextDouble();
        second.value = scanner.nextDouble();
        third.value = scanner.nextDouble();
        median.value =
                (Math.abs(first.value) + Math.abs(second.value) +
                        Math.abs(third.value)) / 3;
        comp_fir.value = Math.abs(first.value - median.value);
        comp_sec.value = Math.abs(second.value - median.value);
        comp_thi.value = Math.abs(third.value - median.value);
        if (comp_fir.value < comp_sec.value && comp_fir.value < comp_thi.value) {
            output += (String.format("%.0f is the median\n", first.value));
        } else if (comp_sec.value < comp_fir.value
                && comp_sec.value < comp_thi.value) {
            output += (String.format("%.0f is the median\n", second.value));
        } else if (comp_thi.value < comp_fir.value
                && comp_thi.value < comp_sec.value) {
            output += (String.format("%.0f is the median\n", third.value));
        }
        if (true)
            return;
        ;
    }

    // median_af81ffd4_007.java
    public void exec47() throws Exception {
        DoubleObj first = new DoubleObj(), second = new DoubleObj(), third =
                new DoubleObj();
        DoubleObj median = new DoubleObj();
        DoubleObj comp_fir = new DoubleObj(), comp_sec =
                new DoubleObj(), comp_thi = new DoubleObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        first.value = scanner.nextDouble();
        second.value = scanner.nextDouble();
        third.value = scanner.nextDouble();
        median.value = (first.value + second.value + third.value) / 3;
        comp_fir.value = Math.abs(first.value - median.value);
        comp_sec.value = Math.abs(second.value - median.value);
        comp_thi.value = Math.abs(third.value - median.value);
        if (comp_fir.value < comp_sec.value && comp_fir.value < comp_thi.value) {
            output += (String.format("%.0f is the median\n", first.value));
        } else if (comp_sec.value < comp_fir.value
                && comp_sec.value < comp_thi.value) {
            output += (String.format("%.0f is the median\n", second.value));
        } else if (comp_thi.value < comp_fir.value
                && comp_thi.value < comp_sec.value) {
            output += (String.format("%.0f is the median\n", third.value));
        }
        if (true)
            return;
        ;
    }

    // median_fcf701e8_002.java
    public void exec48() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        while (a.value < b.value && a.value < c.value) {
            if (b.value < c.value) {
                output += (String.format("%d is the median\n", b.value));
                break;
            } else {
                output += (String.format("%d is the median\n", c.value));
                break;
            }
        }
        while (b.value < a.value && b.value < c.value) {
            if (a.value < c.value) {
                output += (String.format("%d is the median\n", a.value));
                break;
            } else {
                output += (String.format("%d is the median\n", c.value));
                break;
            }
        }
        while (c.value < a.value && c.value < b.value) {
            if (b.value < a.value) {
                output += (String.format("%d is the median\n", b.value));
                break;
            } else {
                output += (String.format("%d is the median\n", a.value));
                break;
            }
        }
        if (true)
            return;
        ;
    }

    // median_fcf701e8_003.java
    public void exec49() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        while (a.value <= b.value && a.value <= c.value) {
            if (b.value < c.value) {
                output += (String.format("%d is the median\n", b.value));
                break;
            } else {
                output += (String.format("%d is the median\n", c.value));
                break;
            }
        }
        while (b.value <= a.value && b.value <= c.value) {
            if (a.value < c.value) {
                output += (String.format("%d is the median\n", a.value));
                break;
            } else {
                output += (String.format("%d is the median\n", c.value));
                break;
            }
        }
        while (c.value <= a.value && c.value <= b.value) {
            if (b.value < a.value) {
                output += (String.format("%d is the median\n", b.value));
                break;
            } else {
                output += (String.format("%d is the median\n", a.value));
                break;
            }
        }
        if (true)
            return;
        ;
    }

    // median_fcf701e8_000.java
    public void exec50() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter three integers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        while (a.value < b.value && a.value < c.value) {
            if (b.value < c.value) {
                output += (String.format("%d is the median\n", b.value));
                break;
            } else {
                output += (String.format("%d is the median\n", c.value));
                break;
            }
        }
        while (b.value < a.value && b.value < c.value) {
            if (a.value < c.value) {
                output += (String.format("%d is the median\n", a.value));
                break;
            } else {
                output += (String.format("%d is the median\n", c.value));
                break;
            }
        }
        while (c.value < a.value && c.value < b.value) {
            if (b.value < a.value) {
                output += (String.format("%d is the median\n", b.value));
                break;
            } else {
                output += (String.format("%d is the median\n", a.value));
                break;
            }
        }
        if (true)
            return;
        ;
    }

    // median_2c155667_000.java
    public void exec51() throws Exception {
        IntObj i1 = new IntObj(), i2 = new IntObj(), i3 = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        i1.value = scanner.nextInt();
        i2.value = scanner.nextInt();
        i3.value = scanner.nextInt();
        if ((i1.value >= i2.value && i1.value <= i3.value)
                || (i1.value == i2.value && i1.value == i3.value)
                || (i1.value > i2.value && i1.value < i3.value)) {
            output += (String.format("%d is the median\n", i1.value));
        } else if ((i2.value >= i1.value && i2.value <= i3.value)
                || (i2.value == i1.value && i2.value == i3.value)
                || (i2.value > i1.value && i2.value < i3.value)) {
            output += (String.format("%d is the median\n", i2.value));
        } else if ((i3.value >= i2.value && i3.value <= i1.value)
                || (i3.value == i2.value && i3.value == i1.value)
                || (i3.value > i2.value && i3.value < i1.value)) {
            output += (String.format("%d is the median\n", i3.value));
        }
        if (true)
            return;
        ;
    }

    // median_0cea42f9_003.java
    public void exec52() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if (((a.value > b.value) && (a.value < c.value))
                || ((a.value < b.value) && (a.value > c.value))) {
            output += (String.format("%d is the median\n", a.value));
        } else if (((b.value > a.value) && (b.value < c.value))
                || ((b.value < a.value) && (b.value > c.value))) {
            output += (String.format("%d is the median\n", b.value));
        } else if (((c.value > a.value) && (c.value < b.value))
                || ((c.value < a.value) && (c.value > b.value))) {
            output += (String.format("%d is the median\n", c.value));
        }
        if (true)
            return;
        ;
    }

    // median_93f87bf2_015.java
    public void exec53() throws Exception {
        IntObj int1 = new IntObj(), int2 = new IntObj(), int3 = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        int1.value = scanner.nextInt();
        int2.value = scanner.nextInt();
        int3.value = scanner.nextInt();
        if (((int1.value <= int2.value) && (int1.value >= int3.value))
                || ((int1.value <= int2.value) && (int1.value >= int3.value))) {
            output += (String.format("%d is the median \n", int1.value));
        } else if ((((int2.value <= int1.value)) && (int2.value >= int3.value))
                || ((int2.value <= int3.value) && (int2.value >= int1.value))) {
            output += (String.format("%d is the median \n", int2.value));
        } else if (((int3.value <= int1.value) && (int3.value >= int2.value))
                || ((int3.value <= int2.value) && (int3.value >= int1.value))) {
            output += (String.format("%d is the median \n", int3.value));
        }
        if (true)
            return;
        ;
    }

    // median_93f87bf2_012.java
    public void exec54() throws Exception {
        IntObj int1 = new IntObj(), int2 = new IntObj(), int3 = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        int1.value = scanner.nextInt();
        int2.value = scanner.nextInt();
        int3.value = scanner.nextInt();
        if (((int1.value <= int2.value) && (int1.value >= int3.value))
                || ((int1.value <= int2.value) && (int1.value >= int3.value))) {
            output += (String.format("%d is the median\n", int1.value));
        } else if ((((int2.value <= int1.value)) && (int2.value >= int3.value))
                || ((int2.value <= int3.value) && (int2.value >= int1.value))) {
            output += (String.format("%d is the median\n", int2.value));
        } else if (((int3.value <= int1.value) && (int3.value >= int2.value))
                || ((int3.value <= int2.value) && (int3.value >= int1.value))) {
            output += (String.format("%d is the median\n", int3.value));
        }
        if (true)
            return;
        ;
    }

    // median_93f87bf2_010.java
    public void exec55() throws Exception {
        IntObj int1 = new IntObj(), int2 = new IntObj(), int3 = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        int1.value = scanner.nextInt();
        int2.value = scanner.nextInt();
        int3.value = scanner.nextInt();
        if (((int1.value < int2.value) && (int1.value > int3.value))
                || ((int1.value < int2.value) && (int1.value > int3.value))) {
            output += (String.format("%d is the median\n", int1.value));
        } else if ((((int2.value < int1.value)) && (int2.value > int3.value))
                || ((int2.value < int3.value) && (int2.value > int1.value))) {
            output += (String.format("%d is the median\n", int2.value));
        } else if (((int3.value < int1.value) && (int3.value > int2.value))
                || ((int3.value < int2.value) && (int3.value > int1.value))) {
            output += (String.format("%d is the median\n", int3.value));
        }
        if (true)
            return;
        ;
    }

    // median_d4aae191_000.java
    public void exec56() throws Exception {
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output +=
                (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if ((a.value > b.value) && (b.value > c.value)) {
            output += (String.format("%d is the median\n", b.value));
        }
        if ((a.value > b.value) && (a.value > c.value)) {
            if (c.value > b.value) {
                output += (String.format("%d is the median\n", c.value));
            }
        }
        if ((b.value > a.value) && (a.value > c.value)) {
            output += (String.format("%d is the median\n", a.value));
        }
        if ((b.value > a.value) && (b.value > c.value)) {
            if (c.value > a.value) {
                output += (String.format("%d is the median\n", c.value));
            }
        }
        if ((c.value > a.value) && (a.value > b.value)) {
            output += (String.format("%d is the median\n", a.value));
        }
        if ((c.value > a.value) && (c.value > b.value)) {
            if (b.value > a.value) {
                output += (String.format("%d is the median\n", b.value));
            }
        }
        if (true)
            return;
        ;
    }
}
