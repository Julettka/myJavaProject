package Lesson5;

public class Z1 {
    public static void zamena() {
        String[] array = {"a", "b", "c", "d", "e"};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        String temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        zamena();
    }
}
