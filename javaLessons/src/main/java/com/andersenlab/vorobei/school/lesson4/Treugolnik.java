package com.andersenlab.vorobei.school.lesson4;

import java.util.Scanner;

public class Treugolnik implements Geometria, Color {
    public static Scanner sc = new Scanner(System.in);
    double s1;
    double s2;
    double s3;
    double visota;

    public Treugolnik() {
        System.out.println("Введите сторону 1 треугольника");
        setS1(sc.nextDouble());
        System.out.println("Введите сторону 2 треугольника");
        setS2(sc.nextDouble());
        System.out.println("Введите сторону 3 треугольника");
        setS3(sc.nextDouble());
        System.out.println("Введите высоту треугольника");
        setVisota(sc.nextDouble());
    }

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public double getVisota() {
        return visota;
    }

    public void setVisota(double visota) {
        this.visota = visota;
    }

    public void perimetr() {
        System.out.println("Периметр треугольника равен " + (getS1() + getS2() + getS3()));
    }

    public void ploschad() {
        System.out.println("Площадь треугольника равна " + ((getS1() * getVisota()) / 2));
    }

    public void okrasFona() {
        String fon = "розовый";
        System.out.println("Цвет фона треугольника " + fon + ".");
    }

    public void okrasGranic() {
        String grani = "голубой";
        System.out.println("Цвет границ треугольника " + grani + ".");
    }
}
