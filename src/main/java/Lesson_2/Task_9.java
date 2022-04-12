package Lesson_2;

//9. * Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

public class Task_9 {

    public static int[] fillArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        fillArray(7, 32456);
    }
}
