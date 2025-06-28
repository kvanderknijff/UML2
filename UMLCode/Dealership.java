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