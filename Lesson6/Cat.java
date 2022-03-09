package Lesson6;

import java.util.Scanner;

public class Cat extends Animal {

    private int runDist;

    public Cat(String name) {
        super(name);
        this.runDist = 200;
    }

    @Override
    public void run(int l) {
        System.out.println("Кот пробежал " + l + " метров");
    }

    @Override
    public void swim(int l) {
        System.out.println("Кот плавать не умеет");
    }

    public int getDist(){
        return runDist;
    }
}
