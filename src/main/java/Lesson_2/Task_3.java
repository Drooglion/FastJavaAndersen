package Lesson_2;
//3.Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
// Замечание: ноль считаем положительным числом.

public class Task_3 {
    public static boolean checkNumber(int number) {
        if (number >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(2));
    }
}
