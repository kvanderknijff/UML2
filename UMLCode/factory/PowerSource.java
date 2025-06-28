public class PowerSource {
    private FossilFuelEngine fossilFuelEngine;
    private ElectricEngine electricEngine;

    public int capacity;
    public int current;
    private boolean isActive;

    public PowerSource(ElectricEngine electricEngine, FossilFuelEngine fossilFuelEngine) {
        this.electricEngine = electricEngine;
        this.fossilFuelEngine = fossilFuelEngine;
    }

    public void charge() {
        System.out.println("Power source is charging");
    }

    public void activation(boolean active) {
        this.isActive = active;
        if (active) {
            if (electricEngine != null) {
                electricEngine.start();
            }
            if (fossilFuelEngine != null) { fossilFuelEngine.start();
            }
        } else {
            if (electricEngine != null) {
                electricEngine.stop();
            }
            if (fossilFuelEngine != null) {
                fossilFuelEngine.stop();
            }
        }
    }
}