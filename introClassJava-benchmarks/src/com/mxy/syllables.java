package com.mxy;

public class syllables {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main(String[] args) throws Exception {
//        syllables mainClass = new syllables();
//        String output;
//        if (args.length > 0) {
//            mainClass.scanner = new java.util.Scanner(args[0]);
//        } else {
//            mainClass.scanner = new java.util.Scanner(System.in);
//        }
//        mainClass.exec0();
//        System.out.println(mainClass.output);
    }

    // syllables_48925325_007.java
    public void exec0() throws Exception {
        char[] instr = new char[20];
        IntObj len = new IntObj(), i = new IntObj(), num = new IntObj(0);
        output += (String.format("Please enter a string > "));
        instr = scanner.next().toCharArray();
        len.value = instr.length;
        i.value = 0;
        while (i.value < len.value) {
            if (instr[i.value] == 'a' || instr[i.value] == 'e'
                    || instr[i.value] == 'i' || instr[i.value] == 'o'
                    || instr[i.value] == 'u' || instr[i.value] == 'y') {
                num.value = num.value + 1;
            }
            i.value = i.value + 1;
        }
        output += (String.format("The number of syllables is %d\n", num.value));
        if (true)
            return;
        ;
    }

    // syllables_f8d57dea_002.java
    public void exec1() throws Exception {
        char[] instring = new char[20];
        IntObj numVowels = new IntObj(0);
        IntObj i = new IntObj();
        output += (String.format("Please enter a string > "));
        instring = (scanner.nextLine() + "\n").toCharArray();
        for (i.value = 0; i.value < instring.length; i.value++) {
            if (instring[i.value] == 'a' || instring[i.value] == 'e'
                    || instring[i.value] == 'i' || instring[i.value] == 'o'
                    || instring[i.value] == 'u' || instring[i.value] == 'y') {
                numVowels.value += 0;
            }
        }
        output +=
                (String.format("The number of syllables is %d.\n", numVowels.value));
        if (true)
            return;
        ;
    }

    // syllables_99cbb46b_003.java
    public void exec2() throws Exception {
        char[] str = new char[20];
        IntObj i = new IntObj(), syl = new IntObj(), len = new IntObj();
        output += (String.format("Please enter a string > "));
        str = scanner.next().toCharArray();
        len.value = str.length;
        syl.value = 0;
        for (i.value = 0; i.value < len.value; i.value++) {
            if (str[i.value] == 'a' || str[i.value] == 'e' || str[i.value] == 'i'
                    || str[i.value] == 'o' || str[i.value] == 'u'
                    || str[i.value] == 'y') {
                syl.value++;
            }
        }
        output += (String.format("The number of syllables is %d.\n", syl.value));
        if (true)
            return;
        ;
    }

    // syllables_38eb99ca_004.java
    public void exec3() throws Exception {
        int sizeA = 20; // modified
        char[] string = new char[sizeA];
        IntObj i = new IntObj(), length = new IntObj();
        IntObj count = new IntObj(0);
        output += (String.format("Please enter a string > "));
        string = (scanner.nextLine() + "\n").toCharArray();
        length.value = string.length;
        for (i.value = 0; i.value < length.value; i.value++) {
            if (string[i.value] == 'a' || string[i.value] == 'e'
                    || string[i.value] == 'o' || string[i.value] == 'u'
                    || string[i.value] == 'y') {
                count.value++;
            }
        }
        output +=
                (String.format("The number of syllables is %d.\n", count.value));
        if (true)
            return;
        ;
    }

    // syllables_38eb99ca_003.java
    public void exec4() throws Exception {
        int sizeA = 20; // modified
        char[] string = new char[sizeA];
        IntObj i = new IntObj();
        IntObj count = new IntObj(0);
        output += (String.format("Please enter a string > "));
        string = (scanner.nextLine() + "\n").toCharArray();
        for (i.value = 0; i.value < string.length; i.value++) {
            if (string[i.value] == 'a' || string[i.value] == 'e'
                    || string[i.value] == 'o' || string[i.value] == 'u'
                    || string[i.value] == 'y') {
                count.value++;
            }
        }
        output +=
                (String.format("The number of syllables is %d.\n", count.value));
        if (true)
            return;
        ;
    }

    // syllables_90a14c1a_000.java
    public void exec5() throws Exception {
        char[] input = new char[21];
        IntObj i = new IntObj(), syllables = new IntObj();
        output += (String.format("Please enter a string > "));
        input = scanner.next().toCharArray();
        syllables.value = 0;
        i.value = 0;
        while (i.value < input.length) {
            if (input[i.value] == 'a') {
                syllables.value = syllables.value + 1;
            }
            if (input[i.value] == 'e') {
                syllables.value = syllables.value + 1;
            }
            if (input[i.value] == 'i') {
                syllables.value = syllables.value + 1;
            }
            if (input[i.value] == 'o') {
                syllables.value = syllables.value + 1;
            }
            if (input[i.value] == 'u') {
                syllables.value = syllables.value + 1;
            }
            if (input[i.value] == 'y') {
                syllables.value = syllables.value + 1;
            }
            i.value = i.value + 1;
        }
        output +=
                (String.format("The number of syllables is %d.\n", syllables.value));
        if (true)
            return;
        ;
    }

