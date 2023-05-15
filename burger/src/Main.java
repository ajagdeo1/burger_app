public class Main {
    public static void main(String[] args) {
        Drinks drink = new Drinks("Small", "Coke");
        drink.addToOrder();
        Drinks sprite = new Drinks("Medium", "Sprite");
        sprite.addToOrder();
        Drinks drpep = new Drinks("Large", "Dr Pepper");
        drpep.addToOrder();


    }
}