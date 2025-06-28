public class ElectricCooling extends ElectricEngine {
    public float temperature;
    public String coolingType;

    public ElectricCooling(float temperature, String coolingType) {
        this.temperature = temperature;
        this.coolingType = coolingType;
    }

    @Override
    public void start() {
        System.out.println("Electric cooling has started");
    }

    @Override
    public void stop() {
        System.out.println("Electric cooling has stopped");
    }
}