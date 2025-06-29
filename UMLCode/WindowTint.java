public class WindowTint extends ExteriorModification {
    public WindowTint(int price, String color) {
        this.price = price;
        this.color = color;
    }
    
    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void printDetails() {
        System.out.println("Window tint with color: " + color);
    }
}
