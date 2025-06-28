import java.util.List;

public class Car {
    private DrivingSystem drivingSystem;       // Compositie
    private PowerSource powerSource;           // Aggregatie
    private List<CarParts> carParts;           // Aggregatie

    public Car(DrivingSystem drivingSystem, PowerSource powerSource, List<CarParts> carParts) {
        this.drivingSystem = drivingSystem;
        this.powerSource = powerSource;
        this.carParts = carParts;
    }

    public void drive() {
        System.out.println("Car is being driven");
    }

    public void assemble() {
        System.out.println("Car with driving system: " + this.drivingSystem + " has been assembled");
    }
}
