public class ConstantPredictor implements Predictor {
    private final double constant;
    
    public ConstantPredictor() {
        this.constant = 0.5;
    }

    @Override
    public double predict(double[] a) {return constant;}
}
