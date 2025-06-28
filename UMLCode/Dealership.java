public class Dealership {
    public String location;
    private int inventory;

    public void sell() {
        System.out.println("Car dealership at " + this.location + " has sold a car.");
    }

    public void getInventory() {
        System.out.println("Amount of cars in the dealership: " + this.inventory);
    }
}


/*
public class Dealership {
    private String location;
    private int inventoryAmount;
    private List<Car> inventory;

    public void sell(Customer customer, Car car) {
        customer.buy();
        inventory.remove(car);
        inventoryAmount--;
    }
}
 */