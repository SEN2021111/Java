public class Homework2 {
    public static void main(String[] args) {
        System.out.println("- Задание 1");
        System.out.println(chekSum(2, 100));
        System.out.println("- Задание 2");
        isPositiveOrNegative(-2);
        System.out.println("- Задание 3");
        System.out.println(chekNumber(85));
        System.out.println("- Задание 4");
        printStr("Hello", 4);
        System.out.println("- Задание 5");
        System.out.println(typeOfYear(2012));
    }

    // Задание 1
    public static boolean chekSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    // Задание 2
    public static void isPositiveOrNegative(int i) {
        if (i >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    //Задание 3
    public static boolean chekNumber(int a) {
        return a <= 0;
    }

    //Задание 4
    public static void printStr(String s, int n) {
        String msg;
        for (int i = 1; i <= n; i++) {
            msg = Integer.toString(i).concat(". ").concat(s);
            System.out.println(msg);
        }
    }

    //Задание 5
    public static boolean typeOfYear(int year) {
        boolean result = false;
        if ((year % 4) == 0) {
            if ((year % 100) != 0 || (year % 400) == 0) {
                result = true;
            }
        }
        return result;
    }
}