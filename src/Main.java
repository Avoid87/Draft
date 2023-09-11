public class Main {
    public static void main(String[] args) {

                Basket vasyaBasket = new Basket();
                vasyaBasket.add("Молоко", 300);
                vasyaBasket.add("Колбаса", 400);

                Basket mashaBasket = new Basket();
                mashaBasket.add("Сосиски",600);

                vasyaBasket.print("Корзина Васи: ");

                mashaBasket.print("Корзина Маши: ");
                mashaBasket.print("Basket");
    }
}
