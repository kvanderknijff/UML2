public class Audi extends DrivingSystem {
    private int price;
    private String model;

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
