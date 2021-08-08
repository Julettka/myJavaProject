package com.andersenlab.vorobei.school.lesson4;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void dobavFood(int m) {
        food += m;
    }

    public void info() {
        System.out.println("plate: " + getFood());
    }
}

class Cats {
    public String name;
    public int appetite;
    public boolean sitost;

    public Cats(String name, int appetite, boolean sitost) {
        this.name = name;
        this.appetite = appetite;
        this.sitost = sitost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getSitost() {
        return sitost;
    }

    public void setSitost(boolean sitost) {
        this.sitost = sitost;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}

class MainClass {
    public static void creatCatsPlate() {
        int dobavka = 500;
        Cats[] arrCats = new Cats[3];
        arrCats[0] = new Cats("Петя", 10, false);
        arrCats[1] = new Cats("Вася", 100, false);
        arrCats[2] = new Cats("Кузя", 80, false);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < arrCats.length; i++) {
            if (arrCats[i].getSitost() == false && arrCats[i].getAppetite() <= plate.getFood()) {
                arrCats[i].eat(plate);
                arrCats[i].sitost = true;
                System.out.println("Кот " + arrCats[i].getName() + " наелся.");
            } else if (arrCats[i].getSitost() == false && arrCats[i].getAppetite() > plate.getFood()) {
                System.out.println("Кот " + arrCats[i].getName() + " не поел.");
                System.out.println("Добавим еду!");
                plate.dobavFood(dobavka);
                plate.info();
                if (arrCats[i].getAppetite() <= plate.getFood()) {
                    System.out.println("Добавки хватило. Кот поел.");
                }
            }
        }
        plate.info();
    }

    public static void main(String[] args) {
        creatCatsPlate();
    }
}