    // syllables_36d8008b_003.java
    public void exec6() throws Exception {
        char[] instr = new char[21];
        IntObj i = new IntObj(), len = new IntObj(), s = new IntObj();
        s.value = 0;
        output += (String.format("Please enter a string > "));
        instr = scanner.next().toCharArray();
        len.value = instr.length;
        for (i.value = 0; i.value < len.value; i.value++) {
            if (instr[i.value] == 'a' || instr[i.value] == 'e'
                    || instr[i.value] == 'i' || instr[i.value] == 'o'
                    || instr[i.value] == 'u' || instr[i.value] == 'y') {
                s.value = s.value + 1;
            }
        }
        output += (String.format("The number of syllables is %d.\n", s.value));
        if (true)
            return;
        ;
    }

    // syllables_ca505766_003.java
    public void exec7() throws Exception {
        char[] inputString = new char[20];
        IntObj length = new IntObj(), k = new IntObj(), j = new IntObj(), syl =
                new IntObj();
        char[] vowels = new char[6];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        vowels[5] = 'y';
        CharObj temp = new CharObj();
        k.value = 0;
        j.value = 0;
        syl.value = 0;
        output += (String.format("Please enter a string > "));
        inputString = scanner.nextLine().toCharArray();
        length.value = inputString.length;
        for (k.value = 0; (k.value < length.value); k.value++) {
            temp.value = inputString[k.value];
            for (j.value = 0; (j.value < 5); j.value++) {
                if (temp.value == vowels[j.value]) {
                    syl.value = syl.value + 1;
                    j.value = 5;
                }
            }
        }
        output += (String.format("The number of syllables is %d.", syl.value));
        if (true)
            return;
        ;
    }

    // syllables_2af3c416_003.java
    public void exec8() throws Exception {
        int str_size = 20; // modified
        char[] x = new char[str_size];
        IntObj len = new IntObj(), i = new IntObj(), vowels = new IntObj();
        vowels.value = 0;
        output += (String.format("Please enter a string > "));
        x = scanner.next().toCharArray();
        len.value = x.length;
        for (i.value = 0; i.value < len.value; ++i.value) {
            if ((x[i.value] == 'a') || (x[i.value] == 'e') || (x[i.value] == 'i')
                    || (x[i.value] == 'o') || (x[i.value] == 'u')
                    || (x[i.value] == 'y')) {
                vowels.value += 1;
            }
        }
        output +=
                (String.format("The number of syllables is %d.\n", vowels.value));
        if (true)
            return;
        ;
    }

    // syllables_d5059e2b_000.java
    public void exec9() throws Exception {
        char[] list = new char[21];
        IntObj i = new IntObj(0), counter = new IntObj(0), totChar =
                new IntObj();
        output += (String.format("Please enter a string > "));
        list = scanner.next().toCharArray();
        totChar.value = list.length;
        while (i.value < totChar.value) {
            if ((list[i.value] == 'i') || (list[i.value] == 'a')
                    || (list[i.value] == 'e') || (list[i.value] == 'o')
                    || (list[i.value] == 'u') || (list[i.value] == 'y')) {
                counter.value = counter.value + 1;
            }
            i.value++;
        }
        output +=
                (String.format("The number of syllables is %d.\n", counter.value));
        if (true)
            return;
        ;
    }

    // syllables_818f8cf4_007.java
    public void exec10() throws Exception {
        char[] str = new char[20];
        IntObj syllables = new IntObj(0), i = new IntObj(0), len =
                new IntObj();
        output += (String.format("Please enter a string > "));
        str = scanner.next().toCharArray();
        len.value = str.length;
        for (i.value = 0; i.value < len.value; i.value++) {
            if (str[i.value] == 'a') {
                syllables.value++;
            }
            if (str[i.value] == 'e') {
                syllables.value++;
            }
            if (str[i.value] == 'i') {
                syllables.value++;
            }
            if (str[i.value] == 'o') {
                syllables.value++;
            }
            if (str[i.value] == 'u') {
                syllables.value++;
            }
            if (str[i.value] == 'y') {
                syllables.value++;
            }
        }
        output +=
                (String.format("The number of syllables is %d.\n", syllables.value));
        if (true)
            return;
        ;
    }

    // syllables_b6fd408d_000.java
    public void exec11() throws Exception {
        char[] word = new char[40];
        IntObj i = new IntObj(0);
        IntObj count = new IntObj(0);
        output += (String.format("Please enter a string > "));
        word = (scanner.nextLine() + "\n").toCharArray();
        while (i.value < word.length) {
            if (word[i.value] == 'a' || word[i.value] == 'o'
                    || word[i.value] == 'e' || word[i.value] == 'u'
                    || word[i.value] == 'y') {
                count.value++;
            }
            i.value++;
        }
        output +=
                (String.format("The number of syllables is %d.\n", count.value));
        if (true)
            return;
        ;
    }

    // syllables_fcf701e8_002.java
    public void exec12() throws Exception {
        int MAX = 20; // modified
        char[] input = new char[MAX];
        IntObj i = new IntObj(), s = new IntObj(), len = new IntObj();
        output += (String.format("Please enter a string > "));
        input = scanner.next().toCharArray();
        len.value = input.length;
        s.value = 0;
        for (i.value = 0; i.value < len.value; i.value++) {
            switch (input[i.value]) {
                case 'a':
                    s.value++;
                    break;
                case 'e':
                    s.value++;
                    break;
                case 'i':
                    s.value++;
                    break;
                case 'o':
                    s.value++;
                    break;
                case 'u':
                    s.value++;
                    break;
                case 'y':
                    s.value++;
                    break;
                default:
                    break;
            }
        }
        output += (String.format("The number of syllables is %d.\n", s.value));
        if (true)
            return;
        ;
    }
}
