package Lesson_4;
//Создать класс Park с внутренним классом,
// с помощью объектов которого можно хранить информацию об аттракционах,
// времени их работы и стоимости.

public class Park {

    public void getInfoAboutFunFair(FunFair funFair) {
        System.out.println(funFair.name + " работает с " + funFair.workingTime + " Цена на билет: " + funFair.cost);
    }

    public static class FunFair {
        String name;
        String workingTime;
        int cost;

        public FunFair(String name, String workingTime, int cost) {
            this.name = name;
            this.workingTime = workingTime;
            this.cost = cost;
        }
    }

}
