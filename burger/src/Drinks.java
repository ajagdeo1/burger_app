public class Drinks {
    private String size;
    private String drink;
    private double price;

    public Drinks(String size, String drink, double price){
        this.drink = drink;
        this.size = size;
        this.price = price;
    }

    public double drinkPrice(){
        return price;
    }

    public void addDrink(){
        System.out.println(size + " " + drink + " Added to order");
    }
}
