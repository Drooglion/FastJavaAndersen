package Lesson_5;

import java.util.Arrays;

public class ChangeElementOrder {


    public static <T> void changeElementOrder(T[] array, int index1, int index2) {
        T tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }


    public static void main(String[] args) {

        String[] arrayOfStrings = {"abc", "def", "hjk"};
        Integer[] arrayOfInts = {1, 2, 3, 4, 5};
        changeElementOrder(arrayOfStrings, 0, 2);
        System.out.println(Arrays.toString(arrayOfStrings));
        changeElementOrder(arrayOfInts, 2, 4);
        System.out.println(Arrays.toString(arrayOfInts));
    }
}

