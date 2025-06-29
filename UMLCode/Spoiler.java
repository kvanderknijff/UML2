public class Spoiler extends ExteriorModification {
    public Spoiler(int price, String color, AbstractExterior abstractExterior) {
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
        System.out.println("Spoiler with color: " + color);
    }
}
