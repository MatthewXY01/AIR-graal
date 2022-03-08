package com.mxy;

public class grade {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main(String[] args) throws Exception {
//        grade mainClass = new grade();
//        String output;
//        if (args.length > 0) {
//            mainClass.scanner = new java.util.Scanner(args[0]);
//        } else {
//            mainClass.scanner = new java.util.Scanner(System.in);
//        }
//        mainClass.exec0();
//        System.out.println(mainClass.output);
    }

    // grade_d8b26284_000.java
    public void exec0() throws Exception {
        DoubleObj A = new DoubleObj(), B = new DoubleObj(), C =
                new DoubleObj(), D = new DoubleObj(), score = new DoubleObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextDouble();
        B.value = scanner.nextDouble();
        C.value = scanner.nextDouble();
        D.value = scanner.nextDouble();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextDouble();
        if (score.value < D.value) {
            output += (String.format("Student has an F grade\n"));
        } else if (score.value >= D.value && score.value < C.value) {
            output += (String.format("Student has an D grade\n"));
        } else if (score.value >= C.value && score.value < B.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (score.value >= B.value && score.value < A.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (score.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_89b1a701_003.java
    public void exec1() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), p = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        p.value = scanner.nextFloat();
        if (p.value >= a.value) {
            output += (String.format("Student has an A grade"));
        }
        if (p.value < a.value && p.value >= b.value) {
            output += (String.format("Student has an B grade"));
        }
        if (p.value < b.value && p.value >= c.value) {
            output += (String.format("Student has an C grade"));
        }
        if (p.value < c.value && p.value >= d.value) {
            output += (String.format("Student has an D grade"));
        }
        if (p.value < d.value) {
            output += (String.format("Student has an F grade"));
        }
        output += (String.format("\n"));
        if (true)
            return;
        ;
    }

    // grade_cb243beb_001.java
    public void exec2() throws Exception {
        FloatObj score = new FloatObj(), A = new FloatObj(), B =
                new FloatObj(), C = new FloatObj(), D = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value < A.value && score.value >= B.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (score.value < B.value && score.value >= C.value) {
            output += (String.format("Student has and C grade\n"));
        } else if (score.value < C.value && score.value >= D.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_cb243beb_000.java
    public void exec3() throws Exception {
        FloatObj score = new FloatObj(), A = new FloatObj(), B =
                new FloatObj(), C = new FloatObj(), D = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value < A.value && score.value >= B.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (score.value < B.value && score.value >= C.value) {
            output += (String.format("Student has and C grade\n"));
        } else if (score.value < C.value && score.value >= D.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_dccb1242_001.java
    public void exec4() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj();
        FloatObj score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >  "));
        score.value = scanner.nextFloat();
        if (score.value >= A.value) {
            output += (String.format("Student has an A grade"));
        } else if (score.value < A.value && score.value >= B.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (score.value < B.value && score.value >= C.value) {
            output += (String.format("Studetn has an C grade\n"));
        } else if (score.value < C.value && score.value >= D.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_6e464f2b_000.java
    public void exec5() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), s = new FloatObj();
        CharObj g = new CharObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        s.value = scanner.nextFloat();
        if (s.value < d.value) {
            output += (String.format("Student has failed the course\n"));
        } else if (s.value < c.value) {
            g.value = 'C';
        } else if (s.value < b.value) {
            g.value = 'B';
        } else {
            g.value = 'A';
        }
        if (g.value == 'A' || g.value == 'B' || g.value == 'C') {
            output += (String.format("Student has an %c grade\n", g.value));
        }
        if (true)
            return;
        ;
    }

    // grade_ca94e375_000.java
    public void exec6() throws Exception {
        FloatObj n1 = new FloatObj(), n2 = new FloatObj(), n3 =
                new FloatObj(), n4 = new FloatObj();
        FloatObj perc = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D"));
        output +=
                (String.format("\nin that order, decreasing percentages > "));
        n1.value = scanner.nextFloat();
        n2.value = scanner.nextFloat();
        n3.value = scanner.nextFloat();
        n4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        perc.value = scanner.nextFloat();
        if (perc.value >= n1.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (perc.value >= n2.value && perc.value < n1.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (perc.value >= n3.value && perc.value < n2.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (perc.value >= n4.value && perc.value < n3.value) {
            output += (String.format("Student has a D grade\n"));
        } else if (perc.value < n4.value) {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_387be36e_000.java
    public void exec7() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), grade = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        grade.value = scanner.nextFloat();
        if (grade.value < D.value) {
            output += (String.format("Student has an F grade\n"));
        } else if (grade.value < C.value) {
            output += (String.format("Student has a D grade\n"));
        } else if (grade.value < B.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (grade.value < A.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (grade.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_98d873cd_004.java
    public void exec8() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), student = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D"));
        output +=
                (String.format("\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        student.value = scanner.nextFloat();
        if (student.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (student.value >= b.value) {
            output += (String.format("Student had an B grade\n"));
        } else if (student.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (student.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        } else if (student.value < d.value) {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_48925325_000.java
    public void exec9() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), percent = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\n in that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        percent.value = scanner.nextFloat();
        if (percent.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (percent.value >= B.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (percent.value >= C.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (percent.value >= D.value) {
            output += (String.format("Student has a D grade\n"));
        } else {
            output += (String.format("Student has a F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_48925325_010.java
    public void exec10() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), percent = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        percent.value = scanner.nextFloat();
        if (percent.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (percent.value >= B.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (percent.value >= C.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (percent.value >= D.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_9c9308d4_003.java
    public void exec11() throws Exception {
        DoubleObj A = new DoubleObj(), B = new DoubleObj(), C =
                new DoubleObj(), D = new DoubleObj(), studentscore = new DoubleObj();
        CharObj lettergrade = new CharObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. "));
        A.value = scanner.nextDouble();
        B.value = scanner.nextDouble();
        C.value = scanner.nextDouble();
        D.value = scanner.nextDouble();
        output += (String.format("Now enter student score (perecnt) >"));
        studentscore.value = scanner.nextDouble();
        if (studentscore.value >= A.value) {
            lettergrade.value = 'A';
        } else if (studentscore.value >= B.value) {
            lettergrade.value = 'B';
        } else if (studentscore.value >= C.value) {
            lettergrade.value = 'C';
        } else {
            lettergrade.value = 'D';
        }
        output +=
                (String.format("Student has an %c grade\n", lettergrade.value));
        if (true)
            return;
        ;
    }

    // grade_9c9308d4_007.java
    public void exec12() throws Exception {
        DoubleObj A = new DoubleObj(), B = new DoubleObj(), C =
                new DoubleObj(), D = new DoubleObj(), studentscore = new DoubleObj();
        CharObj lettergrade = new CharObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D \nin that order, decreasing percentages > Thank you. "));
        A.value = scanner.nextDouble();
        B.value = scanner.nextDouble();
        C.value = scanner.nextDouble();
        D.value = scanner.nextDouble();
        output += (String.format("Now enter student score (perecnt) >"));
        studentscore.value = scanner.nextDouble();
        if (studentscore.value >= A.value) {
            lettergrade.value = 'A';
        } else if (studentscore.value >= B.value) {
            lettergrade.value = 'B';
        } else if (studentscore.value >= C.value) {
            lettergrade.value = 'C';
        } else if (studentscore.value >= D.value) {
            lettergrade.value = 'D';
        } else {
            lettergrade.value = 'F';
        }
        output +=
                (String.format("Student has an %c grade\n", lettergrade.value));
        if (true)
            return;
        ;
    }

    // grade_9c9308d4_000.java
    public void exec13() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), studentscore = new FloatObj();
        CharObj lettergrade = new CharObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D in that order, decreasing percentages > Thank you. "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output += (String.format("Now enter student score (perecnt) >"));
        studentscore.value = scanner.nextFloat();
        if (studentscore.value >= A.value) {
            lettergrade.value = 'A';
        } else if (studentscore.value >= B.value) {
            lettergrade.value = 'B';
        } else if (studentscore.value >= C.value) {
            lettergrade.value = 'C';
        } else {
            lettergrade.value = 'D';
        }
        output +=
                (String.format("Student has an %c grade\n", lettergrade.value));
        if (true)
            return;
        ;
    }

    // grade_3cf6d33a_010.java
    public void exec14() throws Exception {
        DoubleObj A = new DoubleObj(), B = new DoubleObj(), C =
                new DoubleObj(), D = new DoubleObj(), score = new DoubleObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        A.value = scanner.nextDouble();
        B.value = scanner.nextDouble();
        C.value = scanner.nextDouble();
        D.value = scanner.nextDouble();
        output +=
                (String.format("\nThank you. Now enter student score (percent) >"));
        score.value = scanner.nextDouble();
        if (score.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value >= B.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (score.value >= C.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (score.value < D.value) {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_d6364e6e_007.java
    public void exec15() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), Std = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        Std.value = scanner.nextFloat();
        if (Std.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
            if (true)
                return;
            ;
        } else if (Std.value >= B.value) {
            output += (String.format("Student has an B grade\n"));
            if (true)
                return;
            ;
        } else if (Std.value >= C.value) {
            output += (String.format("Student has an C grade\n"));
            if (true)
                return;
            ;
        } else if (Std.value >= D.value) {
            output += (String.format("Student has a D grade\n"));
            if (true)
                return;
            ;
        } else if (Std.value < D.value) {
            output += (String.format("Student has failed the course\n"));
            if (true)
                return;
            ;
        } else {
            output +=
                    (String.format
                            ("Program did not understand that grade, please try again and remember to enter a percentage\n"));
            if (true)
                return;
            ;
        }
    }

    // grade_75c98d3d_003.java
    public void exec16() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), grade = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if (grade.value < 60) {
            output += (String.format("Student has failed the course\n"));
        } else if (grade.value < 70) {
            output += (String.format("Student has an D grade\n"));
        } else if (grade.value < 80) {
            output += (String.format("Student has an C grade\n"));
        } else if (grade.value < 90) {
            output += (String.format("Student has an B grade\n"));
        } else {
            output += (String.format("Student has an A grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_bfad6d21_001.java
    public void exec17() throws Exception {
        FloatObj thresha = new FloatObj(), threshb = new FloatObj(), threshc =
                new FloatObj(), threshd = new FloatObj(), stuscore = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        thresha.value = scanner.nextFloat();
        threshb.value = scanner.nextFloat();
        threshc.value = scanner.nextFloat();
        threshd.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        stuscore.value = scanner.nextFloat();
        if (stuscore.value > thresha.value) {
            output += (String.format("Student has an A grade\n"));
        }
        if ((stuscore.value < thresha.value) && (stuscore.value >= threshb.value)) {
            output += (String.format("Student has an B grade\n"));
        }
        if ((stuscore.value < threshb.value) && (stuscore.value >= threshc.value)) {
            output += (String.format("Student has an C grade\n"));
        }
        if ((stuscore.value < threshc.value) && (stuscore.value >= threshd.value)) {
            output += (String.format("Student has an D grade\n"));
        }
        if (stuscore.value < threshd.value) {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_bfad6d21_000.java
    public void exec18() throws Exception {
        FloatObj thresha = new FloatObj(), threshb = new FloatObj(), threshc =
                new FloatObj(), threshd = new FloatObj(), stuscore = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        thresha.value = scanner.nextFloat();
        threshb.value = scanner.nextFloat();
        threshc.value = scanner.nextFloat();
        threshd.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        stuscore.value = scanner.nextFloat();
        if (stuscore.value > thresha.value) {
            output += (String.format("Student has an A grade\n"));
        }
        if ((stuscore.value < thresha.value) && (stuscore.value >= threshb.value)) {
            output += (String.format("Student has an B grade\n"));
        }
        if ((stuscore.value < threshb.value) && (stuscore.value >= threshc.value)) {
            output += (String.format("Student has an C grade\n"));
        }
        if ((stuscore.value < threshc.value) && (stuscore.value >= threshd.value)) {
            output += (String.format("Student has an D grade\n"));
        }
        if (stuscore.value < threshd.value) {
            output += (String.format("Student has failed the course"));
        }
        if (true)
            return;
        ;
    }

    // grade_c9d718f3_002.java
    public void exec19() throws Exception {
        FloatObj grade = new FloatObj(), per1 = new FloatObj(), per2 =
                new FloatObj(), per3 = new FloatObj(), per4 = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        per1.value = scanner.nextFloat();
        per2.value = scanner.nextFloat();
        per3.value = scanner.nextFloat();
        per4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if (grade.value >= per1.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (grade.value >= per2.value && grade.value < per1.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (grade.value >= per3.value && grade.value < per2.value) {
            output += (String.format("Studnet has an C grade\n"));
        } else if (grade.value >= per4.value && grade.value < per3.value) {
            output += (String.format("Student has an D grade\n"));
        } else if (grade.value < per4.value) {
            output += (String.format("Studnet has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_c9d718f3_004.java
    public void exec20() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), g = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        g.value = scanner.nextFloat();
        if (g.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (g.value >= b.value && g.value < a.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (g.value >= c.value && g.value < b.value) {
            output += (String.format("Studnet has an C grade\n"));
        } else if (g.value >= d.value && g.value < c.value) {
            output += (String.format("Student has an D grade\n"));
        } else if (g.value < d.value) {
            output += (String.format("Studnet has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_c9d718f3_001.java
    public void exec21() throws Exception {
        FloatObj grade = new FloatObj(), per1 = new FloatObj(), per2 =
                new FloatObj(), per3 = new FloatObj(), per4 = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        per1.value = scanner.nextFloat();
        per2.value = scanner.nextFloat();
        per3.value = scanner.nextFloat();
        per4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if (grade.value >= per1.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (grade.value >= per2.value && grade.value < per1.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (grade.value >= per3.value && grade.value < per2.value) {
            output += (String.format("Studnet has an C grade\n"));
        } else if (grade.value >= per4.value && grade.value < per3.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Studnet has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_c9d718f3_003.java
    public void exec22() throws Exception {
        FloatObj grade = new FloatObj(), per1 = new FloatObj(), per2 =
                new FloatObj(), per3 = new FloatObj(), per4 = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        per1.value = scanner.nextFloat();
        per2.value = scanner.nextFloat();
        per3.value = scanner.nextFloat();
        per4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if (grade.value >= per1.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (grade.value >= per2.value && grade.value < per1.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (grade.value >= per3.value && grade.value < per2.value) {
            output += (String.format("Studnet has an C grade\n"));
        } else if (grade.value >= per4.value && grade.value < per3.value) {
            output += (String.format("Student has an D grade\n"));
        } else if (grade.value < per4.value) {
            output += (String.format("Studnet has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_c9d718f3_000.java
    public void exec23() throws Exception {
        FloatObj grade = new FloatObj(), per1 = new FloatObj(), per2 =
                new FloatObj(), per3 = new FloatObj(), per4 = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        per1.value = scanner.nextFloat();
        per2.value = scanner.nextFloat();
        per3.value = scanner.nextFloat();
        per4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if (grade.value >= per1.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (grade.value >= per2.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (grade.value >= per3.value) {
            output += (String.format("Studnet has an C grade\n"));
        } else if (grade.value >= per4.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Studnet has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_68ea5d34_000.java
    public void exec24() throws Exception {
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c =
                new DoubleObj(), d = new DoubleObj(), in = new DoubleObj();
        CharObj g = new CharObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        in.value = scanner.nextDouble();
        if (in.value >= a.value) {
            g.value = 'A';
        } else if (in.value >= b.value) {
            g.value = 'B';
        } else if (in.value >= c.value) {
            g.value = 'C';
        } else if (in.value >= d.value) {
            g.value = 'D';
        } else {
            g.value = 'F';
        }
        output += (String.format("Student has an %c grade\n", g.value));
        if (true)
            return;
        ;
    }

    // grade_1b31fa5c_003.java
    public void exec25() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), grade = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if (grade.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
            if (true)
                return;
            ;
        } else if ((grade.value < A.value) && (grade.value >= B.value)) {
            output += (String.format("Student has an B grade\n"));
            if (true)
                return;
            ;
        } else if ((grade.value < B.value) && (grade.value >= D.value)) {
            output += (String.format("Student has an C grade\n"));
            if (true)
                return;
            ;
        } else if ((grade.value < C.value) && (grade.value >= D.value)) {
            output += (String.format("Student has an D grade\n"));
            if (true)
                return;
            ;
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_95362737_015.java
    public void exec26() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= a.value) {
            output += (String.format("Student has a A grade\n"));
        } else if (score.value >= b.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (score.value >= c.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (score.value >= d.value) {
            output += (String.format("Student has a D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_95362737_014.java
    public void exec27() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= a.value) {
            output += (String.format("Student has a A grade\n"));
        }
        if (score.value >= b.value && score.value < a.value) {
            output += (String.format("Student has a B grade\n"));
        }
        if (score.value >= c.value && score.value < b.value) {
            output += (String.format("Student has a C grade\n"));
        }
        if (score.value >= d.value && score.value < c.value) {
            output += (String.format("Student has a D grade\n"));
        }
        if (score.value < d.value) {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_95362737_013.java
    public void exec28() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= a.value) {
            output += (String.format("Student has a A grade\n"));
        } else if (score.value >= b.value && score.value < a.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (score.value >= c.value && score.value < b.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (score.value >= d.value && score.value < c.value) {
            output += (String.format("Student has a D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_95362737_018.java
    public void exec29() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj();
        DoubleObj score = new DoubleObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextDouble();
        if (score.value >= a.value) {
            output += (String.format("Student has a A grade\n"));
        } else if (score.value >= b.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (score.value >= c.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (score.value >= d.value) {
            output += (String.format("Student has a D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_95362737_010.java
    public void exec30() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= a.value) {
            output += (String.format("Student has a A grade\n"));
        } else if (score.value >= b.value && score.value < a.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (score.value >= c.value && score.value < b.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (score.value >= d.value && score.value < c.value) {
            output += (String.format("Student has a D grade\n"));
        } else if (score.value < d.value) {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_ee1f20cc_000.java
    public void exec31() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), A = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages  > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        A.value = scanner.nextFloat();
        if (A.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (A.value < a.value && A.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (A.value < b.value && A.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (A.value < c.value && A.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_317aa705_004.java
    public void exec32() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), percent = new FloatObj();
        CharObj grade = new CharObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages >"));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        percent.value = scanner.nextFloat();
        if (percent.value == 0 && percent.value < A.value
                && percent.value < B.value && percent.value < C.value
                && percent.value < D.value) {
            output += (String.format("Student has failed the course\n"));
        } else if (percent.value >= A.value) {
            grade.value = 'A';
        } else if ((percent.value < A.value) && (percent.value >= B.value)) {
            grade.value = 'B';
        } else if ((percent.value < B.value) && (percent.value >= C.value)) {
            grade.value = 'C';
        } else if ((percent.value < C.value) && (percent.value >= D.value)) {
            grade.value = 'D';
        } else if ((percent.value < D.value) && (percent.value > 0)) {
            grade.value = 'F';
        }
        output += (String.format("Student has an %c grade\n", grade.value));
        if (true)
            return;
        ;
    }

    // grade_317aa705_001.java
    public void exec33() throws Exception {
        DoubleObj A = new DoubleObj(), B = new DoubleObj(), C =
                new DoubleObj(), D = new DoubleObj(), percent = new DoubleObj();
        CharObj grade = new CharObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages >"));
        A.value = scanner.nextDouble();
        B.value = scanner.nextDouble();
        C.value = scanner.nextDouble();
        D.value = scanner.nextDouble();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        percent.value = scanner.nextDouble();
        if (percent.value >= A.value) {
            grade.value = 'A';
        }
        if ((percent.value < A.value) && (percent.value >= B.value)) {
            grade.value = 'B';
        }
        if ((percent.value < B.value) && (percent.value >= C.value)) {
            grade.value = 'C';
        }
        if ((percent.value < C.value) && (percent.value >= D.value)) {
            grade.value = 'D';
        }
        if (percent.value < D.value) {
            grade.value = 'F';
        }
        output += (String.format("Student has an %c grade\n\n", grade.value));
        if (true)
            return;
        ;
    }

    // grade_317aa705_003.java
    public void exec34() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), percent = new FloatObj();
        CharObj grade = new CharObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages >"));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        percent.value = scanner.nextFloat();
        if (percent.value == 0) {
            output += (String.format("Student has failed the course"));
        } else if (percent.value >= A.value) {
            grade.value = 'A';
        } else if ((percent.value < A.value) && (percent.value >= B.value)) {
            grade.value = 'B';
        } else if ((percent.value < B.value) && (percent.value >= C.value)) {
            grade.value = 'C';
        } else if ((percent.value < C.value) && (percent.value >= D.value)) {
            grade.value = 'D';
        } else if ((percent.value < D.value) && (percent.value > 0)) {
            grade.value = 'F';
        }
        if (percent.value != 0) {
            output += (String.format("Student has an %c grade\n\n", grade.value));
        }
        if (true)
            return;
        ;
    }

    // grade_317aa705_000.java
    public void exec35() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), percent = new FloatObj();
        CharObj grade = new CharObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages >"));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        percent.value = scanner.nextFloat();
        if (percent.value >= A.value) {
            grade.value = 'A';
        }
        if ((percent.value < A.value) && (percent.value >= B.value)) {
            grade.value = 'B';
        }
        if ((percent.value < B.value) && (percent.value >= C.value)) {
            grade.value = 'C';
        }
        if ((percent.value < C.value) && (percent.value >= D.value)) {
            grade.value = 'D';
        }
        if (percent.value < D.value) {
            grade.value = 'F';
        }
        output += (String.format("Student has an %c grade\n\n", grade.value));
        if (true)
            return;
        ;
    }

    // grade_36d8008b_000.java
    public void exec36() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), s = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        s.value = scanner.nextFloat();
        if (s.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (s.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (s.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (s.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_833bd42c_003.java
    public void exec37() throws Exception {
        DoubleObj grade_a = new DoubleObj(), grade_b =
                new DoubleObj(), grade_c = new DoubleObj(), grade_d =
                new DoubleObj(), student_score = new DoubleObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        grade_a.value = scanner.nextDouble();
        grade_b.value = scanner.nextDouble();
        grade_c.value = scanner.nextDouble();
        grade_d.value = scanner.nextDouble();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        student_score.value = scanner.nextDouble();
        if (student_score.value >= grade_a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (student_score.value >= grade_b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (student_score.value >= grade_c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (student_score.value >= grade_d.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_295afd89_010.java
    public void exec38() throws Exception {
        FloatObj a = new FloatObj();
        FloatObj b = new FloatObj();
        FloatObj c = new FloatObj();
        FloatObj d = new FloatObj();
        FloatObj perc = new FloatObj();
        CharObj grade = new CharObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        perc.value = scanner.nextFloat();
        if (perc.value > a.value) {
            grade.value = 'A';
        } else if (perc.value > b.value) {
            grade.value = 'B';
        } else if (perc.value > c.value) {
            grade.value = 'C';
        } else if (perc.value > d.value) {
            grade.value = 'D';
        } else {
            grade.value = 'F';
        }
        output += (String.format("Student has an %c grade\n", grade.value));
        if (true)
            return;
        ;
    }

    // grade_e23b96b6_002.java
    public void exec39() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj();
        FloatObj percent = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        percent.value = scanner.nextFloat();
        if (percent.value > a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (percent.value < a.value && percent.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (percent.value < b.value && percent.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (percent.value < c.value && percent.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        } else if (percent.value < d.value) {
            output += (String.format("Student has failed that course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_e23b96b6_004.java
    public void exec40() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj();
        FloatObj percent = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        percent.value = scanner.nextFloat();
        if (percent.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (percent.value <= a.value && percent.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (percent.value < b.value && percent.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (percent.value < c.value && percent.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        } else if (percent.value < d.value) {
            output += (String.format("Student has failed that course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_e23b96b6_001.java
    public void exec41() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj();
        FloatObj percent = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        percent.value = scanner.nextFloat();
        if (percent.value > a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (percent.value <= a.value && percent.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (percent.value <= b.value && percent.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (percent.value <= c.value && percent.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        } else if (percent.value < d.value) {
            output += (String.format("Student has failed that course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_e23b96b6_003.java
    public void exec42() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj();
        FloatObj percent = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        percent.value = scanner.nextFloat();
        if (percent.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (percent.value < a.value && percent.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (percent.value < b.value && percent.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (percent.value < c.value && percent.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        } else if (percent.value < d.value) {
            output += (String.format("Student has failed that course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_e23b96b6_000.java
    public void exec43() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj();
        FloatObj score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value > a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value <= a.value && score.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (score.value <= b.value && score.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (score.value <= c.value && score.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has failed that course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_fe9d5fb9_004.java
    public void exec44() throws Exception {
        FloatObj grade1 = new FloatObj(), grade2 = new FloatObj(), grade3 =
                new FloatObj(), grade4 = new FloatObj(), score = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        grade1.value = scanner.nextFloat();
        grade2.value = scanner.nextFloat();
        grade3.value = scanner.nextFloat();
        grade4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat();
        if (score.value >= grade1.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value >= grade2.value && score.value < grade1.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (score.value >= grade3.value && score.value < grade2.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (score.value >= grade4.value && score.value < grade3.value) {
            output += (String.format("Student has a D grade\n"));
        } else {
            output += (String.format("Student has failed the course.\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_fe9d5fb9_003.java
    public void exec45() throws Exception {
        FloatObj grade1 = new FloatObj(), grade2 = new FloatObj(), grade3 =
                new FloatObj(), grade4 = new FloatObj(), score = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        grade1.value = scanner.nextFloat();
        grade2.value = scanner.nextFloat();
        grade3.value = scanner.nextFloat();
        grade4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat();
        if (score.value >= grade1.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value >= grade2.value && score.value < grade1.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (score.value >= grade3.value && score.value < grade2.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (score.value >= grade4.value && score.value < grade3.value) {
            output += (String.format("Student has a D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_0cdfa335_003.java
    public void exec46() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        }
        if (score.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        }
        if (score.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        }
        if (score.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_90834803_009.java
    public void exec47() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), grade = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if (grade.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (grade.value >= B.value && grade.value <= A.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (grade.value >= C.value && grade.value <= B.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (grade.value >= D.value && grade.value <= C.value) {
            output += (String.format("Student has an D grade\n"));
        } else if (grade.value < D.value) {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_90834803_013.java
    public void exec48() throws Exception {
        DoubleObj A = new DoubleObj(), B = new DoubleObj(), C =
                new DoubleObj(), D = new DoubleObj(), grade = new DoubleObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextDouble();
        B.value = scanner.nextDouble();
        C.value = scanner.nextDouble();
        D.value = scanner.nextDouble();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextDouble();
        if (grade.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (grade.value >= B.value && grade.value < A.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (grade.value >= C.value && grade.value < B.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (grade.value >= D.value && grade.value < C.value) {
            output += (String.format("Student has an D grade\n"));
        } else if (grade.value < D.value) {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_90834803_010.java
    public void exec49() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), grade = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if (grade.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (grade.value >= B.value && grade.value < A.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (grade.value >= C.value && grade.value < B.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (grade.value >= D.value && grade.value < C.value) {
            output += (String.format("Student has an D grade\n"));
        } else if (grade.value < D.value) {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_07045530_002.java
    public void exec50() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), score = new FloatObj();
        CharObj grade = new CharObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat();
        if (score.value >= a.value) {
            grade.value = 'A';
        } else if ((score.value >= b.value) && (score.value < a.value)) {
            grade.value = 'B';
        } else if ((score.value >= c.value) && (score.value < b.value)) {
            grade.value = 'C';
        } else if ((score.value >= d.value) && (score.value < c.value)) {
            grade.value = 'D';
        }
        output += (String.format("Student has an %c grade\n", grade.value));
        if (true)
            return;
        ;
    }

    // grade_dc11fbc9_000.java
    public void exec51() throws Exception {
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c =
                new DoubleObj(), d = new DoubleObj();
        DoubleObj score = new DoubleObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextDouble();
        if (score.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value >= b.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (score.value >= c.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (score.value >= d.value) {
            output += (String.format("Student has a D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_b1924d63_001.java
    public void exec52() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D \nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if ((score.value >= b.value) && (score.value > a.value)) {
            output += (String.format("Student has an B grade\n"));
        } else if ((score.value >= c.value) && (score.value < b.value)) {
            output += (String.format("Student has an C grade\n"));
        } else if ((score.value >= d.value) && (score.value < c.value)) {
            output += (String.format("Student has an D grade\n"));
        } else if (score.value < d.value) {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_b1924d63_003.java
    public void exec53() throws Exception {
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c =
                new DoubleObj(), d = new DoubleObj(), score = new DoubleObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D \nin that order, decreasing percentages > "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextDouble();
        if (score.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if ((score.value >= b.value) && (score.value > a.value)) {
            output += (String.format("Student has an B grade\n"));
        } else if ((score.value >= c.value) && (score.value < b.value)) {
            output += (String.format("Student has an C grade\n"));
        } else if ((score.value >= d.value) && (score.value < c.value)) {
            output += (String.format("Student has an D grade\n"));
        } else if (score.value < d.value) {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_b1924d63_000.java
    public void exec54() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D \nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if ((score.value >= b.value) && (score.value > a.value)) {
            output += (String.format("Student has an A grade\n"));
        } else if ((score.value >= c.value) && (score.value < b.value)) {
            output += (String.format("Student has an A grade\n"));
        } else if ((score.value >= d.value) && (score.value < c.value)) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value < d.value) {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_aaceaf4a_003.java
    public void exec55() throws Exception {
        FloatObj n = new FloatObj(), a = new FloatObj(), b =
                new FloatObj(), c = new FloatObj(), d = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        n.value = scanner.nextFloat();
        if (n.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        }
        if ((n.value < a.value) && (n.value >= b.value)) {
            output += (String.format("Student has an B grade\n"));
        }
        if ((n.value < b.value) && (n.value >= c.value)) {
            output += (String.format("Student has an C grade\n"));
        }
        if ((n.value < c.value) && (n.value >= d.value)) {
            output += (String.format("Student has an D grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_9013bd3b_000.java
    public void exec56() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), avg = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (perrcent) >"));
        avg.value = scanner.nextFloat();
        if (avg.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        }
        if (avg.value >= B.value && avg.value < A.value) {
            output += (String.format("Student has an B grade\n"));
        }
        if (avg.value >= C.value && avg.value < B.value) {
            output += (String.format("Student has an C grade\n"));
        }
        if (avg.value >= D.value && avg.value < C.value) {
            output += (String.format("Student has an D grade\n"));
        }
        if (avg.value < D.value) {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_f5b56c79_000.java
    public void exec57() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), score = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value > A.value) {
            output += (String.format("Stdent has an A grade\n"));
        } else if (score.value < A.value && score.value > B.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (score.value < B.value && score.value > C.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (score.value < C.value && score.value > D.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_f5b56c79_010.java
    public void exec58() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), score = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= A.value) {
            output += (String.format("Stdent has an A grade\n"));
        } else if (score.value < A.value && score.value >= B.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (score.value < B.value && score.value >= C.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (score.value < C.value && score.value >= D.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_cd2d9b5b_006.java
    public void exec59() throws Exception {
        FloatObj num1 = new FloatObj(), num2 = new FloatObj(), num3 =
                new FloatObj(), num4 = new FloatObj();
        FloatObj score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        num1.value = scanner.nextFloat();
        num2.value = scanner.nextFloat();
        num3.value = scanner.nextFloat();
        num4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value > num1.value) {
            output += (String.format("Student has an A grade"));
        } else if (score.value >= num2.value) {
            output += (String.format("Student has an B grade"));
        } else if (score.value >= num3.value) {
            output += (String.format("Student has an C grade"));
        } else {
            output += (String.format("Student has an D grade"));
        }
        if (true)
            return;
        ;
    }

    // grade_cd2d9b5b_009.java
    public void exec60() throws Exception {
        FloatObj num1 = new FloatObj(), num2 = new FloatObj(), num3 =
                new FloatObj(), num4 = new FloatObj();
        FloatObj score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        num1.value = scanner.nextFloat();
        num2.value = scanner.nextFloat();
        num3.value = scanner.nextFloat();
        num4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= num1.value) {
            output += (String.format("Student has an A grade"));
        } else if (score.value >= num2.value) {
            output += (String.format("Student has an B grade"));
        } else if (score.value >= num3.value) {
            output += (String.format("Student has an C grade"));
        } else if (score.value >= num4.value) {
            output += (String.format("Student has an D grade"));
        }
        output += (String.format("\n"));
        if (true)
            return;
        ;
    }

    // grade_cd2d9b5b_003.java
    public void exec61() throws Exception {
        FloatObj num1 = new FloatObj(), num2 = new FloatObj(), num3 =
                new FloatObj(), num4 = new FloatObj();
        FloatObj score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        num1.value = scanner.nextFloat();
        num2.value = scanner.nextFloat();
        num3.value = scanner.nextFloat();
        num4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        output += (String.format("Student has an A grade"));
        output +=
                (String.format
                        ("%f%f%f%f%f", num1.value, num2.value, num3.value, num4.value,
                                score.value));
        if (true)
            return;
        ;
    }

    // grade_cd2d9b5b_013.java
    public void exec62() throws Exception {
        FloatObj num1 = new FloatObj(), num2 = new FloatObj(), num3 =
                new FloatObj(), num4 = new FloatObj();
        FloatObj score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        num1.value = scanner.nextFloat();
        num2.value = scanner.nextFloat();
        num3.value = scanner.nextFloat();
        num4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= num1.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value >= num2.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (score.value >= num3.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (score.value >= num4.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_cd2d9b5b_007.java
    public void exec63() throws Exception {
        FloatObj num1 = new FloatObj(), num2 = new FloatObj(), num3 =
                new FloatObj(), num4 = new FloatObj();
        FloatObj score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        num1.value = scanner.nextFloat();
        num2.value = scanner.nextFloat();
        num3.value = scanner.nextFloat();
        num4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value > num1.value) {
            output += (String.format("Student has an A grade"));
        } else if (score.value >= num2.value) {
            output += (String.format("Student has an B grade"));
        } else if (score.value >= num3.value) {
            output += (String.format("Student has an C grade"));
        } else if (score.value >= num4.value) {
            output += (String.format("Student has an D grade"));
        }
        if (true)
            return;
        ;
    }

    // grade_cd2d9b5b_008.java
    public void exec64() throws Exception {
        FloatObj num1 = new FloatObj(), num2 = new FloatObj(), num3 =
                new FloatObj(), num4 = new FloatObj();
        FloatObj score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        num1.value = scanner.nextFloat();
        num2.value = scanner.nextFloat();
        num3.value = scanner.nextFloat();
        num4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= num1.value) {
            output += (String.format("Student has an A grade"));
        } else if (score.value >= num2.value) {
            output += (String.format("Student has an B grade"));
        } else if (score.value >= num3.value) {
            output += (String.format("Student has an C grade"));
        } else if (score.value >= num4.value) {
            output += (String.format("Student has an D grade"));
        }
        if (true)
            return;
        ;
    }

    // grade_cd2d9b5b_010.java
    public void exec65() throws Exception {
        FloatObj num1 = new FloatObj(), num2 = new FloatObj(), num3 =
                new FloatObj(), num4 = new FloatObj();
        FloatObj score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        num1.value = scanner.nextFloat();
        num2.value = scanner.nextFloat();
        num3.value = scanner.nextFloat();
        num4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= num1.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value >= num2.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (score.value >= num3.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (score.value >= num4.value) {
            output += (String.format("Student has an D grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_d009aa71_003.java
    public void exec66() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat();
        if (score.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value >= B.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (score.value >= C.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (score.value >= D.value) {
            output += (String.format("Student has a D grade\n"));
        } else if (score.value < D.value) {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_d009aa71_000.java
    public void exec67() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat();
        if (score.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        }
        if ((score.value < A.value) && (score.value >= B.value)) {
            output += (String.format("Student has a B grade\n"));
        }
        if ((score.value < B.value) && (score.value >= C.value)) {
            output += (String.format("Student has a C grade\n"));
        }
        if ((score.value < C.value) && (score.value >= D.value)) {
            output += (String.format("Student has a D grade\n"));
        }
        if (score.value < D.value) {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_48b82975_000.java
    public void exec68() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), e = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages >"));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        e.value = scanner.nextFloat();
        if (e.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (e.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (e.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (e.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_30074a0e_004.java
    public void exec69() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), Grade = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        Grade.value = scanner.nextFloat();
        if (Grade.value >= A.value) {
            output += (String.format("the student has an A grade\n"));
        }
        if (Grade.value >= B.value && Grade.value < A.value) {
            output += (String.format("the student has an B grade\n"));
        }
        if (Grade.value >= C.value && Grade.value < B.value) {
            output += (String.format("the student has an C grade\n"));
        }
        if (Grade.value < C.value && Grade.value >= D.value) {
            output += (String.format("the student has an D grade\n"));
        }
        if (Grade.value < D.value) {
            output += (String.format("the student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_5b504b35_000.java
    public void exec70() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), grade = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if (grade.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (grade.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (grade.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (grade.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_92b7dd12_002.java
    public void exec71() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), score = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= A.value) {
            output += (String.format("Student has a A grade\n"));
        } else if (score.value >= B.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (score.value >= C.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (score.value >= D.value) {
            output += (String.format("Student has a D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_1c2bb3a4_003.java
    public void exec72() throws Exception {
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c =
                new DoubleObj(), d = new DoubleObj(), e = new DoubleObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > Thank you. "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        output += (String.format("Now enter student score (percent) >"));
        e.value = scanner.nextDouble();
        if (e.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (e.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (e.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (e.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_1c2bb3a4_000.java
    public void exec73() throws Exception {
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c =
                new DoubleObj(), d = new DoubleObj(), e = new DoubleObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > Thank you. "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        output += (String.format("Now enter student score (percent) >"));
        e.value = scanner.nextDouble();
        if (e.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (e.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (e.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else {
            output += (String.format("Student has an D grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_b6fd408d_000.java
    public void exec74() throws Exception {
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c =
                new DoubleObj(), d = new DoubleObj();
        DoubleObj score = new DoubleObj();
        CharObj grade = new CharObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        output +=
                (String.format("Thank you.  Now enter student score (percent) >"));
        score.value = scanner.nextDouble();
        if (score.value >= a.value) {
            grade.value = 'A';
        } else if (score.value >= b.value) {
            grade.value = 'B';
        } else if (score.value >= c.value) {
            grade.value = 'C';
        } else if (score.value >= d.value) {
            grade.value = 'D';
        } else {
            grade.value = 'F';
        }
        output += (String.format("Student has an %c grade\n", grade.value));
        if (true)
            return;
        ;
    }

    // grade_3b2376ab_007.java
    public void exec75() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), grade = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if (grade.value >= A.value) {
            output += (String.format("Student has an A grade"));
        } else if (A.value > grade.value && grade.value >= B.value) {
            output += (String.format("Student has an B grade"));
        } else if (B.value > grade.value && grade.value >= C.value) {
            output += (String.format("Student has an C grade"));
        } else {
            output += (String.format("Student has an D grade"));
        }
        output += (String.format("\n"));
        if (true)
            return;
        ;
    }

    // grade_af81ffd4_002.java
    public void exec76() throws Exception {
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c =
                new DoubleObj(), d = new DoubleObj();
        DoubleObj per = new DoubleObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        per.value = (a.value + b.value + c.value + d.value) / 4;
        if (per.value < 60) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student has an B grade\n"));
        } else if (per.value >= 60 && per.value < 70) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student has an B grade\n"));
        } else if (per.value >= 70 && per.value < 80) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student has an B grade\n"));
        } else if (per.value >= 80) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student has an B grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_af81ffd4_009.java
    public void exec77() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj(), score = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat();
        if (score.value >= a.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value >= b.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (score.value >= c.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (score.value >= d.value) {
            output += (String.format("Student has an D grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_af81ffd4_001.java
    public void exec78() throws Exception {
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c =
                new DoubleObj(), d = new DoubleObj();
        DoubleObj per = new DoubleObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        per.value = (a.value + b.value + c.value + d.value) / 4;
        if (per.value < 60) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student has an D grade\n"));
        } else if (per.value >= 60 && per.value < 70) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Studnet has an C grade\n"));
        } else if (per.value >= 70 && per.value < 80) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student has an B grade\n"));
        } else if (per.value >= 80) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student ahs an A grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_af81ffd4_007.java
    public void exec79() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj();
        DoubleObj per = new DoubleObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        per.value = (a.value + b.value + c.value + d.value) / 4;
        if (per.value < 60) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student has an B grade\n"));
        } else if (per.value >= 60 && per.value < 70) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student has an B grade\n"));
        } else if (per.value >= 70 && per.value < 80) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student has an B grade\n"));
        } else if (per.value >= 80) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student has an B grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_af81ffd4_000.java
    public void exec80() throws Exception {
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c =
                new DoubleObj(), d = new DoubleObj();
        DoubleObj per = new DoubleObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        per.value = (a.value + b.value + c.value + d.value) / 4;
        if (per.value < 60) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student has an B grade\n"));
        } else if (per.value >= 60 && per.value < 70) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Studnet has an B grade\n"));
        } else if (per.value >= 70 && per.value < 80) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student has an B grade\n"));
        } else if (per.value >= 80) {
            output +=
                    (String.format
                            ("Thank you. Now enter student score (percent) >Student ahs an B grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_0cea42f9_002.java
    public void exec81() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), score = new FloatObj();
        output += (String.format("Enter threshold for A, B, C, D\n"));
        output += (String.format("in this order, decreasing persentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat();
        if (score.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value < A.value && score.value >= B.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (score.value < B.value && score.value >= C.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (score.value < C.value && score.value >= D.value) {
            output += (String.format("Student has a D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_0cea42f9_001.java
    public void exec82() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), score = new FloatObj();
        output += (String.format("Enter threshold for grades A, B, C, D\n"));
        output += (String.format("in this order, decreasing persentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat();
        if (score.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        } else if (score.value < A.value && score.value >= B.value) {
            output += (String.format("Student has a B grade\n"));
        } else if (score.value < B.value && score.value >= C.value) {
            output += (String.format("Student has a C grade\n"));
        } else if (score.value < C.value && score.value >= D.value) {
            output += (String.format("Student has a D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_0cea42f9_003.java
    public void exec83() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), score = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\n"));
        output += (String.format("in that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat();
        if (score.value >= A.value) {
            output += (String.format("Stdent has an A grade\n"));
        } else if (score.value < A.value && score.value >= B.value) {
            output += (String.format("Student has an B grade\n"));
        } else if (score.value < B.value && score.value >= C.value) {
            output += (String.format("Student has an C grade\n"));
        } else if (score.value < C.value && score.value >= D.value) {
            output += (String.format("Student has an D grade\n"));
        } else {
            output += (String.format("Student has failed the course\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_0cea42f9_000.java
    public void exec84() throws Exception {
        FloatObj a = new FloatObj(), b = new FloatObj(), c =
                new FloatObj(), d = new FloatObj();
        output += (String.format("Enter threshold for grades A,B,C,D\n"));
        output += (String.format("in this order, decreasing persentages > "));
        a.value = scanner.nextFloat();
        b.value = scanner.nextFloat();
        c.value = scanner.nextFloat();
        d.value = scanner.nextFloat();
        if (a.value > b.value && b.value > c.value && c.value > d.value) {
            output +=
                    (String.format("Thank you. Now enter student score (percent) > "));
            FloatObj num = new FloatObj();
            num.value = scanner.nextFloat();
            if (num.value >= a.value) {
                output += (String.format("Student has an A grade\n"));
            } else if (num.value < a.value && num.value >= b.value) {
                output += (String.format("Student has a B grade\n"));
            } else if (num.value < b.value && num.value >= c.value) {
                output += (String.format("Student has a C grade\n"));
            } else if (num.value < c.value && num.value >= d.value) {
                output += (String.format("Student has a D grade\n"));
            } else if (num.value < d.value) {
                output += (String.format("Student has failed the course\n"));
            } else {
                output +=
                        (String.format
                                ("there is some missunderstanding in threshold \n Please try again\n"));
            }
        }
        if (true)
            return;
        ;
    }

    // grade_769cd811_000.java
    public void exec85() throws Exception {
        FloatObj A = new FloatObj(), B = new FloatObj(), C =
                new FloatObj(), D = new FloatObj(), S = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) >"));
        S.value = scanner.nextFloat();
        if (S.value >= A.value) {
            output += (String.format("Student has an A grade\n"));
        }
        if (S.value >= B.value && S.value < A.value) {
            output += (String.format("Student has an B grade\n"));
        }
        if (S.value >= C.value && S.value < B.value) {
            output += (String.format("Student has an C grade\n"));
        }
        if (S.value >= D.value && S.value < C.value) {
            output += (String.format("Student has an D grade\n"));
        }
        if (S.value < D.value) {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_93f87bf2_015.java
    public void exec86() throws Exception {
        FloatObj score = new FloatObj(), A = new FloatObj(), B =
                new FloatObj(), C = new FloatObj(), D = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D \n in that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat();
        if ((score.value >= (A.value))) {
            output += (String.format("Student has an A grade\n"));
        } else if ((score.value >= (B.value)) && (score.value < (A.value))) {
            output += (String.format("Student has an B grade\n"));
        } else if ((score.value >= (C.value)) && (score.value < (B.value))) {
            output += (String.format("Student has an C grade\n"));
        } else if ((score.value >= (D.value)) && (score.value < (C.value))) {
            output += (String.format("Student has an D grade\n"));
        } else if ((score.value < (D.value))) {
            output += (String.format("Student has an F grade\n"));
        }
        if (true)
            return;
        ;
    }

    // grade_a0e3fdae_012.java
    public void exec87() throws Exception {
        FloatObj th_1 = new FloatObj(), th_2 = new FloatObj(), th_3 =
                new FloatObj(), th_4 = new FloatObj(), score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D\n in that order, decreasing percentages> "));
        th_1.value = scanner.nextFloat();
        th_2.value = scanner.nextFloat();
        th_3.value = scanner.nextFloat();
        th_4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat();
        if (score.value >= th_1.value) {
            output += (String.format("Student has an A grade \n"));
        } else {
            if (th_2.value <= score.value && score.value < th_1.value) {
                output += (String.format("Student has an B grade \n"));
            } else {
                if (th_3.value <= score.value && score.value < th_2.value) {
                    output += (String.format("Student has an C grade \n"));
                } else {
                    if (th_4.value <= score.value && score.value < th_3.value) {
                        output += (String.format("Student has an D grade \n"));
                    } else {
                        if (score.value < th_4.value) {
                            output += (String.format("Student has an F grade \n"));
                        }
                    }
                }
            }
        }
        if (true)
            return;
        ;
    }

    // grade_a0e3fdae_010.java
    public void exec88() throws Exception {
        FloatObj th_1 = new FloatObj(), th_2 = new FloatObj(), th_3 =
                new FloatObj(), th_4 = new FloatObj(), score = new FloatObj();
        output +=
                (String.format
                        ("Enter thresholds for A, B, C, D \n in that order, decreasing percentages> "));
        th_1.value = scanner.nextFloat();
        th_2.value = scanner.nextFloat();
        th_3.value = scanner.nextFloat();
        th_4.value = scanner.nextFloat();
        output +=
                (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat();
        if (score.value >= th_1.value) {
            output += (String.format("Student has an A grade \n"));
        } else {
            if (th_2.value <= score.value && score.value < th_1.value) {
                output += (String.format("Student has an B grade \n"));
            } else {
                if (th_3.value <= score.value && score.value < th_2.value) {
                    output += (String.format("Student has an C grade \n"));
                } else {
                    if (th_4.value <= score.value && score.value < th_3.value) {
                        output += (String.format("Student has an D grade \n"));
                    } else {
                        if (score.value < th_4.value) {
                            output += (String.format("Student has an F grade \n"));
                        }
                    }
                }
            }
        }
        if (true)
            return;
        ;
    }
}
