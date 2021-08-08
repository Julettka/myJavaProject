package com.andersenlab.vorobei.school.lesson4;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int dlina);

    public abstract void swim(int dlina2);
}

class Cat extends Animal {
    final int MAXRUN = 200;
    final int MAXSWIM = 0;
    public static int catsCount = 0;

    public Cat(String name) {
        super(name);
        catsCount++;
    }

    @Override
    public void run(int dlina) {
        if (dlina > 0 && dlina <= MAXRUN) {
            System.out.println("Кот " + name + " пробежал " + dlina + " метров!");
        } else {
            System.out.println("Кот " + name + " не сможет пробежать " + dlina + " метров!");
        }
    }

    @Override
    public void swim(int dlina2) {
        if (dlina2 >= 0 && dlina2 < 0) {
        }
    }
}

class Dog extends Animal {
    final int MAXRUN = 500;
    final int MAXSWIM = 10;
    public static int dogsCount = 0;

    public Dog(String name) {
        super(name);
        dogsCount++;
    }

    @Override
    public void run(int dlina) {
        if (dlina > 0 && dlina <= MAXRUN) {
            System.out.println("Собака " + name + " пробежала " + dlina + " метров!");
        } else {
            System.out.println("Собака " + name + " не сможет пробежать " + dlina + " метров!");
        }
    }

    @Override
    public void swim(int dlina2) {
        if (dlina2 > 0 && dlina2 <= MAXSWIM) {
            System.out.println("Собака " + name + " проплыла " + dlina2 + " метров!");
        } else {
            System.out.println("Собака " + name + " не сможет проплыть " + dlina2 + " метров!");
        }
    }
}

class Pets {
    public static void colichestvo() {
        System.out.println("Всего " + Cat.catsCount + " кота!");
        System.out.println("Всего " + Dog.dogsCount + " собаки!");
        System.out.println("Всего " + (Cat.catsCount + Dog.dogsCount) + " животных!");
    }

    public static void zveri() {
        Cat cat1 = new Cat("Барсик");
        cat1.run(500);
        cat1.swim(3);
        Cat cat2 = new Cat("Пушок");
        cat2.swim(0);
        cat2.run(50);
        Cat cat3 = new Cat("Васька");
        cat3.run(200);
        cat3.swim(500);
        Dog dog1 = new Dog("Рэкс");
        dog1.run(450);
        dog1.swim(5);
    }

    public static void main(String[] args) {
        zveri();
        colichestvo();
    }
}