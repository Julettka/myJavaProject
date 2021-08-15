package com.andersenlab.vorobei.school.lesson6;

import java.lang.reflect.Array;

public class Iskluchenia {

    public static int metod1(String[][] mas) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (mas.length != 4) {
            System.out.println("Внимание! Не верный размер массива");
            throw new MyArraySizeException("не верный размер массива");
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].length != 4) {
                System.out.println("Внимание! Не верный размер массива");
                throw new MyArraySizeException("не верный размер массива");

            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(mas[i][j]);
                } catch (Exception e) {
                    System.out.println("Внимание! Преобразование не удалось в ячейке [" + i + "]" + "[" + j + "]");
                    throw new MyArrayDataException("не верный символ в ячейке " + "[" + i + "]" + "[" + j + "]");
                }
            }
        }
        System.out.println("Результат рассчета = " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Iskluchenia iskl = new Iskluchenia();
        String[][] m = new String[][]{{"1", "2", "3", "1"}, {"1", "2", "3", "1"}, {"2", "2", "2", "2"}, {"1", "2", "2", "8"}};
        String[][] s = new String[][]{{"1", "2", "3", "8"}, {"2", "1", "3", "x"}, {"1", "2", "1", "8"}, {"2", "2", "3", "2"}};
        String[][] n = new String[][]{{"1", "2", "3", "8"}, {"1", "2", "2", "8"}, {"2", "2", "3", "2"}};
        try {
            iskl.metod1(m);
            iskl.metod1(s);
            iskl.metod1(n);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}