package com.andersenlab.vorobei.school.lesson1;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        methodOne(15, 10);
        methodTwo(-8);
        methodThree(5);
        methodFour("Hello!", 3);
        methodFive(2000);
        methodSix();
        methodSeven();
        methodEight();
        methodNine();
        methodTen(8, 1);
        methodeLeven();
        initMap();
        printMap();
        humanTurn();
        printMap();
        uslovia();
    }

    public static boolean methodOne(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void methodTwo(int a) {
        String answer = a >= 0 ? "Число " + a + " положительное!" : "Число " + a + " отрицательное!";
        System.out.println(answer);
    }

    public static boolean methodThree(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void methodFour(String text, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }

    public static boolean methodFive(int a) {
        if (a % 4 != 0 || a % 100 == 0 && a % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void methodSix() {
        int[] mas1 = {1, 1, 0, 0, 1, 1};
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] == 1) {
                mas1[i] = 0;
            } else if (mas1[i] == 0) {
                mas1[i] = 1;
            }
            System.out.println(mas1[i]);
        }

    }

    public static void methodSeven() {
        int[] mas2 = new int[100];
        for (int i = 0; i < 100; i++) {
            mas2[i] = i + 1;
        }
    }

    public static void methodEight() {
        int[] mas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mas3.length; i++) {
            if (mas3[i] < 6) {
                mas3[i] = mas3[i] * 2;
            }
        }
    }

    public static void methodNine() {
        int[][] mas4 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == j) || (i == 5 - 1 - j)) {
                    mas4[i][j] = 1;
                }
            }
        }
        /* for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mas4[i][j] + "");
            }
            System.out.println();
        }*/
    }

    public static int[] methodTen(int len, int initialValue) {
        int[] mas5 = new int[len];
        for (int i = 0; i < len; i++) {
            mas5[i] = initialValue;
        }
       /* for (int i = 0; i<len; i++) {
            System.out.print(mas5[i]);
        }*/
        return mas5;
    }

    public static void methodeLeven() {
        int[] mas6 = {8, 15, 1, 17, 150, -8, 0, -8, 150};
        int min = mas6[0];
        for (int i = 1; i < mas6.length; i++) {
            if (min > mas6[i]) {
                min = mas6[i];
            }
        }
        System.out.println(min);
        int max = mas6[0];
        for (int i = 1; i < mas6.length; i++) {
            if (max < mas6[i]) {
                max = mas6[i];
            }
        }
        System.out.println(max);
    }

    public static boolean checkWin(char symb) {
        int gor;
        int vert;
        int di1;
        int di2;
        for (int i = 0; i < SIZE; i++) {
            gor = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    gor++;
                }
                if (gor == SIZE) {
                    return true;
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            vert = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symb) {
                    vert++;
                }
                if (vert == SIZE) {
                    return true;
                }
            }
        }
        di1 = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symb) {
                di1++;
            }
            if (di1 == SIZE) {
                return true;
            }
        }
        di2 = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE - 1 - i] == symb) {
                di2++;
            }
            if (di2 == SIZE) {
                return true;
            }
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) +
                " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void uslovia() {
        while (true) {
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
}