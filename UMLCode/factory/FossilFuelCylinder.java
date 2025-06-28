public class FossilFuelCylinder extends FossilFuelEngine {
    public int power;
    public int voltage;
    public String material;

    public FossilFuelCylinder(int power, int voltage, String material) {
        this.power = power;
        this.voltage = voltage;
        this.material = material;
    }

    @Override
    public void start() {
        System.out.println("Fossil fuel cylinder has started");
    }

    @Override
    public void stop() {
        System.out.println("Fossil fuel cylinder has stopped");
    }
}
