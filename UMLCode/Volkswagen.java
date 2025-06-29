public class Volkswagen extends DrivingSystem {
    public Volkswagen(int price, String model) {
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