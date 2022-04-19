package Lesson_4;

public abstract class Animal {
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public void setMaxSwimDistance(int maxSwimDistance) {
        this.maxSwimDistance = maxSwimDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public abstract void swim(int distance);

    public void run(int distance) {
        boolean canBeatDistance = getMaxRunDistance() - distance >= 0;
        if (canBeatDistance) {
            System.out.println(getName() + " Пробежал " + distance + "м");
        } else {
            System.out.println(getName() + " не побежит, слишком далеко.");
        }
    }
}
