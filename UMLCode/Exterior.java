public class Exterior extends AbstractExterior {
    public Exterior(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void printDetails() {
        System.out.println("Exterior has color: " + color);
    }
}
