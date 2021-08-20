package com.andersenlab.vorobei.school.lesson8;

import java.util.HashMap;
import java.util.Map;

public class Spravochnik {
    private static HashMap<String, String> phonebook = new HashMap<>();

    private static void add(String phone, String name) {
        phonebook.put(phone, name);
    }

    private static void get(String name) {

        for (Map.Entry<String, String> x : phonebook.entrySet()) {
            if (name.equals(x.getValue())) {
                System.out.println(x.getValue()+ " " +x.getKey());
            }
        }
    }

    private static void addAll() {
        System.out.println("Изначально в телефонный справочник добавлена информация:");
        add("77777777", "Петров");
        add("8888888", "Иванов");
        add("3333333", "Воробьев");
        add("6666666", "Соловьев");
        add("1111111", "Иванов");
        add("2222222", "Соловьев");
        for (Map.Entry<String, String> k : phonebook.entrySet()) {
            System.out.println(k.getValue() + ": " + k.getKey());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        addAll();
        System.out.println("Узнаем номер телефона заданного человека");
        get("Иванов");
        System.out.println("Добавим информацию о новом человеке");
        add("5555555", "Кукушкин");
        System.out.println("Узнаем номер телефона нового человека");
        get("Кукушкин");
    }
}
