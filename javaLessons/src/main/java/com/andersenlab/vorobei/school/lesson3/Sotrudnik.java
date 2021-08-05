package com.andersenlab.vorobei.school.lesson3;

public class Sotrudnik {
    public static void main(String[] args) {
        vozrastZa40();
    }

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Sotrudnik(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("FullName is " + getFullName());
        System.out.println("Position is " + getPosition());
        System.out.println("Email is " + getEmail());
        System.out.println("Phone Number is " + getPhoneNumber());
        System.out.println("Salary is " + getSalary());
        System.out.println("Age is " + getAge());
        System.out.println();
    }

    public static void vozrastZa40() {
        Sotrudnik[] sotrArray = new Sotrudnik[5];
        sotrArray[0] = new Sotrudnik("Petr Ivanov", "manager", "o.ppp@gmail.com", "298168348", 5000, 45);
        sotrArray[1] = new Sotrudnik("Petr Petrov", "director", "o.ddd@gmail.com", "298458345", 6000, 40);
        sotrArray[2] = new Sotrudnik("Petr Suhov", "manager", "a.uuu@gmail.com", "299668258", 7000, 29);
        sotrArray[3] = new Sotrudnik("Petr Fandorin", "director", "s.lll@gmail.com", "293668878", 8000, 55);
        sotrArray[4] = new Sotrudnik("Petr Muhov", "manager", "k.www@gmail.com", "298998336", 9000, 23);
        for (int i = 0; i < sotrArray.length; i++) {
            if (sotrArray[i].getAge() > 40) {
                sotrArray[i].info();
            }
        }
    }
}
