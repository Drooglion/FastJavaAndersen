package Lesson_2;

//5. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;

public class Task_5 {

    static int[] arrayOfNumbers = {1, 1, 0, 0, 1, 0};

    public static void changeNumbersInArray(int[] arrayOfNumbers) {
        for (int i: arrayOfNumbers) {
            if (arrayOfNumbers[i] == 0) {
                arrayOfNumbers[i] = 1;
                System.out.println(arrayOfNumbers[i]);
            } else {
                arrayOfNumbers[i] = 0;
                System.out.println(arrayOfNumbers[i]);
            }
        }
    }

    public static void main(String[] args) {
        changeNumbersInArray(arrayOfNumbers);
    }
}
