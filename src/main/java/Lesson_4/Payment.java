package Lesson_4;

//6. Создать класс Payment с внутренним классом,
// с помощью объектов которого можно сформировать покупку из нескольких товаров.

public class Payment {
    public static int wallet;

    public Payment(int wallet) {
        this.wallet = wallet;
    }

    public void buyProduct(Product stuff) {
        if (wallet >= stuff.getPrice()) {
            wallet -= stuff.getPrice();
            System.out.println(stuff.getNameOfProduct() + " был куплен");
        } else {
            System.out.println("Подкопи деньжат");
        }
    }

    public static class Product {
        private int price;
        private String nameOfProduct;

        public Product(int price, String nameOfProduct) {
            this.price = price;
            this.nameOfProduct = nameOfProduct;
        }

        public int getPrice() {
            return price;
        }

        public String getNameOfProduct() {
            return nameOfProduct;
        }
    }
}


