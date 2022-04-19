package Lesson_4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFoodInPlate(int appetite) {
        setFood(food -= appetite);
    }

    public void addFoodInPlate(int amount) {
        food += amount;
    }
}
