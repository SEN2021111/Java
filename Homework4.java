import java.util.Scanner;
import java.util.Random;

public class Homework4 {
    Random random;
    Scanner scanner;
    char[][] table;
    int gameSize;

    public static void main(String[] args) {
        System.out.println("Введите размер поля: ");
        Scanner size = new Scanner(System.in);
        new Homework4(size.nextInt()).game();
    }
    Homework4(int s) {
        System.out.println("constructor");
        table = new char[s][s];
        random = new Random();
        scanner = new Scanner(System.in);
        gameSize = s;
    }

    void game() {
        initTable(gameSize);
        printTable();
        while (true) {
            turnHuman();
            if (chekWin('x')) {
                System.out.println("You won");
                printTable();
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry. Draw.");
                printTable();
                break;
            }
            turnAI();
            if (chekWin('o')) {
                System.out.println("I won");
                printTable();
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry. Draw.");
                printTable();
                break;
            }
            printTable();
        }
        System.out.println("Game over");
    }

    void initTable(int n) {
        for (int x = 0;x < n; x ++) {
            for (int  y = 0; y < n; y ++) {
                table[x][y] = '.';
            }
        }
    }

    void printTable() {
        for (int x = 0;x < gameSize; x ++) {
            for (int  y = 0; y < gameSize; y ++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Введите x, y: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = 'x';
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(gameSize);
            y = random.nextInt(gameSize);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > gameSize || y > gameSize) {
            return false;
        }
        return table[x][y] == '.';
    }

    boolean chekWin(char ch) {
        int cnt_h = 0;
        int cnt_v = 0;
        int cnt_d = 0;
        int cnt_d2 = 0;
        for (int i = 0; i < gameSize; i ++) {
            for (int j = 0, x = gameSize - 1; j < gameSize; j ++, x --) {
                if (table[i][j] == ch) cnt_h ++;
                if (table[j][i] == ch) cnt_v ++;
                if (i == j && table[i][j] == ch) cnt_d ++;
                if (i == x && table[j][x] == ch) cnt_d2 ++;
                if (cnt_h == gameSize || cnt_v == gameSize || cnt_d == gameSize || cnt_d2 == gameSize) return true;
            }
            cnt_h = 0;
            cnt_v = 0;
        }
        return false;
    }

    boolean isTableFull() {
        for (int x = 0;x < gameSize; x ++) {
            for (int  y = 0; y < gameSize; y ++) {
                if (table[x][y] == '.') {
                    return  false;
                }
            }
        }
        return  true;
    }
}
