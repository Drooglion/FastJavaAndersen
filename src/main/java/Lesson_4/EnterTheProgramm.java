package Lesson_4;

public class EnterTheProgramm {

    public static void main(String[] args) {
        Cat murzik = new Cat("Мурзик", 60);
        Plate plateForCats = new Plate(50);
        murzik.swim(10);
        murzik.run(201);

        Dog graf = new Dog("Граф");
        graf.swim(499);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Mars", 15);
        cats[1] = new Cat("Alex", 30);
        cats[2] = new Cat("Markiz", 6);
        for (Cat i : cats) {
            i.eat(plateForCats);
        }

        Payment buyStuff = new Payment(400000);
        Payment.Product[] products = new Payment.Product[2];
        products[0] = new Payment.Product(400000, "Плойка 5");
        products[1] = new Payment.Product(30000, "Телевизор");

        buyStuff.buyProduct(products[0]);
        buyStuff.buyProduct(products[1]);

        Park.FunFair devilsEye = new Park.FunFair("Чертово колесо", "9:00 до 22:00.", 5);
        Park theCoolPark = new Park();
        theCoolPark.getInfoAboutFunFair(devilsEye);
    }
}
