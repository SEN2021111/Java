package Lesson5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee (String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    public void printInfo () {
        System.out.println(fio);
        System.out.println(position);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(salary);
        System.out.println(age);
     }

     public int getAge() {
        return age;
    }
}
