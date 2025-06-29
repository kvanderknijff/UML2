import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CoolingFactory coolingFactory = new CoolingFactory(100, 10, 5);
        CylinderFactory cylinderFactory = new CylinderFactory(200, 20, 8);

        ElectricCooling electricCooling = coolingFactory.produceElectricCooling(22.5f, "Liquid");
        FossilFuelCooling fossilCooling = coolingFactory.produceFossilFuelCooling(95.0f, "Air");
        
        ElectricCylinder electricCylinder = cylinderFactory.produceElectricCylinder(150, 400, "Aluminum");
        FossilFuelCylinder fossilCylinder = cylinderFactory.produceFossilFuelCylinder(200, 0, "Steel");

        PowerSource electricPower = new PowerSource(electricCylinder, null);
        PowerSource fossilPower = new PowerSource(null, fossilCylinder);

        Wheel wheel = new Wheel(200, 18, 8, "Aluminium");
        Interior interior = new Interior(1500, "Black", "Leather", "Diamond");
        Exterior exterior = new Exterior(3000, "Blue");
        Transmission transmission = new Transmission(2500, 6, 15, "Automatic");
        FuelStorage fuelStorage = new FuelStorage(1200, "Silver", "Steel", 600);

        List<CarParts> electricCarParts = List.of(wheel, interior, exterior, transmission, fuelStorage);
        Car electricCar = new Car(new Audi(50000, "Q8 e-tron"), electricPower, electricCarParts);

        List<CarParts> fossilCarParts = List.of(wheel, interior, exterior, transmission, fuelStorage);
        Car fossilCar = new Car(new Volkswagen(35000, "Golf"), fossilPower, fossilCarParts);

        System.out.println("===== Elektrische Auto =====");
        electricCar.assemble();
        electricPower.activation(true);

        System.out.println("\n===== Fossiele Auto =====");
        fossilCar.assemble();
        fossilPower.activation(true);

        Dealership dealership = new Dealership("Rotterdam", new ArrayList<>(List.of(electricCar, fossilCar)));
        Customer customer = new Customer("John", "Doe");

        System.out.println("\n===== Voor verkoop =====");
        dealership.getInventory();

        System.out.println("\n===== Verkoop Fossiele Auto =====");
        dealership.sell(customer, fossilCar);

        System.out.println("\n===== Na verkoop =====");
        dealership.getInventory();
    }
}