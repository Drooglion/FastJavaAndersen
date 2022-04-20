package Lesson_4;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        setMaxRunDistance(500);
        setMaxSwimDistance(10);
    }

    @Override
    public void swim(int distance) {
        boolean canBeatDistance = getMaxSwimDistance() - distance >= 0;
        if (canBeatDistance) {
            System.out.println(getName() + " Проплыл " + distance + "м");
        } else {
            System.out.println(getName() + " гавкнул в знак протеста. Плыви сам.");
        }
    }
}