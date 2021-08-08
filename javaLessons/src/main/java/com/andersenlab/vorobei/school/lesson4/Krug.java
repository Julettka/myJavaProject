package com.andersenlab.vorobei.school.lesson4;

import java.util.Scanner;

public class Krug implements Geometria, Color {
    public static Scanner sc = new Scanner(System.in);
    double r;

    public Krug() {
        System.out.println("Введите радиус круга");
        setR(sc.nextDouble());
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void perimetr() {
        System.out.println("Периметр круга равен " + 3.14 * (2 * getR()));
    }

    public void ploschad() {
        System.out.println("Площадь круга равна " + 3.14 * getR() * getR());
    }

    public void okrasFona() {
        String fon = "синий";
        System.out.println("Цвет фона круга " + fon + ".");
    }

    public void okrasGranic() {
        String grani = "желтый";
        System.out.println("Цвет границ круга " + grani + ".");
    }

    public static void info() {
        Krug krug = new Krug();
        krug.perimetr();
        krug.ploschad();
        krug.okrasFona();
        krug.okrasGranic();
        Prymougolnik prymougolnik = new Prymougolnik();
        prymougolnik.perimetr();
        prymougolnik.ploschad();
        prymougolnik.okrasFona();
        prymougolnik.okrasGranic();
        Treugolnik treugolnik = new Treugolnik();
        treugolnik.perimetr();
        treugolnik.ploschad();
        treugolnik.okrasFona();
        treugolnik.okrasGranic();
    }

    public static void main(String[] args) {
        info();
    }
}

