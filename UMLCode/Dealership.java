import java.util.List;

public class Dealership {
    private String location;
    private int inventoryAmount;
    private List<Car> inventory;

    public Dealership(String location, List<Car> inventory) {
        this.location = location;
        this.inventoryAmount = inventory.size();
        this.inventory = inventory;
    }

    public void sell(Customer customer, Car car) {
        System.out.println("Car dealership at " + this.location + " has sold a car.");
        customer.buy();
        inventory.remove(car);
        inventoryAmount--;
        System.out.println("Updated inventory size: " + inventoryAmount);

    }

    public void getInventory() {
        if(inventoryAmount > 0) {
            System.out.println("Cars in inventory: ");
            for(Car car : inventory) {
                System.out.println("- " + car);
            }
        }
        else {
            System.out.println("No cars in dealership's inventory");
        }
    }
}