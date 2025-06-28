public class Car {
    private DrivingSystem drivingSystem;

    public void drive() {
        System.out.println("Car is being driven");
    }

    public void assemble() {
        System.out.println("Car with driving system: " + this.drivingSystem + " has been assembled");
    }
}
