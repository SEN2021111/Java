package Lesson7;

public class Plate {
    private int food;
    private int plateSize;

    public int getFood() {
        return food;
    }

    public Plate(int food, int plateSize) {
        this.food = food;
        this.plateSize = plateSize;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void setFood() {
        this.food = plateSize;
        System.out.println("Тарелка наполнена");
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}

