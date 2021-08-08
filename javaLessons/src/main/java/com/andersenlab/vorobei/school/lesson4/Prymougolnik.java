package com.andersenlab.vorobei.school.lesson4;

import java.util.Scanner;

public class Prymougolnik implements Geometria, Color {
    public static Scanner sc = new Scanner(System.in);
    double dlina;
    double schirina;

    public Prymougolnik() {
        System.out.println("Введите длину прямоугольника");
        setDlina(sc.nextDouble());
        System.out.println("Введите ширину прямоугольника");
        setSchirina(sc.nextDouble());
    }

    public double getDlina() {
        return dlina;
    }

    public void setDlina(double dlina) {
        this.dlina = dlina;
    }

    public double getSchirina() {
        return schirina;
    }

    public void setSchirina(double schirina) {
        this.schirina = schirina;
    }

    public void perimetr() {
        System.out.println("Периметр прямоугольника равен " + ((getDlina() + getSchirina()) * 2));
    }

    public void ploschad() {
        System.out.println("Площадь прямоуольника равна " + (getDlina() * getSchirina()));
    }

    public void okrasFona() {
        String fon = "красный";
        System.out.println("Цвет фона прямоугольника " + fon + ".");
    }

    public void okrasGranic() {
        String grani = "белый";
        System.out.println("Цвет границ прямоугольника " + grani + ".");
    }
}
