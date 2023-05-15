public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("Double cheese", 6.00);
        Sides side = new Sides("Fries", 3.00);
        Drinks drink = new Drinks("Small", "Coke", 2.00);
        Order order = new Order(burger, side, drink);
        order.addToOrder();

    }
}