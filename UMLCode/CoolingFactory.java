public class CoolingFactory extends Factory {
    public CoolingFactory(int productionCapacity, int productionRate, int employeeCount) {
        this.productionCapacity = productionCapacity;
        this.productionRate = productionRate;
        this.employeeCount = employeeCount;
    }

    @Override
    public void produce() {
        System.out.println("Cooling factory has statted producing at rate: " + productionRate);
    }

    public ElectricCooling produceElectricCooling(float temperature, String coolingType) {
        System.out.println("Producing ElectricCooling.");
        return new ElectricCooling(temperature, coolingType);
    }

    public FossilFuelCooling produceFossilFuelCooling(float temperature, String coolingType) {
        System.out.println("Producing FossilFuelCooling.");
        return new FossilFuelCooling(temperature, coolingType);
    }
}
