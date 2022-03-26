package Lesson7;

public class Homework7 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 1);
        Plate plate = new Plate(10);
        plate.info();
        cat.info();
        cat.eat(plate);
        cat.info();
        plate.info();

    }
}
