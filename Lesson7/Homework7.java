package Lesson7;

public class Homework7 {
    public static void main(String[] args) {
        Cat[] catArr = new Cat[3];
        Plate plate = new Plate(2, 8);
        catArr[0] = new Cat("Barsik", 2);
        catArr[1] = new Cat("Murzik",2);
        catArr[2] = new Cat("Murka", 5);
        plate.info();
        for (int i = 0; i < catArr.length; i ++) {
            catArr[i].info();
            catArr[i].eat(plate);
            if (catArr[i].isFullness() == false) {
                plate.setFood();
                catArr[i].eat(plate);
            }
            catArr[i].info();
        }
        plate.info();
    }
}
