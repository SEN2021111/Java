package Lesson2;

public class Homework2 {
    public static void main (String[] args) {
        System.out.println(ChekSum(2,100));
        IsPositiveOrNegative (-2);
        System.out.println(ChekNumber(0));
        PrintStr("Hello",2);
        System.out.println(TypeOfYear(2013));
    }

    // Задание 1
    public static boolean ChekSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    // Задание 2
    public static void IsPositiveOrNegative (int i) {
        if (i >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }

    //Задание 3
    public static boolean ChekNumber(int a) {
        return a <= 0;
    }

    //Задание 4
    public static void PrintStr (String s, int n) {
        String msg;
        for (int i = 1;i <= n;i++) {
            msg = Integer.toString(i).concat(". ").concat(s);
            System.out.println(msg);
        }
    }

    //Задание 5
    public static boolean TypeOfYear (int year) {
        boolean result = false;
        if ((year % 4) == 0) {
            if ((year % 100) != 0 || (year % 400) == 0) {
                result = true;
            }
        }
        return result;
    }
}
