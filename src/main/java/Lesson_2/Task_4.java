package Lesson_2;

//4. Написать метод, которому в качестве аргументов передается строка и число,
//   метод должен отпечатать в консоль указанную строку, указанное количество раз;

public class Task_4 {
    public static void printString(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        printString("hello world", 5);
    }
}
