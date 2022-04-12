package Lesson_2;

//* Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.


public class TaskWithStar {

    public static boolean checkIntercalaryYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkIntercalaryYear(1200));
    }
}