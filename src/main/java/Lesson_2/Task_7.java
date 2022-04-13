package Lesson_2;
//7. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
// и числа меньшие 6 умножить на 2;

public class Task_7 {

    static int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    public static void multiplyToTwo() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        multiplyToTwo();
    }
}
