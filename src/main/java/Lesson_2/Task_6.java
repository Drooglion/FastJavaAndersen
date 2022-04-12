package Lesson_2;

//6. Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

public class Task_6 {

    static int[] hundred = new int[100];

    public static void fillArray() {
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] += i + 1;
            System.out.println(hundred[i]);
        }
    }

    public static void main(String[] args) {
        fillArray();
    }
}
