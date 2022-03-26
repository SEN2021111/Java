package Lesson7;

public class Cat {
    private String name;
    private int appetite;

    public boolean isFullness() {
        return fullness;
    }

    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            fullness = true;
            System.out.println("Кот " + name + " ест " + appetite);
        }
        else {
            System.out.println("Не достаточно еды");
        }
    }

    public void info() {
        if (fullness) {
            System.out.println("Кот " + name + " сыт");
        }
        else {
            System.out.println("Кот " + name + " голодный");
        }
    }
}
