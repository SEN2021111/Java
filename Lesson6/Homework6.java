package Lesson6;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Animal anim = new Animal();
        System.out.println("Всего животных " + anim.getCount());
        Cat cat = new Cat("Боря");
        System.out.println("Всего животных " + anim.getCount());
        Dog dog = new Dog("Федор");
        System.out.println("Всего животных " + anim.getCount());
        int dist1, dist2, dist3;

        Scanner distCat = new Scanner(System.in);
        System.out.println("Введите дистанцию бега для кота " + cat.getName());
        dist1 = distCat.nextInt();
        do {
            if (dist1 > cat.getDist()) {
                System.out.println("Кот может пробежать только " + cat.getDist() + " метров");
                System.out.println("Введите дистанцию бега для кота " + cat.getName() + " метров");
                dist1 = distCat.nextInt();
            }
        } while (dist1 > cat.getDist());
        cat.run(dist1);
        cat.swim(dist1);

        Scanner distDog = new Scanner(System.in);
        System.out.println("Введите дистанцию бега для собаки " + dog.getName());
        dist2 = distDog.nextInt();
        dog.run(dist2);

        Scanner dist2Dog = new Scanner(System.in);
        System.out.println("Введите дистанцию плавания для собаки " + dog.getName());
        dist3 = dist2Dog.nextInt();
        dog.swim(dist3);
    }
}



