package com.andersenlab.vorobei.school.lesson4;

import java.util.Scanner;

public class Park {
    public static Scanner sc = new Scanner(System.in);
    public String park;
    public Info info;

    public Park() {
        System.out.println("Введите название парка");
        setPark(sc.next());
        info = new Info();
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public class Info {
        String name;
        int cost;
        String time;

        public Info() {
            System.out.println("Введите название аттракциона");
            setName(sc.next());
            System.out.println("Введите стоимость аттракциона");
            setCost(sc.nextInt());
            System.out.println("Введите время работы аттракциона");
            setTime(sc.next());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void print() {
            System.out.println("В парке " + getPark() + " аттракцион " + getName() + " стоит " + getCost() + " рублей. Время работы: " + getTime() + ".");
        }
    }

    public static void main(String[] args) {
        Park park1 = new Park();
        park1.info.print();
    }
}
