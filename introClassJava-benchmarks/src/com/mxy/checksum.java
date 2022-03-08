package com.mxy;

public class checksum {
    public java.util.Scanner scanner;
    public String output = "";
    public static void main(String[] args) throws Exception {
//        checksum mainClass = new checksum();
//        String output;
//        if(args.length > 0) {
//            mainClass.scanner = new java.util.Scanner(args[0]);
//        } else {
//            mainClass.scanner = new java.util.Scanner(System.in);
//        }
//        mainClass.exec0();
//        System.out.println(mainClass.output);
    }

    // checksum_e9c74e27_000.java
    public void exec0() throws Exception {
        CharObj orig = new CharObj();
        IntObj code = new IntObj(), accum = new IntObj();
        CharObj checksum = new CharObj();
        output +=
                (String.format
                        ("Enter an abitrarily long string, ending with carriage return > "));
        accum.value = 0;
        checksum.value = 0;
        code.value = 0;
        orig.value = ' ';
        do {
            try {
                orig.value = scanner.findInLine(".").charAt(0);
            } catch (java.lang.NullPointerException e) {
                orig.value = '\n';
            }
            ;
            code.value = (int) orig.value;
            accum.value += code.value;
        } while (orig.value != '\n');
        checksum.value = (char) ((accum.value % 64) + 22);
        output += (String.format("Check sum is %c\n", checksum.value));
        if (true)
            return;
        ;
    }

    // checksum_36d8008b_003.java
    public void exec1() throws Exception {
        IntObj sum = new IntObj();
        CharObj next = new CharObj();
        sum.value = 0;
        output +=
                (String.format
                        ("Enter an abitrarily long string, ending with carriage return > "));
        while (next.value != '\n') {
            try {
                next.value = scanner.findInLine(".").charAt(0);
            } catch (java.lang.NullPointerException e) {
                next.value = '\n';
            }
            ;
            sum.value = sum.value + next.value;
        }
        sum.value = sum.value % 64 + 22;
        output += (String.format("Check sum is %c\n", sum.value));
        if (true)
            return;
        ;
    }

    // checksum_e23b96b6_005.java
    public void exec2() throws Exception {
        CharObj letter = new CharObj();
        IntObj sum = new IntObj(0);
        output +=
                (String.format
                        ("Enter an abitrarily long string, ending with carriage return > "));
        while (letter.value != '\n') {
            try {
                letter.value = scanner.findInLine(".").charAt(0);
            } catch (java.lang.NullPointerException e) {
                letter.value = '\n';
            }
            ;
            sum.value = sum.value + (int) letter.value;
        }
        sum.value = sum.value % 64 + 22;
        output += (String.format("Check sum is %c\n", (char) sum.value));
        if (true)
            return;
        ;
    }

    // checksum_659a7300_003.java
    public void exec3() throws Exception {
        int length = 1000000; // modified
        char[] string = new char[length];
        IntObj count = new IntObj(), i = new IntObj();
        output +=
                (String.format
                        ("Enter an abitrarily long string, ending with carriage return > "));
        string = scanner.next().toCharArray();
        count.value = 0;
        for (i.value = 0; i.value != string.length; ++i.value) {
            count.value += (int) string[i.value];
        }
        count.value = count.value % 64 + ' ';
        output += (String.format("Check sum is %c\n", count.value));
        if (true)
            return;
        ;
    }

    // checksum_08c7ea4a_006.java
    public void exec4() throws Exception {
        char[] string = new char[1000];
        CharObj checksumchar = new CharObj();
        IntObj i = new IntObj(), stringlength =
                new IntObj(), checksum_summation = new IntObj();
        output +=
                (String.format
                        ("Enter an abitrarily long string, ending with carriage return > "));
        string = scanner.next().toCharArray();
        stringlength.value = string.length;
        checksum_summation.value = 0;
        for (i.value = 0; i.value < stringlength.value; i.value++) {
            checksum_summation.value += (int) string[i.value];
        }
        checksum_summation.value /= 64;
        checksum_summation.value += (int) ' ';
        checksumchar.value = (char) checksum_summation.value;
        output += (String.format("Check sum is %c\n", checksumchar.value));
        if (true)
            return;
        ;
    }

