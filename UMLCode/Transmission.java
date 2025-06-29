public class Transmission extends CarParts {
    public int gearAmount;
    public int gearRatio;
    public String transmissionType;

    public Transmission(int price, int gearAmount, int gearRatio, String transmissionType) {
        this.price = price;
        this.gearAmount = gearAmount;
        this.gearRatio = gearRatio;
        this.transmissionType = transmissionType;
    }
    
    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void printDetails() {
        System.out.println("Price: " + price);
        System.out.println("Transmission type: " + transmissionType);
        System.out.println("Amount of gears: " + gearAmount);
        System.out.println("Gear ratio: " + gearRatio);
    }

    

    public int getGearAmount() {
        return this.gearAmount;
    }

    public int getGearRatio() {
        return this.gearRatio;
    }

    public String getTransmissionType() {
        return this.transmissionType;
    }
}
