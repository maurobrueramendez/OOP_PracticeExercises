public class LightBulb extends Device {
    private double powerRating;
    public LightBulb(double pR) {
        super("LightBulb");
        this.powerRating = pR;        
    }

    @Override
    public double getPowerUsage() {
        return powerRating;
    }
}
