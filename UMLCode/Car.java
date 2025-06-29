import java.util.List;

public class Car {
    private DrivingSystem drivingSystem;
    private PowerSource powerSource;
    private List<CarParts> carParts;

    public Car(DrivingSystem drivingSystem, PowerSource powerSource, List<CarParts> carParts) {
        this.drivingSystem = drivingSystem;
        this.powerSource = powerSource;
        this.carParts = carParts;
    }

    public void drive() {
        System.out.println("Car is being driven");
    }

    public void assemble() {
        System.out.println("Car with driving system: " + this.drivingSystem + " has been assembled with parts:");
        for(CarParts part : carParts) {
            System.out.println("- " + part);
        }
    }
}
