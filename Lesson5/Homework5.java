package Lesson5;

public class Homework5 {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Petrov Petr Petrovich", "SEO", "derector@mail.ru", "33333", 35000, 50);
        empArray[1] = new Employee("Ivanov Ivan Ivanovich", "Accountant", "Accountant@mail.ru", "44444", 30000, 45);
        empArray[2] = new Employee("Sidorov Sidr Sidorovich", "Sales manager", "manager@mail.ru", "555555", 25000, 25);
        empArray[3] = new Employee("Pushkin Alex Sergeevich", "Copywriter", "Copywriter@mail.ru", "666666", 20000, 60);
        empArray[4] = new Employee("Lermontov Mikhail Yurievich", "Copywriter", "Copywriter@mail.ru", "7777777", 20000, 25);

        for (int i = 0; i < empArray.length; i ++) {
            if (empArray[i].getAge() > 40) {
                System.out.println("---- Сотрудник " + (i + 1) + " ----");
                empArray[i].printInfo();
            }
        }

    }
}
