
import java.util.Arrays;

public class Homework3 {
    public static void main (String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        System.out.println("Задание 5:" + "\n" + Arrays.toString(exercise5(5, 5)));
        exercise6();
    }

    static void exercise1() {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 0};
        System.out.println("Задание 1. Исходный массив: " + "\n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        System.out.println("Задание 1. Инвертированный массив: " + "\n" + Arrays.toString(arr));
    }

    static void exercise2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = i + 1;
        }
        System.out.println("Задание 2. Массив: " + "\n" + Arrays.toString(arr));
    }

    static void exercise3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3. Исходный массив: " + "\n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = arr[i] < 6 ? arr[i] = arr[i] * 2 : arr[i];
        }
        System.out.println("Задание 3. Преобразованный массив: " + "\n"  + Arrays.toString(arr));
    }

    static void exercise4() {
        int[][] arr = new int[5][5];
        System.out.println("Задание 4: ");
        for (int i = 0; i < arr.length; i ++) {
            arr[i][i] = 1;
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j ++, x --) {
                if (i == x) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    static int[] exercise5(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    static void exercise6() {
        int[] arr = new int[5];
        int max, min, i;
        for (i = 0; i < arr.length; i ++) {
            arr[i] = (int)(Math.random() * 10);
        }
        System.out.println("Задание 6. " + "\n" + "Массив: " + "\n" + Arrays.toString(arr));
        min = arr[0];
        max = arr [0];
        for (i = 0; i < arr.length; i ++) {
            min = arr[i] < min ? min = arr[i] : min;
            max = arr[i] > max ? max = arr[i] : max;
        }
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }

}
