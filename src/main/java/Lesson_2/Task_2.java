package Lesson_2;

//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

public class Task_2 {
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " Положительное");
        } else {
            System.out.println("Число " + number + " Отрицательное");
        }
    }


    public static void main(String[] args) {
        checkNumber(-20);
    }

}
