public class McLaren extends DrivingSystem {
    public McLaren(int price, String model) {
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
