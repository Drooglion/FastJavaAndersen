package Lesson_2;

//1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

public class Task_1 {

    public static boolean checkNumbers(int firstNumber, int secondNumber) {
        int add = firstNumber + secondNumber;
        boolean b = add >= 10 && add <= 20;
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        checkNumbers(10, 0);
    }
}
