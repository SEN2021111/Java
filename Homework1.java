public class Homework1 {
    public static void main(String[] args) {
        System.out.println("-Вызывается функция вывода трех слов");
        printThreeWords();
        System.out.println("-Вызывается функция проверки суммы");
        checkSumSign();
        System.out.println("-Вызывается функция цветов");
        printColor();
        System.out.println("-Вызывается функция сравнения переменных");
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c < 0 ? "Сумма отрицательная" : "Сумма положительная");
    }

    static void printColor() {
        int value;
        value = -200;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a, b;
        a = 1;
        b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}
