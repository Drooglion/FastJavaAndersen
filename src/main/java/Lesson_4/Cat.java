package Lesson_4;

public class Cat extends Animal {

    private boolean hasFullStomach;
    private int appetite;


    Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        setMaxRunDistance(200);
        setMaxSwimDistance(0);
        setHasFullStomach(false);
    }

    public void setHasFullStomach(boolean hasFullStomach) {
        this.hasFullStomach = hasFullStomach;
    }

    public void eat(Plate p) {
        if (p.getFood() < appetite) {
            System.out.println("Нужно больше корма для " + getName());
        } else {
            hasFullStomach = true;
            System.out.println(getName() + " покушал");
            p.decreaseFoodInPlate(appetite);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не любит мочить лапки, плыви сам.");
    }

}
