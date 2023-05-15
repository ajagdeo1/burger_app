public class Burger extends Order{
    private String burger;
    private double price;

    public Burger(String burger, double price){
        this.burger = burger;
        this.price = price;
    }

    public double burgerPrice(){
        return price;
    }
}
