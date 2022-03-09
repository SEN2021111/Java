package Lesson6;

public class Animal {
    private String name;
    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        this.count ++;
    }

    public Animal() {

    }

    public void run(int l){

    };

    public void swim(int l){

    };

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
