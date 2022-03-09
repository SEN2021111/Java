package Lesson6;

import java.util.Scanner;

public class Dog extends Animal {
    private int runDist;
    private int swimDist;

    public Dog(String name) {
        super(name);
        this.runDist = 500;
        this.swimDist = 10;
    }

    @Override
    public void run(int l) {
        Scanner distDog = new Scanner(System.in);
        do {
            if (l > runDist) {
                System.out.println("Пёс может пробежать только " + runDist + " метров");
                System.out.println("Введите дистанцию бега для пса " + super.getName());
                l = distDog.nextInt();
            }
        } while (l > runDist);
        System.out.println("Пёс пробежал " + l+ " метров");
    }

    @Override
    public void swim(int l) {
        Scanner distDog = new Scanner(System.in);
        do {
            if (l > swimDist) {
                System.out.println("Пёс может проплыть только " + swimDist + " метров");
                System.out.println("Введите дистанцию плавания для пса " + super.getName());
                l = distDog.nextInt();
            }
        } while (l > swimDist);
        System.out.println("Пёс проплыл " + l + " метров");
    }
}
