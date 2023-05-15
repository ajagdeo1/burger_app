public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("Double cheese", 6.00);
        Sides fries = new Sides ("Fries", 4.00);
        Drinks drpep = new Drinks("Small", "Coke", 3);

        drpep.addDrink();
        System.out.println(burger.burgerPrice() + fries.sidePrice() + drpep.drinkPrice());
    }
}