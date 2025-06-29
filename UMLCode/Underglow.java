public class Underglow extends ExteriorModification {
    public Underglow(int price, String color, AbstractExterior abstractExterior) {
        this.price = price;
        this.color = color;
        this.abstractExterior = abstractExterior;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void printDetails() {
        System.out.println("Underglow with color: " + color);
    }
}
