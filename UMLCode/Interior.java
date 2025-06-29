public class Interior extends CarParts {
    public String color;
    public String material;
    public String pattern;

    public Interior(int price, String color, String material, String pattern) {
        this.price = price;
        this.color = color;
        this.material = material;
        this.pattern = pattern;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void printDetails() {
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Material" + material);
        System.out.println("Pattern: " + pattern);
    }

    public String getColor() {
        return this.color;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getPattern() {
        return this.pattern;
    }
}
