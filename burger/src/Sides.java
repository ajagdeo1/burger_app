public class Sides {
    private String side;
    private double price;

    public Sides(String side, double price){
        this.side = side;
        this.price = price;
    }

    public double sidePrice(){
        return price;
    }
}
