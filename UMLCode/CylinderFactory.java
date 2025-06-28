public class CylinderFactory extends Factory {

    public CylinderFactory(int productionCapacity, int productionRate, int employeeCount) {
        this.productionCapacity = productionCapacity;
        this.productionRate = productionRate;
        this.employeeCount = employeeCount;
    }

    @Override
    public void produce() {
        System.out.println("Cylinder factory has statted producing at rate: " + productionRate);
    }

    public ElectricCylinder produceElectricCylinder(int power, int voltage, String material) {
        System.out.println("Producing ElectricCylinder.");
        return new ElectricCylinder(power, voltage, material);
    }

    public FossilFuelCylinder produceFossilFuelCylinder(int power, int voltage, String material) {
        System.out.println("Producing FossilFuelCylinder.");
        return new FossilFuelCylinder(power, voltage, material);
    }
}