    // checksum_08c7ea4a_011.java
    public void exec5() throws Exception {
        char[] string = new char[1000000];
        CharObj checksumchar = new CharObj();
        IntObj i = new IntObj(), stringlength =
                new IntObj(), checksum_summation = new IntObj();
        output +=
                (String.format
                        ("Enter an abitrarily long string, ending with carriage return > "));
        string = scanner.next().toCharArray();
        stringlength.value = string.length;
        checksum_summation.value = 0;
        for (i.value = 0; i.value < stringlength.value; i.value++) {
            checksum_summation.value += (int) string[i.value];
        }
        checksum_summation.value %= 64;
        checksum_summation.value += 32;
        checksumchar.value = (char) checksum_summation.value;
        output += (String.format("Check sum is %c\n", checksumchar.value));
        if (true)
            return;
        ;
    }

    // checksum_08c7ea4a_007.java
    public void exec6() throws Exception {
        char[] string = new char[1000];
        CharObj checksumchar = new CharObj();
        IntObj i = new IntObj(), stringlength =
                new IntObj(), checksum_summation = new IntObj();
        output +=
                (String.format
                        ("Enter an abitrarily long string, ending with carriage return > "));
        string = scanner.next().toCharArray();
        stringlength.value = string.length;
        checksum_summation.value = 0;
        for (i.value = 0; i.value < stringlength.value; i.value++) {
            checksum_summation.value += (int) string[i.value];
        }
        checksum_summation.value %= 64;
        checksum_summation.value += 32;
        checksumchar.value = (char) checksum_summation.value;
        output += (String.format("Check sum is %c\n", checksumchar.value));
        if (true)
            return;
        ;
    }

    // checksum_08c7ea4a_010.java
    public void exec7() throws Exception {
        char[] string = new char[100000];
        CharObj checksumchar = new CharObj();
        IntObj i = new IntObj(), stringlength =
                new IntObj(), checksum_summation = new IntObj();
        output +=
                (String.format
                        ("Enter an abitrarily long string, ending with carriage return > "));
        string = scanner.next().toCharArray();
        stringlength.value = string.length;
        checksum_summation.value = 0;
        for (i.value = 0; i.value < stringlength.value; i.value++) {
            checksum_summation.value += (int) string[i.value];
        }
        checksum_summation.value %= 64;
        checksum_summation.value += 32;
        checksumchar.value = (char) checksum_summation.value;
        output += (String.format("Check sum is %c\n", checksumchar.value));
        if (true)
            return;
        ;
    }

    // checksum_2c155667_003.java
    public void exec8() throws Exception {
        CharObj character = new CharObj();
        CharObj remainder = new CharObj();
        IntObj sum = new IntObj();
        output +=
                (String.format
                        ("Enter an abitrarily long string, ending with carriage return > "));
        sum.value = 0;
        while (character.value != '\n') {
            try {
                character.value = scanner.findInLine(".").charAt(0);
            } catch (java.lang.NullPointerException e) {
                character.value = '\n';
            }
            ;
            sum.value = sum.value + (int) character.value;
        }
        remainder.value = (char) ((sum.value % 64) + 22);
        output += (String.format("Check sum is %c\n", remainder.value));
        if (true)
            return;
        ;
    }

    // checksum_a0e3fdae_005.java
    public void exec9() throws Exception {
        IntObj checksum = new IntObj(), integer_value = new IntObj(), sum =
                new IntObj(0);
        char[] value = new char[1000];
        output +=
                (String.format
                        ("Enter an abitrarily long string, ending with carriage return > "));
        value = scanner.next().toCharArray();
        IntObj i = new IntObj();
        IntObj stringlength = new IntObj(value.length);
        for (i.value = 0; i.value < stringlength.value; i.value++) {
            integer_value.value = value[i.value];
            sum.value = sum.value + integer_value.value;
        }
        checksum.value = (sum.value % 64) + ' ';
        output += (String.format("Check sum is %c\n", checksum.value));
        if (true)
            return;
        ;
    }

    // checksum_a0e3fdae_000.java
    public void exec10() throws Exception {
        IntObj checksum = new IntObj(), integer_value = new IntObj(), sum =
                new IntObj(0);
        char[] value = new char[1000];
        output +=
                (String.format
                        ("Enter an abitrarily long string, ending with carriage return > "));
        value = scanner.next().toCharArray();
        IntObj i = new IntObj();
        IntObj stringlength = new IntObj(value.length);
        for (i.value = 0; i.value < stringlength.value; i.value++) {
            integer_value.value = value[i.value];
            sum.value = sum.value + integer_value.value;
        }
        checksum.value = (sum.value % 64) + ' ';
        output += (String.format("Check sum is %c \n", checksum.value));
        if (true)
            return;
        ;
    }
}
