public class Spoiler extends ExteriorModification {
    public Spoiler(int price, String color) {
        this.price = price;
        this.color = color;
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
