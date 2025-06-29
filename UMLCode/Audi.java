public class Audi extends DrivingSystem {
    private int price;
    private String model;

    public Audi(int price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
