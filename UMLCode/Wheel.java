public class Wheel extends CarParts {
    public int diameterInch;
    public int widthInch;
    public String material;
    
    public Wheel(int price, int diameterInch, int widthInch, String material) {
        this.price = price;
        this.diameterInch = diameterInch;
        this.widthInch = widthInch;
        this.material = material;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void printDetails() {
        System.out.println("Price: " + price);
        System.out.println("Material" + material);
        System.out.println("Diameter (inches): " + diameterInch);
        System.out.println("Width (inches): " + widthInch);
    }

    public String getMaterial() {
        return this.material;
    }

    public int getDiameterInch() {
        return this.diameterInch;
    }

    public int getWidthInch() {
        return this.widthInch;
    }
}
