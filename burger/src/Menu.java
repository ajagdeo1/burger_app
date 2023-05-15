public class Menu {
    protected String menuItem;
    protected String drinkSize;
    protected double price;

    public Menu(String menuItem, double price){
        this.menuItem = menuItem;
        this.price = price;
    }

    public Menu(String menuItem, String drinkSize, double price){
        this.menuItem = menuItem;
        this.drinkSize = drinkSize;
        this.price = price;
    }

    public Menu() {
    }
}
