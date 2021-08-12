package Lesson5;

import java.util.ArrayList;

public class Fruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

class Apple extends Fruit {

    public Apple(float weight) {
        super(weight);
    }
}

class Orange extends Fruit {
    public Orange(float weight) {
        super(weight);
    }
}

class Box<T extends Fruit> {
    public ArrayList<T> list;

    public Box(ArrayList<T> list) {
        this.list = list;
    }

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }

    public float getWeight() {
        float sum = 0;
        for (int i = 0; i < getList().size(); i++)
            sum += getList().get(i).getWeight();
        return sum;
    }

    public boolean compare(Box box, Box box1) {
        if (box.getWeight() == box1.getWeight()) {
            return true;
        } else return false;
    }

    public void addFru(ArrayList list, ArrayList list2) {
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
        }
    }

    public void traffik(ArrayList list, ArrayList list2) {
        addFru(list, list2);
        list.clear();
    }

    public void dobavFrukt(T fruit) {
        list.add(fruit);
    }
}

class Test {
    public static void proverka() {
        ArrayList<Apple> ap = new ArrayList<>();
        ArrayList<Orange> or = new ArrayList<>();

        Apple ap1 = new Apple(1.0f);
        Apple ap2 = new Apple(1.0f);
        Orange or1 = new Orange(1.5f);
        Orange or2 = new Orange(1.5f);
        Orange or3 = new Orange(1.5f);

        ap.add(ap1);
        ap.add(ap2);
        or.add(or1);
        or.add(or2);
        or.add(or3);

        Box<Apple> boxApple = new Box<>(ap);
        Box<Orange> boxOrange = new Box<>(or);
        float sumA;
        float sumB;
        sumA = boxApple.getWeight();
        sumB = boxOrange.getWeight();
        System.out.println(sumA);
        System.out.println(sumB);

        System.out.println(boxApple.compare(boxApple, boxOrange));
        System.out.println("Будем пересыпать яблоки из коробки с яблоками в свободную коробку");
        System.out.println("Количество элементов в списке коробки с яблоками: " + ap.size());
        ArrayList li = new ArrayList();
        System.out.println("Количество элементов в списке свободной коробки: " + li.size());

        Box boxFree = new Box(li);
        boxFree.traffik(ap, li);
        System.out.println("Пересыпали яблоки в свободную коробку");
        System.out.println("Количество элементов в списке свободной коробки: " + li.size());
        System.out.println("Количество элементов в списке коробки с яблоками: " + ap.size());

        Apple ap4 = new Apple(1.0f);
        boxApple.dobavFrukt(ap4);

        System.out.println("Добавим 1 яблоко в коробку с яблоками");
        System.out.println("Количество яблок в коробке с яблоками: " + ap.size());
    }

    public static void main(String[] args) {
        proverka();
    }
}