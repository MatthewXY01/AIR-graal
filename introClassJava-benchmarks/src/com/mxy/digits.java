package com.mxy;

public class digits {

    public java.util.Scanner scanner;
    public String output = "";

    public static void main(String[] args) throws Exception {
//        digits mainClass = new digits();
//        String output;
//        if(args.length > 0) {
//            mainClass.scanner = new java.util.Scanner(args[0]);
//        } else {
//            mainClass.scanner = new java.util.Scanner(System.in);
//        }
//        mainClass.exec0();
//        System.out.println(mainClass.output);
    }
    // digits_d120480a_001.java
    public void exec0() throws Exception {
        IntObj n = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        while (n.value != 0) {
            digit.value = n.value % 10;
            n.value = n.value / 10;
            if ((digit.value < 0) && (n.value == 0)) {
                output += (String.format("%d\n", digit.value));
            } else {
                output += (String.format("%d\n", Math.abs(digit.value)));
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_d120480a_000.java
    public void exec1() throws Exception {
        IntObj n = new IntObj(), digit = new IntObj();
        output += (String.format("Enter an integer > "));
        n.value = scanner.nextInt();
        while (n.value != 0) {
            digit.value = n.value % 10;
            n.value = n.value / 10;
            if ((digit.value < 0) && (n.value == 0)) {
                output += (String.format("%d\n", digit.value));
            } else {
                output += (String.format("%d\n", Math.abs(digit.value)));
            }
        }
        if (true)
            return;
        ;
    }

    // digits_d8b26284_000.java
    public void exec2() throws Exception {
        IntObj num = new IntObj();
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        do {
            output += (String.format("\n%d", num.value % 10));
            num.value /= 10;
        } while (num.value > 0);
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_c5d8f924_003.java
    public void exec3() throws Exception {
        IntObj number = new IntObj(0), i = new IntObj(0), store =
                new IntObj(0), state = new IntObj(1);
        output += (String.format("\nEnter an integer > "));
        number.value = scanner.nextInt();
        output += (String.format("\n"));
        while (i.value < 9) {
            if (number.value < 0) {
                number.value = number.value * -1;
                state.value = -1;
            }
            store.value = number.value % 10;
            if (number.value <= 9) {
                store.value = number.value * state.value;
            }
            output += (String.format("%d\n", store.value));
            number.value = number.value / 10;
            i.value++;
            if (number.value == 0) {
                output += (String.format("That's all, have a nice day!\n"));
                break;
            }
        }
        if (true)
            return;
        ;
    }

    // digits_6e464f2b_004.java
    public void exec4() throws Exception {
        IntObj n = new IntObj(), i = new IntObj(), j = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        i.value = n.value;
        if (n.value == 0) {
            output += (String.format("%d\n", n.value));
        }
        while (i.value != 0) {
            j.value = i.value % 10;
            i.value = i.value / 10;
            if (n.value < 0 && i.value == 0) {
                output += (String.format("%d\n", j.value));
            } else {
                output += (String.format("%d\n", -j.value));
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_6e464f2b_003.java
    public void exec5() throws Exception {
        IntObj n = new IntObj(), i = new IntObj(), j = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        i.value = n.value;
        if (n.value == 0) {
            output += (String.format("%d\n", n.value));
        }
        if (n.value < -2147483647) {
            output += (String.format("%d\n", i.value));
        }
        while (i.value != 0) {
            j.value = i.value % 10;
            i.value = i.value / 10;
            if (n.value < 0 && n.value == 0) {
                output += (String.format("%d\n", -j.value));
            } else {
                output += (String.format("%d\n", j.value));
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_6e464f2b_000.java
    public void exec6() throws Exception {
        IntObj n = new IntObj(), i = new IntObj(), j = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        i.value = n.value;
        while (i.value < 0) {
            j.value = i.value % -10;
            output += (String.format("%d\n", -j.value));
            i.value = i.value / 10;
            if (i.value > -10) {
                j.value = i.value % -10;
                output += (String.format("%d\n", j.value));
                break;
            }
        }
        while (i.value > 0) {
            j.value = i.value % 10;
            output += (String.format("%d\n", j.value));
            i.value = i.value / 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_ca94e375_002.java
    public void exec7() throws Exception {
        IntObj n = new IntObj();
        IntObj x = new IntObj(), y = new IntObj();
        IntObj temp = new IntObj();
        output += (String.format("\nEnter an integer > "));
        y.value = scanner.nextInt();
        n.value = 0;
        while (n.value <= 10) {
            if (y.value == 0) {
                output += (String.format("\n%d", y.value));
                output += (String.format("\nThat's all, have a nice day!\n"));
                if (true)
                    return;
                ;
            }
            x.value = y.value % 10;
            output += (String.format("\n%d", Math.abs(x.value)));
            x.value = y.value / 10;
            if (x.value > -10 && x.value < 0) {
                output += (String.format("\n%d", x.value));
                output += (String.format("\nThat's all, have a nice day!\n"));
                if (true)
                    return;
                ;
            }
            temp.value = x.value;
            x.value = y.value;
            y.value = temp.value;
            n.value = n.value + 1;
        }
        if (true)
            return;
        ;
    }

    // digits_ca94e375_000.java
    public void exec8() throws Exception {
        IntObj n = new IntObj();
        IntObj x = new IntObj(), y = new IntObj();
        IntObj temp = new IntObj();
        output += (String.format("\nEnter an integer > "));
        y.value = scanner.nextInt();
        n.value = 0;
        while (n.value <= 10) {
            x.value = y.value % 10;
            output += (String.format("\n%d", Math.abs(x.value)));
            x.value = y.value / 10;
            if (x.value > -10 && x.value < 0) {
                output += (String.format("\n%d", x.value));
                output += (String.format("\nThat's all, have a nice day!\n"));
                if (true)
                    return;
                ;
            }
            temp.value = x.value;
            x.value = y.value;
            y.value = temp.value;
            n.value = n.value + 1;
        }
        if (true)
            return;
        ;
    }

    // digits_1391c9b1_002.java
    public void exec9() throws Exception {
        IntObj Num = new IntObj(), X = new IntObj(), NewNum = new IntObj();
        output += (String.format("Please enter a number > "));
        Num.value = scanner.nextInt();
        if (Num.value == 0) {
            output += (String.format("0\n"));
        }
        while (Num.value > 0) {
            X.value = Num.value % 10;
            output += (String.format("%d\n", X.value));
            NewNum.value = (Num.value - X.value) / 10;
            Num.value = NewNum.value;
        }
        while (Num.value < 0) {
            X.value = Num.value % 10;
            NewNum.value = (Num.value - X.value) / 10;
            if (X.value < 0) {
                output += (String.format("%d\n", (X.value * -1)));
            }
            if (Num.value < 0 && Num.value > -10) {
                output += (String.format("%d\n", X.value));
            }
            Num.value = NewNum.value;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_1391c9b1_000.java
    public void exec10() throws Exception {
        IntObj Num = new IntObj(), X = new IntObj(), NewNum = new IntObj();
        output += (String.format("Please enter a number > "));
        Num.value = scanner.nextInt();
        while (Num.value != 0) {
            X.value = Num.value % 10;
            output += (String.format("%d\n", X.value));
            NewNum.value = (Num.value - X.value) / 10;
            Num.value = NewNum.value;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_387be36e_002.java
    public void exec11() throws Exception {
        IntObj x = new IntObj(), d = new IntObj(), n = new IntObj(), z =
                new IntObj(), y = new IntObj();
        output += (String.format("Enter an integer > "));
        n.value = scanner.nextInt();
        d.value = n.value / 10;
        z.value = n.value % 10;
        if (z.value > 0) {
            output += (String.format("%d\n", z.value));
        } else if (z.value < 0) {
            y.value = z.value * (-1);
            output += (String.format("%d\n", y.value));
        }
        if (d.value >= 0 && d.value <= 10) {
            output +=
                    (String.format("%d\nThat's all, have a nice day!\n", d.value));
            if (true)
                return;
            ;
        }
        if (d.value > 0) {
            while (d.value > 0) {
                x.value = d.value % 10;
                d.value = d.value / 10;
                output += (String.format("%d\n", x.value));
                if (d.value < 10) {
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", d.value));
                    if (true)
                        return;
                    ;
                }
            }
        } else if (d.value < 0) {
            d.value = d.value * (-1);
            while (d.value > 0) {
                x.value = d.value % 10;
                d.value = d.value / 10;
                output += (String.format("%d\n", x.value));
                if (d.value < 10) {
                    d.value = d.value * (-1);
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", d.value));
                }
            }
        }
        if (true)
            return;
        ;
    }

    // digits_387be36e_000.java
    public void exec12() throws Exception {
        IntObj x = new IntObj(), d = new IntObj(), n = new IntObj(), z =
                new IntObj(), y = new IntObj();
        output += (String.format("Enter an integer > "));
        n.value = scanner.nextInt();
        d.value = n.value / 10;
        z.value = n.value % 10;
        if (z.value > 0) {
            output += (String.format("%d\n", z.value));
        } else if (z.value < 0) {
            y.value = z.value * (-1);
            output += (String.format("%d\n", y.value));
        }
        if (d.value > 0) {
            while (d.value > 0) {
                x.value = d.value % 10;
                d.value = d.value / 10;
                output += (String.format("%d\n", x.value));
                if (d.value < 10) {
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", d.value));
                    if (true)
                        return;
                    ;
                }
            }
        } else if (d.value < 0) {
            d.value = d.value * (-1);
            while (d.value > 0) {
                x.value = d.value % 10;
                d.value = d.value / 10;
                output += (String.format("%d\n", x.value));
                if (d.value < 10) {
                    d.value = d.value * (-1);
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", d.value));
                }
            }
        }
        if (true)
            return;
        ;
    }

    // digits_98d873cd_004.java
    public void exec13() throws Exception {
        IntObj digit = new IntObj(), n = new IntObj(), m = new IntObj();
        output += (String.format("\nEnter an integer > "));
        digit.value = scanner.nextInt();
        while (digit.value != 0) {
            n.value = digit.value % 10;
            m.value = n.value;
            if (digit.value < -10) {
                m.value = n.value * -1;
            }
            digit.value = (digit.value - n.value) / 10;
            output += (String.format("\n%d", m.value));
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_98d873cd_001.java
    public void exec14() throws Exception {
        IntObj digit = new IntObj(), n = new IntObj();
        output += (String.format("\nEnter an integer > "));
        digit.value = scanner.nextInt();
        while (digit.value != 0) {
            n.value = digit.value % 10;
            digit.value = (digit.value - n.value) / 10;
            output += (String.format("\n%d", n.value));
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_98d873cd_003.java
    public void exec15() throws Exception {
        IntObj digit = new IntObj(), n = new IntObj();
        output += (String.format("\nEnter an integer > "));
        digit.value = scanner.nextInt();
        while (digit.value != 0) {
            n.value = digit.value % 10;
            if (digit.value < -10) {
                n.value = n.value * -1;
            }
            digit.value = (digit.value - n.value) / 10;
            output += (String.format("\n%d", n.value));
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_98d873cd_000.java
    public void exec16() throws Exception {
        IntObj digit = new IntObj(), n = new IntObj();
        output += (String.format("\nEnter and integer > "));
        digit.value = scanner.nextInt();
        while (digit.value != 0) {
            n.value = digit.value % 10;
            digit.value = (digit.value - n.value) / 10;
            output += (String.format("\n%d", n.value));
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_f227ed28_000.java
    public void exec17() throws Exception {
        IntObj num = new IntObj(), rem = new IntObj(0), count = new IntObj(1);
        output += (String.format("Enter an integer > "));
        num.value = scanner.nextInt();
        output += (String.format("The digits for the %d are: \n", num.value));
        while (count.value <= 10 && num.value > 0) {
            rem.value = num.value % 10;
            num.value = num.value - rem.value;
            num.value = num.value / 10;
            count.value++;
            output += (String.format("%d\n", rem.value));
        }
        if (num.value <= 0 && count.value == 1) {
            output += (String.format("%d\n", num.value));
        }
        if (true)
            return;
        ;
    }

    // digits_3214e9b0_003.java
    public void exec18() throws Exception {
        IntObj userint = new IntObj(), remainder = new IntObj();
        output += (String.format("Enter an integer > "));
        userint.value = scanner.nextInt();
        output += (String.format("\n"));
        while (userint.value != 0) {
            remainder.value = userint.value % 10;
            userint.value = (userint.value - remainder.value) / 10;
            if (userint.value < 0) {
                remainder.value = (-1) * remainder.value;
            }
            output += (String.format("%d\n", remainder.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_3214e9b0_000.java
    public void exec19() throws Exception {
        IntObj userint = new IntObj(), remainder = new IntObj();
        output += (String.format("Enter an integer > "));
        userint.value = scanner.nextInt();
        output += (String.format("\n"));
        while (userint.value != 0) {
            remainder.value = userint.value % 10;
            output += (String.format("%d\n", remainder.value));
            userint.value = (userint.value - remainder.value) / 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_313d572e_000.java
    public void exec20() throws Exception {
        IntObj given = new IntObj(), digit10 = new IntObj(), digit9 =
                new IntObj(), digit8 = new IntObj(), digit7 = new IntObj(), digit6 =
                new IntObj(), digit5 = new IntObj(), digit4 = new IntObj(), digit3 =
                new IntObj(), digit2 = new IntObj(), digit1 = new IntObj();
        output += (String.format("\nEnter an interger > "));
        given.value = scanner.nextInt();
        if (given.value >= 1 && given.value < 10) {
            digit10.value = given.value % 10;
            output +=
                    (String.format
                            ("\n%d\nThat's all, have a nice day!\n", digit10.value));
        }
        if (given.value >= 10 && given.value < 100) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            output +=
                    (String.format
                            ("\n%d\n%d\nThat's all, have a nice day!\n", digit10.value,
                                    digit9.value));
        }
        if (given.value >= 100 && given.value < 1000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            output +=
                    (String.format("\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                            digit10.value, digit9.value, digit8.value));
        }
        if (given.value >= 1000 && given.value < 10000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            output +=
                    (String.format("\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                            digit10.value, digit9.value, digit8.value,
                            digit7.value));
        }
        if (given.value >= 10000 && given.value < 100000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            digit6.value = (given.value / 10000) % 10;
            output +=
                    (String.format
                            ("\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                                    digit10.value, digit9.value, digit8.value, digit7.value,
                                    digit6.value));
        }
        if (given.value >= 100000 && given.value < 1000000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            digit6.value = (given.value / 10000) % 10;
            digit5.value = (given.value / 100000) % 10;
            output +=
                    (String.format
                            ("\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                                    digit10.value, digit9.value, digit8.value, digit7.value,
                                    digit6.value, digit5.value));
        }
        if (given.value >= 1000000 && given.value < 10000000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            digit6.value = (given.value / 10000) % 10;
            digit5.value = (given.value / 100000) % 10;
            digit4.value = (given.value / 1000000) % 10;
            output +=
                    (String.format
                            ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                                    digit10.value, digit9.value, digit8.value, digit7.value,
                                    digit6.value, digit5.value, digit4.value));
        }
        if (given.value >= 10000000 && given.value < 100000000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            digit6.value = (given.value / 10000) % 10;
            digit5.value = (given.value / 100000) % 10;
            digit4.value = (given.value / 1000000) % 10;
            digit3.value = (given.value / 10000000) % 10;
            output +=
                    (String.format
                            ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                                    digit10.value, digit9.value, digit8.value, digit7.value,
                                    digit6.value, digit5.value, digit4.value, digit3.value));
        }
        if (given.value >= 100000000 && given.value < 1000000000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            digit6.value = (given.value / 10000) % 10;
            digit5.value = (given.value / 100000) % 10;
            digit4.value = (given.value / 1000000) % 10;
            digit3.value = (given.value / 10000000) % 10;
            digit2.value = (given.value / 100000000) % 10;
            output +=
                    (String.format
                            ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                                    digit10.value, digit9.value, digit8.value, digit7.value,
                                    digit6.value, digit5.value, digit4.value, digit3.value,
                                    digit2.value));
        }
        if (given.value >= 1000000000 && given.value < 10000000000L) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            digit6.value = (given.value / 10000) % 10;
            digit5.value = (given.value / 100000) % 10;
            digit4.value = (given.value / 1000000) % 10;
            digit3.value = (given.value / 10000000) % 10;
            digit2.value = (given.value / 100000000) % 10;
            digit1.value = (given.value / 1000000000) % 10;
            output +=
                    (String.format
                            ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                                    digit10.value, digit9.value, digit8.value, digit7.value,
                                    digit6.value, digit5.value, digit4.value, digit3.value,
                                    digit2.value, digit1.value));
        }
        if (true)
            return;
        ;
    }

    // digits_d6364e6e_000.java
    public void exec21() throws Exception {
        IntObj input = new IntObj(), display = new IntObj();
        output += (String.format("Enter an integer > "));
        input.value = scanner.nextInt();
        output += (String.format("\n"));
        if (input.value < 0) {
            input.value = input.value * (-1);
            while ((input.value / 10) >= 1) {
                display.value = input.value % 10;
                output += (String.format("%d\n", display.value));
                input.value = input.value / 10;
            }
            output += (String.format("-%d\n", input.value % 10));
            output += (String.format("That's all, have a nice day!\n"));
            if (true)
                return;
            ;
        }
        while ((input.value % 10) >= 1) {
            display.value = input.value % 10;
            output += (String.format("%d\n", display.value));
            input.value = input.value / 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_bfad6d21_004.java
    public void exec22() throws Exception {
        IntObj num = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        num.value = (int) (num.value);
        digit.value = num.value % 10;
        while (num.value != 0) {
            if ((digit.value < 0) && ((num.value / 10) != 0)) {
                digit.value = digit.value * -1;
            }
            output += (String.format("%d\n", digit.value));
            num.value = num.value / 10;
            digit.value = num.value % 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_bfad6d21_003.java
    public void exec23() throws Exception {
        IntObj num = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        digit.value = num.value % 10;
        while (num.value != 0) {
            if ((digit.value < 0) && ((num.value / 10) != 0)) {
                digit.value = digit.value * -1;
            }
            output += (String.format("%d\n", digit.value));
            num.value = num.value / 10;
            digit.value = num.value % 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_bfad6d21_005.java
    public void exec24() throws Exception {
        IntObj num = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        digit.value = num.value % 10;
        num.value = (int) (num.value);
        while (num.value != 0) {
            if ((digit.value < 0) && ((num.value / 10) != 0)) {
                digit.value = digit.value * -1;
            }
            output += (String.format("%d\n", digit.value));
            num.value = num.value / 10;
            digit.value = num.value % 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_bfad6d21_000.java
    public void exec25() throws Exception {
        IntObj num = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        digit.value = num.value % 10;
        while (num.value != 0) {
            if ((digit.value < 0) && ((num.value / 10) != 0)) {
                digit.value = digit.value * -1;
            }
            output += (String.format("%d\n", digit.value));
            num.value = num.value / 10;
            digit.value = num.value % 10;
        }
        if (true)
            return;
        ;
    }

    // digits_c9d718f3_001.java
    public void exec26() throws Exception {
        IntObj value = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        value.value = scanner.nextInt();
        output += (String.format("\n"));
        if (value.value > 0) {
            while (value.value != 0) {
                digit.value = value.value % 10;
                value.value = value.value / 10;
                output += (String.format("%d\n", digit.value));
            }
        }
        if (value.value < 0) {
            value.value = Math.abs(value.value);
            while (value.value > 10) {
                digit.value = value.value % 10;
                value.value = value.value / 10;
                output += (String.format("%d\n", digit.value));
            }
            digit.value = value.value % 10;
            output += (String.format("-%d\n", digit.value));
        }
        if (value.value == 0) {
            digit.value = value.value;
            output += (String.format("%d\n", digit.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_c9d718f3_000.java
    public void exec27() throws Exception {
        IntObj value = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        value.value = scanner.nextInt();
        output += (String.format("\n"));
        if (value.value >= 0) {
            while (value.value != 0) {
                digit.value = value.value % 10;
                value.value = value.value / 10;
                output += (String.format("%d\n", digit.value));
            }
        }
        if (value.value < 0) {
            value.value = Math.abs(value.value);
            while (value.value > 10) {
                digit.value = value.value % 10;
                value.value = value.value / 10;
                output += (String.format("%d\n", digit.value));
            }
            digit.value = value.value % 10;
            output += (String.format("-%d\n", digit.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_1b31fa5c_002.java
    public void exec28() throws Exception {
        IntObj test = new IntObj(), remainder = new IntObj(), status =
                new IntObj(), n = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        status.value = n.value;
        test.value = status.value;
        output += (String.format("\n"));
        if (n.value < 0) {
            n.value = n.value * -1;
        }
        while (test.value != 0) {
            remainder.value = n.value % 10;
            n.value = n.value / 10;
            test.value = n.value;
            if ((status.value < 0) && (n.value == 0)) {
                remainder.value = -1 * remainder.value;
            }
            output += (String.format("%d\n", remainder.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_1b31fa5c_000.java
    public void exec29() throws Exception {
        IntObj test = new IntObj(), remainder = new IntObj(), status =
                new IntObj(), n = new IntObj();
        output += (String.format("Enter an integer > "));
        n.value = scanner.nextInt();
        status.value = n.value;
        test.value = status.value;
        output += (String.format("\n"));
        if (n.value < 0) {
            n.value = n.value * -1;
        }
        while (test.value != 0) {
            remainder.value = n.value % 10;
            n.value = n.value / 10;
            test.value = n.value;
            if ((status.value < 0) && (n.value == 0)) {
                remainder.value = -1 * remainder.value;
            }
            output += (String.format("%d\n", remainder.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_e9c74e27_000.java
    public void exec30() throws Exception {
        IntObj num = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        if (num.value < 0) {
            while (num.value != 0) {
                digit.value = num.value % 10;
                if (num.value > (-10)) {
                    output += (String.format("\n%d", digit.value));
                } else {
                    output += (String.format("\n%d", -digit.value));
                }
                num.value = num.value / 10;
            }
        } else {
            while (num.value != 0) {
                digit.value = num.value % 10;
                output += (String.format("\n%d", digit.value));
                num.value = num.value / 10;
            }
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_90a14c1a_004.java
    public void exec31() throws Exception {
        IntObj value = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        value.value = scanner.nextInt();
        output += (String.format("\n"));
        if (value.value > 0) {
            while (value.value != 0) {
                digit.value = value.value % 10;
                value.value = value.value / 10;
                output += (String.format("%d\n", digit.value));
            }
        } else if (value.value < 0) {
            while (value.value < -10) {
                digit.value = Math.abs(value.value % 10);
                value.value = value.value / 10;
                output += (String.format("%d\n", digit.value));
            }
        } else if (value.value == 0) {
            digit.value = 0;
            output += (String.format("%d\n", digit.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_90a14c1a_000.java
    public void exec32() throws Exception {
        IntObj value = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        value.value = scanner.nextInt();
        output += (String.format("\n"));
        if (value.value >= 0) {
            while (value.value != 0) {
                digit.value = value.value % 10;
                value.value = value.value / 10;
                output += (String.format("%d\n", digit.value));
            }
        }
        if (value.value < 0) {
            while (value.value < -10) {
                digit.value = Math.abs(value.value % 10);
                value.value = value.value / 10;
                output += (String.format("%d\n", digit.value));
            }
            digit.value = value.value % 10;
            output += (String.format("%d\n", digit.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_317aa705_002.java
    public void exec33() throws Exception {
        IntObj negative = new IntObj(), integer = new IntObj(), i =
                new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        integer.value = scanner.nextInt();
        negative.value = integer.value;
        for (i.value = 1; i.value <= 10; i.value += 1) {
            if ((i.value != 10) && (negative.value < 0)) {
                digit.value = (-1 * integer.value) % 10;
            } else {
                digit.value = integer.value % 10;
            }
            integer.value = integer.value / 10;
            output += (String.format("\n%d", digit.value));
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_317aa705_004.java
    public void exec34() throws Exception {
        IntObj integer = new IntObj(), i = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        integer.value = scanner.nextInt();
        digit.value = 0;
        for (i.value = 1; i.value <= 10; i.value += 1) {
            digit.value = integer.value % 10;
            if (integer.value == 0) {
                output += (String.format("0\n"));
                break;
            } else if (Math.abs(digit.value) < 10) {
                digit.value = Math.abs(digit.value);
                output += (String.format("%d\n", digit.value));
            }
            integer.value = integer.value / 10;
            if (Math.abs(integer.value) < 10 && integer.value != 0) {
                output += (String.format("%d\n", integer.value));
                break;
            }
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_833bd42c_000.java
    public void exec35() throws Exception {
        IntObj num_input = new IntObj(), num_input2 = new IntObj(), digit =
                new IntObj();
        output += (String.format("Enter an integer > "));
        num_input.value = scanner.nextInt();
        num_input2.value = num_input.value;
        while (num_input2.value != 0) {
            digit.value = Math.abs(num_input2.value % 10);
            num_input2.value = (num_input2.value / 10);
            if ((num_input2.value == 0) && (num_input.value < 0)) {
                digit.value = digit.value * (-1);
            }
            output += (String.format("\n%d\n", digit.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_295afd89_002.java
    public void exec36() throws Exception {
        IntObj n = new IntObj();
        IntObj modRes = new IntObj();
        IntObj mod = new IntObj(10);
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        while (n.value != 0) {
            modRes.value = n.value % mod.value;
            n.value = n.value / mod.value;
            if (n.value != 0) {
                modRes.value = Math.abs(modRes.value);
                output += (String.format("\n%d", modRes.value));
            } else {
                output += (String.format("\n%d", modRes.value));
            }
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_295afd89_003.java
    public void exec37() throws Exception {
        IntObj n = new IntObj();
        IntObj rem = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        while (n.value >= 10) {
            rem.value = n.value % 10;
            n.value = n.value / 10;
            output += (String.format("\n%d", rem.value));
        }
        rem.value = n.value % 10;
        output += (String.format("\n%d", rem.value));
        output += (String.format("\nThat's all, have a nice day!"));
        if (true)
            return;
        ;
    }

    // digits_295afd89_000.java
    public void exec38() throws Exception {
        IntObj n = new IntObj();
        IntObj modRes = new IntObj();
        IntObj mod = new IntObj(10);
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        while (n.value != 0) {
            modRes.value = n.value % mod.value;
            n.value = n.value / mod.value;
            if (modRes.value != 0) {
                output += (String.format("\n%d", modRes.value));
            } else {
                output += (String.format("%d", n.value));
            }
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_ca505766_003.java
    public void exec39() throws Exception {
        IntObj in = new IntObj();
        output += (String.format("Enter an integer > "));
        in.value = scanner.nextInt();
        if (in.value < 0) {
            in.value = in.value * (-1);
        }
        while (in.value / 10 != 0) {
            output += (String.format("%d\n", in.value % 10));
            in.value = in.value / 10;
        }
        output += (String.format("%d\n", in.value));
        output += (String.format("That's all, have a nice day!"));
        if (true)
            return;
        ;
    }

    // digits_2af3c416_000.java
    public void exec40() throws Exception {
        IntObj num = new IntObj(), digit = new IntObj();
        output += (String.format("Enter an integer > "));
        num.value = scanner.nextInt();
        output += (String.format("\n"));
        while (num.value > 0) {
            digit.value = num.value % 10;
            output += (String.format("%d\n", digit.value));
            num.value = num.value / 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_d5059e2b_000.java
    public void exec41() throws Exception {
        IntObj num = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        digit.value = Math.abs(num.value) % 10;
        if (num.value < 0) {
            num.value = Math.abs(num.value);
            while (num.value != digit.value) {
                digit.value = num.value % 10;
                if (num.value <= digit.value) {
                    output += (String.format("\n-%d", digit.value));
                } else {
                    output += (String.format("\n%d", digit.value));
                }
                num.value = (num.value - digit.value) / 10;
                if (num.value == 0) {
                    break;
                }
                if (num.value == digit.value) {
                    output += (String.format("\n-%d", num.value));
                }
            }
        } else if (num.value == 0) {
            output += (String.format("\n0"));
        } else if (num.value >= 0) {
            while (num.value != digit.value) {
                digit.value = num.value % 10;
                output += (String.format("\n%d", digit.value));
                num.value = (num.value - digit.value) / 10;
                if (num.value == 0) {
                    break;
                }
                if (num.value == digit.value) {
                    output += (String.format("\n%d", num.value));
                }
            }
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_0cdfa335_006.java
    public void exec42() throws Exception {
        IntObj n = new IntObj(), temp = new IntObj(), digit = new IntObj();
        DoubleObj i = new DoubleObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        temp.value = Math.abs(n.value);
        i.value = Math.log10(temp.value);
        i.value = (int) Math.ceil(i.value);
        if (i.value / i.value == 1) {
            i.value++;
        }
        while (n.value != 0) {
            digit.value = n.value % 10;
            n.value = n.value / 10;
            if (i.value != 1) {
                output += (String.format("%d\n", Math.abs(digit.value)));
            }
            if (i.value == 1) {
                output += (String.format("%d\n", digit.value));
            }
            i.value--;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_0cdfa335_004.java
    public void exec43() throws Exception {
        IntObj n = new IntObj(), temp = new IntObj(), digit = new IntObj();
        DoubleObj i = new DoubleObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        temp.value = Math.abs(n.value);
        i.value = Math.log10(temp.value);
        i.value = Math.ceil(i.value);
        while (n.value != 0) {
            digit.value = n.value % 10;
            n.value = n.value / 10;
            if (i.value != 1) {
                output += (String.format("%d\n", Math.abs(digit.value)));
            }
            if (i.value == 1) {
                output += (String.format("%d\n", digit.value));
            }
            i.value -= 1.00;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_0cdfa335_005.java
    public void exec44() throws Exception {
        IntObj n = new IntObj(), temp = new IntObj(), digit = new IntObj();
        DoubleObj i = new DoubleObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        temp.value = Math.abs(n.value);
        i.value = Math.log10(temp.value);
        i.value = Math.ceil(i.value);
        if (i.value / i.value == 1) {
            i.value += 1.00;
        }
        while (n.value != 0) {
            digit.value = n.value % 10;
            n.value = n.value / 10;
            if (i.value != 1) {
                output += (String.format("%d\n", Math.abs(digit.value)));
            }
            if (i.value == 1) {
                output += (String.format("%d\n", digit.value));
            }
            i.value -= 1.00;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_0cdfa335_007.java
    public void exec45() throws Exception {
        IntObj n = new IntObj(), temp = new IntObj(), digit = new IntObj();
        DoubleObj i = new DoubleObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        temp.value = Math.abs(n.value);
        i.value = Math.log10(temp.value);
        i.value = (int) Math.ceil(i.value);
        if (i.value / i.value == 1) {
            i.value++;
        }
        while (n.value != 0) {
            digit.value = n.value % 10;
            n.value = n.value / 10;
            if (n.value == 0) {
                output += (String.format("%d\n", digit.value));
            } else {
                output += (String.format("%d\n", Math.abs(digit.value)));
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_f2997e14_002.java
    public void exec46() throws Exception {
        IntObj digit = new IntObj(), input = new IntObj();
        output += (String.format("\nEnter an integer > "));
        input.value = scanner.nextInt();
        output += (String.format("\n"));
        while (true) {
            digit.value = input.value % 10;
            if (input.value == 0) {
                output += (String.format("0\n"));
                break;
            } else if (Math.abs(digit.value) < 10) {
                digit.value = Math.abs(digit.value);
                output += (String.format("%d\n", digit.value));
            }
            input.value = input.value / 10;
            if (Math.abs(input.value) < 10 && input.value != 0) {
                output += (String.format("%d\n", input.value));
                break;
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_f2997e14_000.java
    public void exec47() throws Exception {
        IntObj digit = new IntObj(), input = new IntObj();
        output += (String.format("\nEnter an integer > "));
        input.value = scanner.nextInt();
        output += (String.format("\n"));
        while (true) {
            digit.value = input.value % 10;
            if (input.value == 0) {
                output += (String.format("0\n"));
                break;
            } else if (Math.abs(digit.value) < 10) {
                output += (String.format("%d\n", digit.value));
            }
            input.value = input.value / 10;
            if (Math.abs(input.value) < 10 && input.value != 0) {
                output += (String.format("%d\n", input.value));
                break;
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_65e02c1a_015.java
    public void exec48() throws Exception {
        IntObj d1 = new IntObj(), d2 = new IntObj(), d3 = new IntObj(), d4 =
                new IntObj(), d5 = new IntObj(), d6 = new IntObj(), d7 =
                new IntObj(), d8 = new IntObj(), d9 = new IntObj(), d10 =
                new IntObj(), absnum = new IntObj(), num = new IntObj();
        DoubleObj floatnum = new DoubleObj();
        output += (String.format("\nEnter an integer > "));
        floatnum.value = scanner.nextDouble();
        num.value = (int) floatnum.value;
        absnum.value = Math.abs(num.value);
        if (!(num.value >= 0 && absnum.value < 10000000000L)) {
            d1.value = (absnum.value % 10);
            d2.value = (absnum.value % 100) / 10;
            d3.value = (absnum.value % 1000) / 100;
            d4.value = (absnum.value % 10000) / 1000;
            d5.value = (absnum.value % 100000) / 10000;
            d6.value = (absnum.value % 1000000) / 100000;
            d7.value = (absnum.value % 10000000) / 1000000;
            d8.value = (absnum.value % 100000000) / 10000000;
            d9.value = (absnum.value % 1000000000) / 100000000;
            d10.value =
                    ((num.value - d1.value - (d2.value * 10) - (d3.value * 100) -
                            (d4.value * 1000) - (d5.value * 10000) - (d6.value * 100000) -
                            (d7.value * 1000000) - (d8.value * 10000000) -
                            (d9.value * 100000000)) / 1000000000);
            if (d10.value == 0 && d9.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n-%d\n", d1.value,
                                d2.value, d3.value, d4.value, d5.value, d6.value,
                                d7.value, d8.value, d9.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n-%d\n", d1.value,
                                d2.value, d3.value, d4.value, d5.value, d6.value,
                                d7.value, d8.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value != 0) {
                output +=
                        (String.format
                                ("\n%d\n%d\n%d\n%d\n%d\n%d\n-%d\n", d1.value, d2.value, d3.value,
                                        d4.value, d5.value, d6.value, d7.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n%d\n-%d\n", d1.value, d2.value,
                                d3.value, d4.value, d5.value, d6.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n-%d\n", d1.value, d2.value,
                                d3.value, d4.value, d5.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n-%d\n", d1.value, d2.value, d3.value,
                                d4.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n-%d\n", d1.value, d2.value, d3.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value == 0 && d2.value != 0) {
                output += (String.format("\n%d\n-%d\n", d1.value, d2.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value == 0 && d2.value == 0
                    && d1.value != 0) {
                output += (String.format("\n-%d\n", d1.value));
            }
        } else if (num.value >= 0 && num.value < 10000000000L) {
            d1.value = (num.value % 10);
            d2.value = (num.value % 100) / 10;
            d3.value = (num.value % 1000) / 100;
            d4.value = (num.value % 10000) / 1000;
            d5.value = (num.value % 100000) / 10000;
            d6.value = (num.value % 1000000) / 100000;
            d7.value = (num.value % 10000000) / 1000000;
            d8.value = (num.value % 100000000) / 10000000;
            d9.value = (num.value % 1000000000) / 100000000;
            d10.value =
                    ((num.value - d1.value - (d2.value * 10) - (d3.value * 100) -
                            (d4.value * 1000) - (d5.value * 10000) - (d6.value * 100000) -
                            (d7.value * 1000000) - (d8.value * 10000000) -
                            (d9.value * 100000000)) / 1000000000);
            if (d10.value == 0 && d9.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value,
                                d2.value, d3.value, d4.value, d5.value, d6.value,
                                d7.value, d8.value, d9.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value,
                                d2.value, d3.value, d4.value, d5.value, d6.value,
                                d7.value, d8.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value != 0) {
                output +=
                        (String.format
                                ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value, d2.value, d3.value,
                                        d4.value, d5.value, d6.value, d7.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value, d2.value,
                                d3.value, d4.value, d5.value, d6.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value != 0) {
                output +=
                        (String.format
                                ("\n%d\n%d\n%d\n%d\n%d\n", d1.value, d2.value, d3.value, d4.value,
                                        d5.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n", d1.value, d2.value, d3.value,
                                d4.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n", d1.value, d2.value, d3.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value == 0 && d2.value != 0) {
                output += (String.format("\n%d\n%d\n", d1.value, d2.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value == 0 && d2.value == 0
                    && d1.value != 0) {
                output += (String.format("\n%d\n", d1.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value == 0 && d2.value == 0
                    && d1.value == 0) {
                output += (String.format("\n0\n"));
            }
        }
        if (floatnum.value >= 10000000000L) {
            output += (String.format("\n7\n4\n6\n3\n8\n4\n7\n4\n1\n2\n"));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_65e02c1a_004.java
    public void exec49() throws Exception {
        IntObj d1 = new IntObj(), d2 = new IntObj(), d3 = new IntObj(), d4 =
                new IntObj(), d5 = new IntObj(), d6 = new IntObj(), d7 =
                new IntObj(), d8 = new IntObj(), d9 = new IntObj(), d10 =
                new IntObj(), num = new IntObj(), absnum = new IntObj();
        output += (String.format("Enter an integer > "));
        num.value = scanner.nextInt();
        absnum.value = (-num.value);
        if (num.value < 0 && num.value < -9999999999L) {
            d1.value = (absnum.value % 10);
            d2.value = (absnum.value % 100) / 10;
            d3.value = (absnum.value % 1000) / 100;
            d4.value = (absnum.value % 10000) / 1000;
            d5.value = (absnum.value % 100000) / 10000;
            d6.value = (absnum.value % 1000000) / 100000;
            d7.value = (absnum.value % 10000000) / 1000000;
            d8.value = (absnum.value % 100000000) / 10000000;
            d9.value = (absnum.value % 1000000000) / 100000000;
            d10.value =
                    (absnum.value - d1.value - (d2.value * 10) - (d3.value * 100) -
                            (d4.value * 1000) - (d5.value * 10000) - (d6.value * 100000) -
                            (d7.value * 1000000) - (d8.value * 10000000) -
                            (d9.value * 100000000)) / 1000000000;
            if (d10.value == 0 && d9.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n-%d\n", d1.value,
                                d2.value, d3.value, d4.value, d5.value, d6.value,
                                d7.value, d8.value, d9.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n-%d\n", d1.value,
                                d2.value, d3.value, d4.value, d5.value, d6.value,
                                d7.value, d8.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value != 0) {
                output +=
                        (String.format
                                ("\n%d\n%d\n%d\n%d\n%d\n%d\n-%d\n", d1.value, d2.value, d3.value,
                                        d4.value, d5.value, d6.value, d7.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n%d\n-%d\n", d1.value, d2.value,
                                d3.value, d4.value, d5.value, d6.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n-%d\n", d1.value, d2.value,
                                d3.value, d4.value, d5.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n-%d\n", d1.value, d2.value, d3.value,
                                d4.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n-%d\n", d1.value, d2.value, d3.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value == 0 && d2.value != 0) {
                output += (String.format("\n%d\n-%d\n", d1.value, d2.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value == 0 && d2.value == 0
                    && d1.value != 0) {
                output += (String.format("-%d\n", d1.value));
            } else if (d10.value != 0 && d9.value != 0 && d8.value != 0
                    && d7.value != 0 && d6.value != 0 && d5.value != 0
                    && d4.value != 0 && d3.value != 0 && d2.value != 0
                    && d1.value != 0) {
                output +=
                        (String.format
                                ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value, d2.value,
                                        d3.value, d4.value, d5.value, d6.value, d7.value, d8.value,
                                        d9.value, d10.value));
            }
        }
        if (num.value >= 0) {
            d1.value = (num.value % 10);
            d2.value = (num.value % 100) / 10;
            d3.value = (num.value % 1000) / 100;
            d4.value = (num.value % 10000) / 1000;
            d5.value = (num.value % 100000) / 10000;
            d6.value = (num.value % 1000000) / 100000;
            d7.value = (num.value % 10000000) / 1000000;
            d8.value = (num.value % 100000000) / 10000000;
            d9.value = (num.value % 1000000000) / 100000000;
            d10.value =
                    ((num.value - d1.value - (d2.value * 10) - (d3.value * 100) -
                            (d4.value * 1000) - (d5.value * 10000) - (d6.value * 100000) -
                            (d7.value * 1000000) - (d8.value * 10000000) -
                            (d9.value * 100000000)) / 1000000000);
            if (d10.value == 0 && d9.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value,
                                d2.value, d3.value, d4.value, d5.value, d6.value,
                                d7.value, d8.value, d9.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value,
                                d2.value, d3.value, d4.value, d5.value, d6.value,
                                d7.value, d8.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value != 0) {
                output +=
                        (String.format
                                ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value, d2.value, d3.value,
                                        d4.value, d5.value, d6.value, d7.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n%d\n%d\n", d1.value, d2.value,
                                d3.value, d4.value, d5.value, d6.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value != 0) {
                output +=
                        (String.format
                                ("\n%d\n%d\n%d\n%d\n%d\n", d1.value, d2.value, d3.value, d4.value,
                                        d5.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n%d\n", d1.value, d2.value, d3.value,
                                d4.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value != 0) {
                output +=
                        (String.format("\n%d\n%d\n%d\n", d1.value, d2.value, d3.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value == 0 && d2.value != 0) {
                output += (String.format("\n%d\n%d\n", d1.value, d2.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value == 0 && d2.value == 0
                    && d1.value != 0) {
                output += (String.format("\n%d\n", d1.value));
            } else if (d10.value == 0 && d9.value == 0 && d8.value == 0
                    && d7.value == 0 && d6.value == 0 && d5.value == 0
                    && d4.value == 0 && d3.value == 0 && d2.value == 0
                    && d1.value == 0) {
                output += (String.format("\n0\n"));
            }
        } else {
            output += (String.format("\n-2147483648\n"));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_07045530_002.java
    public void exec50() throws Exception {
        IntObj n = new IntObj(), r = new IntObj(), nn = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        while (n.value != 0) {
            if (n.value < 0) {
                n.value = -n.value;
                while (n.value != 0) {
                    r.value = n.value % 10;
                    nn.value = n.value / 10;
                    if (n.value < 10) {
                        output += (String.format("\n-%d", r.value));
                    } else if (n.value >= 10) {
                        output += (String.format("\n%d", r.value));
                    }
                    n.value = nn.value;
                }
            } else {
                r.value = n.value % 10;
                nn.value = n.value / 10;
                n.value = nn.value;
                output += (String.format("\n%d", r.value));
            }
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_07045530_000.java
    public void exec51() throws Exception {
        IntObj n = new IntObj(), r = new IntObj(), nn = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        while (n.value > 0) {
            r.value = n.value % 10;
            nn.value = n.value / 10;
            n.value = nn.value;
            output += (String.format("\n%d", r.value));
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_88394fc0_004.java
    public void exec52() throws Exception {
        IntObj n = new IntObj();
        IntObj digits = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        digits.value = 1;
        if (n.value == 0) {
            output += (String.format("0\n"));
        }
        while (n.value > 0) {
            digits.value = n.value % 10;
            output += (String.format("%d\n", digits.value));
            n.value = (n.value - digits.value) / 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_88394fc0_003.java
    public void exec53() throws Exception {
        IntObj n = new IntObj();
        IntObj digits = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        n.value = Math.abs(n.value);
        digits.value = 1;
        while (n.value > 0) {
            digits.value = n.value % 10;
            output += (String.format("%d\n", digits.value));
            n.value = n.value / 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_e79f832f_002.java
    public void exec54() throws Exception {
        IntObj number = new IntObj(), rem = new IntObj();
        output += (String.format("\nEnter an integer > "));
        number.value = scanner.nextInt();
        output += (String.format("\n"));
        if (number.value < 0) {
            number.value = Math.abs(number.value);
            while (number.value > 10) {
                rem.value = number.value % 10;
                output += (String.format("%d\n", rem.value));
                number.value = (number.value - rem.value) / 10;
            }
            number.value = number.value - 2 * number.value;
            output +=
                    (String.format("%d\nThat's all, have a nice day!\n", number.value));
        } else {
            while (number.value != 0) {
                rem.value = number.value % 10;
                output += (String.format("%d\n", rem.value));
                number.value = (number.value - rem.value) / 10;
            }
            output += (String.format("That's all, have a nice day!\n"));
        }
        if (true)
            return;
        ;
    }

    // digits_e79f832f_000.java
    public void exec55() throws Exception {
        IntObj number = new IntObj(), rem = new IntObj();
        output += (String.format("\nEnter an integer > "));
        number.value = scanner.nextInt();
        output += (String.format("\n"));
        if (number.value < 0) {
            number.value = Math.abs(number.value);
            while (number.value > 10) {
                rem.value = number.value % 10;
                output += (String.format("%d\n", rem.value));
                number.value = number.value / 10;
            }
            number.value = number.value - 2 * number.value;
            output +=
                    (String.format("%d\nThat's all, have a nice day!\n", number.value));
        } else {
            while (number.value != 0) {
                rem.value = number.value % 10;
                output += (String.format("%d\n", rem.value));
                number.value = number.value / 10;
            }
            output += (String.format("That's all, have a nice day!\n"));
        }
        if (true)
            return;
        ;
    }

    // digits_9013bd3b_001.java
    public void exec56() throws Exception {
        IntObj number = new IntObj(), digit = new IntObj(), j =
                new IntObj(), digit1 = new IntObj();
        output += (String.format("Enter an integer > "));
        number.value = scanner.nextInt();
        output += (String.format("\n"));
        j.value = 10;
        while (number.value != 0) {
            digit.value = number.value % j.value;
            if (digit.value < 0 && Math.abs(number.value * 10) < 100) {
                output += (String.format("%d\n", digit.value));
                break;
            } else {
                digit1.value = Math.abs(digit.value);
            }
            output += (String.format("%d\n", digit1.value));
            number.value = number.value / 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_cd2d9b5b_003.java
    public void exec57() throws Exception {
        IntObj n = new IntObj(), digit = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        digit.value = 0;
        while (n.value != 0) {
            digit.value = n.value % 10;
            output += (String.format("\n%d", digit.value));
            n.value = (n.value - digit.value) / 10;
        }
        output += (String.format("\nThat's all, have a nice day!"));
        if (true)
            return;
        ;
    }

    // digits_d2b889e1_006.java
    public void exec58() throws Exception {
        IntObj x = new IntObj(), a = new IntObj(), b = new IntObj(), c =
                new IntObj(), y = new IntObj();
        output += (String.format("Enter an integer > "));
        b.value = scanner.nextInt();
        a.value = b.value / 10;
        c.value = b.value % 10;
        if (c.value > 0) {
            output += (String.format("%d\n", c.value));
        } else if (c.value < 0) {
            y.value = c.value * (-1);
            output += (String.format("%d\n", y.value));
        }
        if (a.value >= 0 && a.value <= 10) {
            output +=
                    (String.format("%d\nThat's all, have a nice day!\n", a.value));
            if (true)
                return;
            ;
        }
        if (a.value > 0) {
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format("%d\n", x.value));
                if (a.value < 10) {
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", a.value));
                    if (true)
                        return;
                    ;
                }
            }
        } else if (a.value < 0) {
            a.value = a.value * (-1);
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format("%d\n", x.value));
                if (a.value < 10) {
                    a.value = a.value * (-1);
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", a.value));
                }
            }
        }
        if (true)
            return;
        ;
    }

    // digits_d2b889e1_004.java
    public void exec59() throws Exception {
        IntObj x = new IntObj(), a = new IntObj(), b = new IntObj(), c =
                new IntObj(), y = new IntObj();
        output += (String.format("Enter an integer > "));
        b.value = scanner.nextInt();
        a.value = b.value / 10;
        c.value = b.value % 10;
        if (c.value > 0) {
            output += (String.format("\n%d\n", c.value));
        } else if (c.value < 0) {
            y.value = c.value * (-1);
            output += (String.format("%d\n", y.value));
        }
        if (a.value > 0) {
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format("%d\n", x.value));
                if (a.value < 10) {
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", a.value));
                    if (true)
                        return;
                    ;
                }
            }
        } else if (a.value < 0) {
            a.value = a.value * (-1);
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format("%d\n", x.value));
                if (a.value < 10) {
                    a.value = a.value * (-1);
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", a.value));
                }
            }
        }
        if (true)
            return;
        ;
    }

    // digits_d2b889e1_001.java
    public void exec60() throws Exception {
        IntObj x = new IntObj(), a = new IntObj(), b = new IntObj(), c =
                new IntObj(), y = new IntObj();
        output += (String.format("Enter an integer > "));
        b.value = scanner.nextInt();
        a.value = b.value / 10;
        c.value = b.value % 10;
        if (c.value > 0) {
            output += (String.format("\n%d\n", c.value));
        } else if (c.value < 0) {
            y.value = c.value * (-1);
            output += (String.format("%d\n", y.value));
        }
        if (a.value > 0) {
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format("%d\n", x.value));
                if (a.value < 10) {
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", a.value));
                    if (true)
                        return;
                    ;
                }
            }
        } else if (a.value < 0) {
            a.value = a.value * (-1);
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format("%d\n", x.value));
                if (a.value < 10) {
                    a.value = a.value * (-1);
                    output +=
                            (String.format("%d\nTHat's all, have a nice day~\n", a.value));
                }
            }
        }
        if (true)
            return;
        ;
    }

    // digits_d2b889e1_003.java
    public void exec61() throws Exception {
        IntObj x = new IntObj(), a = new IntObj(), b = new IntObj(), c =
                new IntObj(), y = new IntObj();
        output += (String.format("Enter an integer > "));
        b.value = scanner.nextInt();
        a.value = b.value / 10;
        c.value = b.value % 10;
        if (c.value > 0) {
            output += (String.format("\n%d\n", c.value));
        } else if (c.value < 0) {
            y.value = c.value * (-1);
            output += (String.format("%d\n", y.value));
        }
        if (a.value > 0) {
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format("%d\n", x.value));
                if (a.value < 10) {
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", a.value));
                    if (true)
                        return;
                    ;
                }
            }
        } else if (a.value < 0) {
            a.value = a.value * (-1);
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format("%d\n", x.value));
                if (a.value < 10) {
                    a.value = a.value * (-1);
                    output +=
                            (String.format("%d\nThat's all, have a nice day~\n", a.value));
                }
            }
        }
        if (true)
            return;
        ;
    }

    // digits_d2b889e1_005.java
    public void exec62() throws Exception {
        IntObj x = new IntObj(), a = new IntObj(), b = new IntObj(), c =
                new IntObj(), y = new IntObj();
        output += (String.format("Enter an integer > "));
        b.value = scanner.nextInt();
        a.value = b.value / 10;
        c.value = b.value % 10;
        if (c.value > 0) {
            output += (String.format("\n%d\n", c.value));
        } else if (c.value < 0) {
            y.value = c.value * (-1);
            output += (String.format("%d\n", y.value));
        }
        if (a.value > 0 && a.value < 10) {
            output +=
                    (String.format("%d\nThat's all, have a nice day!\n", a.value));
            if (true)
                return;
            ;
        }
        if (a.value > 0) {
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format("%d\n", x.value));
                if (a.value < 10) {
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", a.value));
                    if (true)
                        return;
                    ;
                }
            }
        } else if (a.value < 0) {
            a.value = a.value * (-1);
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format("%d\n", x.value));
                if (a.value < 10) {
                    a.value = a.value * (-1);
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", a.value));
                }
            }
        }
        if (true)
            return;
        ;
    }

    // digits_d2b889e1_000.java
    public void exec63() throws Exception {
        IntObj x = new IntObj(), a = new IntObj(), b = new IntObj(), c =
                new IntObj(), y = new IntObj();
        output += (String.format("Enter an integer > "));
        b.value = scanner.nextInt();
        a.value = b.value / 10;
        c.value = b.value % 10;
        if (c.value > 0) {
            output += (String.format("%d\n", c.value));
        } else if (c.value < 0) {
            y.value = c.value * (-1);
            output += (String.format("%d\n", y.value));
        }
        if (a.value > 0) {
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format("%d\n", x.value));
                if (a.value < 10) {
                    output +=
                            (String.format("%d\nThat's all, have a nice day!\n", a.value));
                    if (true)
                        return;
                    ;
                }
            }
        } else if (a.value < 0) {
            a.value = a.value * (-1);
            while (a.value > 0) {
                x.value = a.value % 10;
                a.value = a.value / 10;
                output += (String.format("%d\n", x.value));
                if (a.value < 10) {
                    a.value = a.value * (-1);
                    output +=
                            (String.format("%d\nTHat's all, have a nice day~\n", a.value));
                }
            }
        }
        if (true)
            return;
        ;
    }

    // digits_48b82975_000.java
    public void exec64() throws Exception {
        IntObj num = new IntObj();
        output += (String.format("Enter an integer > "));
        num.value = scanner.nextInt();
        if (num.value < 0) {
            num.value = (Math.abs(num.value));
            while (num.value > 10) {
                output += (String.format("%d\n", num.value % 10));
                num.value /= 10;
            }
            num.value = num.value - 2 * num.value;
            output += (String.format("%d\n", num.value));
        } else {
            while (num.value != 0) {
                output += (String.format("%d\n", num.value % 10));
                num.value /= 10;
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_5b504b35_000.java
    public void exec65() throws Exception {
        IntObj n = new IntObj(), input = new IntObj(), digit =
                new IntObj(), inter = new IntObj(), lastdigit = new IntObj();
        output += (String.format("Enter an integer > "));
        input.value = scanner.nextInt();
        lastdigit.value = 0;
        for (n.value = 10; n.value < 10000000001L; n.value = n.value * 10) {
            digit.value = input.value % n.value;
            inter.value = digit.value;
            inter.value = inter.value - lastdigit.value;
            if (input.value < 0 && !(input.value == digit.value)) {
                output += (String.format("%d\n", -inter.value * 10 / n.value));
            }
            if (input.value < 0 && input.value == digit.value) {
                output += (String.format("%d\n", inter.value * 10 / n.value));
            }
            if (input.value > 0) {
                output += (String.format("%d\n", inter.value * 10 / n.value));
            }
            if (input.value == digit.value) {
                break;
            }
            lastdigit.value = digit.value;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_08c7ea4a_001.java
    public void exec66() throws Exception {
        IntObj num = new IntObj(), numl = new IntObj(), n = new IntObj(), d0 =
                new IntObj(), d1 = new IntObj(), d2 = new IntObj(), d3 =
                new IntObj(), d4 = new IntObj(), d5 = new IntObj(), d6 =
                new IntObj(), d7 = new IntObj(), d8 = new IntObj(), d9 =
                new IntObj();
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        numl.value = num.value;
        n.value = 0;
        while (numl.value > 0) {
            n.value += 1;
            numl.value = numl.value / 10;
        }
        d0.value = num.value % 10;
        num.value = (num.value - d0.value) / 10;
        d1.value = num.value % 10;
        num.value = (num.value - d1.value) / 10;
        d2.value = num.value % 10;
        num.value = (num.value - d2.value) / 10;
        d3.value = num.value % 10;
        num.value = (num.value - d3.value) / 10;
        d4.value = num.value % 10;
        num.value = (num.value - d4.value) / 10;
        d5.value = num.value % 10;
        num.value = (num.value - d5.value) / 10;
        d6.value = num.value % 10;
        num.value = (num.value - d6.value) / 10;
        d7.value = num.value % 10;
        num.value = (num.value - d7.value) / 10;
        d8.value = num.value % 10;
        num.value = (num.value - d8.value) / 10;
        d9.value = num.value % 10;
        num.value = (num.value - d9.value) / 10;
        output += (String.format("\n%d\n", d0.value));
        if (n.value > 1) {
            output += (String.format("%d\n", d1.value));
        }
        if (n.value > 2) {
            output += (String.format("%d\n", d2.value));
        }
        if (n.value > 3) {
            output += (String.format("%d\n", d3.value));
        }
        if (n.value > 4) {
            output += (String.format("%d\n", d4.value));
        }
        if (n.value > 5) {
            output += (String.format("%d\n", d5.value));
        }
        if (n.value > 6) {
            output += (String.format("%d\n", d6.value));
        }
        if (n.value > 7) {
            output += (String.format("%d\n", d7.value));
        }
        if (n.value > 8) {
            output += (String.format("%d\n", d8.value));
        }
        if (n.value > 9) {
            output += (String.format("%d\n", d9.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_08c7ea4a_000.java
    public void exec67() throws Exception {
        IntObj num = new IntObj(), numl = new IntObj(), n = new IntObj(), d0 =
                new IntObj(), d1 = new IntObj(), d2 = new IntObj(), d3 =
                new IntObj(), d4 = new IntObj(), d5 = new IntObj(), d6 =
                new IntObj(), d7 = new IntObj(), d8 = new IntObj(), d9 =
                new IntObj();
        output += (String.format("\nEnter an integer > "));
        num.value = scanner.nextInt();
        numl.value = num.value;
        n.value = 0;
        while (numl.value > 0) {
            n.value += 1;
            numl.value = numl.value / 10;
        }
        d0.value = num.value % 10;
        num.value = (num.value - d0.value) / 10;
        d1.value = num.value % 10;
        num.value = (num.value - d1.value) / 10;
        d2.value = num.value % 10;
        num.value = (num.value - d2.value) / 10;
        d3.value = num.value % 10;
        num.value = (num.value - d3.value) / 10;
        d4.value = num.value % 10;
        num.value = (num.value - d4.value) / 10;
        d5.value = num.value % 10;
        num.value = (num.value - d5.value) / 10;
        d6.value = num.value % 10;
        num.value = (num.value - d6.value) / 10;
        d7.value = num.value % 10;
        num.value = (num.value - d7.value) / 10;
        d8.value = num.value % 10;
        num.value = (num.value - d8.value) / 10;
        d9.value = num.value % 10;
        num.value = (num.value - d9.value) / 10;
        output += (String.format("%d\n", d0.value));
        if (n.value > 1) {
            output += (String.format("%d\n", d1.value));
        }
        if (n.value > 2) {
            output += (String.format("%d\n", d2.value));
        }
        if (n.value > 3) {
            output += (String.format("%d\n", d3.value));
        }
        if (n.value > 4) {
            output += (String.format("%d\n", d4.value));
        }
        if (n.value > 5) {
            output += (String.format("%d\n", d5.value));
        }
        if (n.value > 6) {
            output += (String.format("%d\n", d6.value));
        }
        if (n.value > 7) {
            output += (String.format("%d\n", d7.value));
        }
        if (n.value > 8) {
            output += (String.format("%d\n", d8.value));
        }
        if (n.value > 9) {
            output += (String.format("%d\n", d9.value));
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_d767ad3b_007.java
    public void exec68() throws Exception {
        IntObj num = new IntObj();
        output += (String.format("Enter an integer > "));
        num.value = scanner.nextInt();
        if (num.value == 0) {
            output += (String.format("\n0\nThat's all, have a nice day!\n"));
        }
        while (num.value < 0) {
            num.value = -num.value;
            output += (String.format("\n%d", num.value % 10));
            num.value = num.value / 10;
            if (num.value < 10) {
                output +=
                        (String.format("\n%dThat's all, have a nice day!\n", -num.value));
            }
        }
        while ((num.value <= 9999999999L) && (num.value > 0)) {
            output += (String.format("\n%d", num.value % 10));
            num.value = num.value / 10;
            if (num.value == 0) {
                output += (String.format("\nThat's all, have a nice day!\n"));
                break;
            }
        }
        if (true)
            return;
        ;
    }

    // digits_1c2bb3a4_003.java
    public void exec69() throws Exception {
        IntObj x = new IntObj(), y = new IntObj(), i = new IntObj();
        IntObj step1 = new IntObj(10), step2 = new IntObj(100);
        IntObj num = new IntObj();
        IntObj max = new IntObj(0);
        output += (String.format("Enter an integer > "));
        x.value = scanner.nextInt();
        y.value = x.value;
        while (y.value >= 10) {
            y.value /= 10;
            max.value++;
        }
        if (max.value >= 9) {
            output += (String.format("\n7\n4\n6\n3\n8\n4\n7\n4\n1\n2\n"));
        } else {
            if (x.value < 0) {
                output += (String.format("%d\n", x.value % 10));
                x.value = x.value * -1;
            } else {
                output += (String.format("%d\n", x.value % 10));
            }
            for (i.value = 0; i.value < max.value; i.value++) {
                num.value =
                        ((x.value % step2.value - x.value % step1.value) / step1.value);
                output += (String.format("%d\n", num.value));
                step2.value *= 10;
                step1.value *= 10;
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_1c2bb3a4_000.java
    public void exec70() throws Exception {
        IntObj x = new IntObj(), y = new IntObj(), i = new IntObj();
        IntObj step1 = new IntObj(10), step2 = new IntObj(100);
        IntObj num = new IntObj();
        IntObj max = new IntObj(0);
        output += (String.format("Enter an integer > "));
        x.value = scanner.nextInt();
        if (x.value < 0) {
            output += (String.format("%d\n", x.value % 10));
            x.value = x.value * -1;
        } else {
            output += (String.format("%d\n", x.value % 10));
        }
        y.value = x.value;
        while (y.value >= 10) {
            y.value /= 10;
            max.value++;
        }
        for (i.value = 0; i.value < max.value; i.value++) {
            num.value =
                    ((x.value % step2.value - x.value % step1.value) / step1.value);
            output += (String.format("%d\n", num.value));
            step2.value *= 10;
            step1.value *= 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_d43d3207_000.java
    public void exec71() throws Exception {
        IntObj input = new IntObj(), digits = new IntObj();
        output += (String.format("Enter an integer > "));
        input.value = scanner.nextInt();
        while (input.value / 10 != 0) {
            digits.value = input.value % 10;
            output += (String.format("\n%d", digits.value));
            input.value = input.value / 10;
        }
        output +=
                (String.format("\n%d\nThat's all, have a nice day!", input.value));
        if (true)
            return;
        ;
    }

    // digits_0cea42f9_002.java
    public void exec72() throws Exception {
        LongObj n = new LongObj();
        output += (String.format("Enter an integer > "));
        n.value = scanner.nextLong();
        while (n.value != 0) {
            output += (String.format("\n%d", n.value % 10));
            n.value /= 10;
        }
        output += (String.format("\nThat's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_0cea42f9_000.java
    public void exec73() throws Exception {
        LongObj n = new LongObj();
        output += (String.format("Enter an integer >  "));
        n.value = scanner.nextLong();
        while (n.value != 0) {
            output += (String.format("%d\n", n.value % 10));
            n.value /= 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }

    // digits_a0e3fdae_003.java
    public void exec74() throws Exception {
        IntObj integer = new IntObj();
        IntObj mod = new IntObj();
        output += (String.format("\n"));
        output += (String.format("Enter an integer > "));
        integer.value = scanner.nextInt();
        output += (String.format("\n"));
        while (integer.value != 0) {
            mod.value = integer.value % 10;
            output += (String.format("%d\n", mod.value));
            integer.value /= 10;
        }
        output += (String.format("That's all, have a nice day!\n"));
        if (true)
            return;
        ;
    }
}
