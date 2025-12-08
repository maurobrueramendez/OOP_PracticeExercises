public class LightBulb extends Device {
    private final double powerRating;
    public LightBulb(double pR) {
        super("LightBulb");
        this.powerRating = pR;        
    }

    @Override
    public double getPowerUsage() {
        return powerRating;
    }
}
