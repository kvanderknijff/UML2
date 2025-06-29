public class Chasis extends CarParts {
    public String color;
    public String material;
    public int length;

    public Chasis(String color, String material, int length) {
        this.color = color;
        this.material = material;
        this.length = length;
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
        System.out.println("Length: " + length);
    }

    public String getColor() {
        return this.color;
    }

    public String getMaterial() {
        return this.material;
    }

    public int getLength() {
        return this.length;
    }
}
