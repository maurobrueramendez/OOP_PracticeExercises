public class Heater extends Device {
    private final double tempSetting;
    private final double basePowerCons;

    public Heater(double tempSetting, double basePowerCons) {
        super("Heater");
        this.tempSetting = tempSetting;
        this.basePowerCons = basePowerCons;
    }

    @Override
    public double getPowerUsage() {
        return (tempSetting * basePowerCons) / 20;
    }
}
