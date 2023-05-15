public class Order extends Menu{
    private Burger burger;
    private Sides side;
    private Drinks drink;

   // public Order(String menuItem, double price) {
       // super(menuItem, price);

   // }

    public Order(Burger burger, Sides side, Drinks drink){
        this.burger = burger;
        this.side = side;
        this.drink = drink;
    }

    public void addToOrder(){
        System.out.println( super.menuItem + " added to order");
    }
}





