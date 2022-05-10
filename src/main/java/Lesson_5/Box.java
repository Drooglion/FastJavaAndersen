package Lesson_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    private ArrayList<T> items;

    public Box(T... items) {
        this.items = new ArrayList<T>(Arrays.asList(items));
    }

    public void add(T... items) {
        this.items.addAll(Arrays.asList(items));
    }

    public void clear() {
        items.clear();
    }

    public float getWeight() {
        float weight = 0;
        for (T item : items) {
            weight += item.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<T> box) {
        box.items.addAll(this.items);
        clear();
    }

    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Box<Apple> box1 = new Box<Apple>(apple1, apple2);
        box1.add(apple3);

        Orange orange1 = new Orange();
        Box<Orange> box2 = new Box<Orange>(orange1);

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<>();
        box2.transfer(box3);
    }
}
