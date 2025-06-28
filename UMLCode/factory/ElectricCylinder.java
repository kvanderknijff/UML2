public class ElectricCylinder extends ElectricEngine {
    public int power;
    public int voltage;
    public String material;

    public ElectricCylinder(int power, int voltage, String material) {
        this.power = power;
        this.voltage = voltage;
        this.material = material;
    }

    @Override
    public void start() {
        System.out.println("Electric cylinder has started");
    }

    @Override
    public void stop() {
        System.out.println("Electric cylinder has stopped");
    }
}
