public class FuelStorage extends CarParts {
    public String color;
    public String material;
    public int range;

    public FuelStorage(int price, String color, String material, int range) {
        this.price = price;
        this.color = color;
        this.material = material;
        this.range = range;
    }
    
    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void printDetails() {
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Range: " + range);
    }

    public String getColor() {
        return this.color;
    }

    public String getMaterial() {
        return this.material;
    }

    public int getRange() {
        return this.range;
    }
}
