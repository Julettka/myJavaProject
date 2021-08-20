package com.andersenlab.vorobei.school.lesson8;

import java.util.*;

public class Unik {
    public static void spiski() {
        ArrayList<String> list = new ArrayList<>();
        list.add("апельсин");
        list.add("апельсин");
        list.add("лимон");
        list.add("лимон");
        list.add("слива");
        list.add("слива");
        list.add("клубника");
        list.add("клубника");
        list.add("клубника");
        list.add("яблоко");
        list.add("киви");
        list.add("банан");
        list.add("вишня");
        list.add("финик");
        list.add("персик");
        System.out.println("Первоначальный список:");
        System.out.println(list);
        System.out.println();
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        System.out.println("Список уникальных слов:");
        System.out.println(set);
        System.out.println();
        System.out.println("Количество повторений каждого слова:");
        for (String i : set) {
            System.out.println(i + " - " + Collections.frequency(list, i));
        }
    }

    public static void main(String[] args) {
        spiski();
    }
}
