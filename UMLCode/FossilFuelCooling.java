public class FossilFuelCooling extends FossilFuelEngine {
    public float temperature;
    public String coolingType;

    public FossilFuelCooling(float temperature, String coolingType) {
        this.temperature = temperature;
        this.coolingType = coolingType;
    }

    @Override
    public void start() {
        System.out.println("Fossil fuel cooling has started");
    }

    @Override
    public void stop() {
        System.out.println("Fossil fuel cooling has stopped");
    }
}
