public class Order{
    private String foodItem;
    private String drinkSize;
    private double price;

    public Order(String foodItem){
        this.foodItem = foodItem;

    }

    public Order(String drinkSize, String foodItem){
        this.foodItem = foodItem;
        this.drinkSize = drinkSize;

        if(drinkSize == "Large"){
            this.price = 3.00;
        } else if (drinkSize == "Medium") {
            this.price = 2.50;
        }
        else {
            this.price = 2.25;
        }
    }

    public void addToOrder(){
        System.out.println(drinkSize + " " + foodItem + ": " + price + "\n" + "Added to cart");
    }
}





