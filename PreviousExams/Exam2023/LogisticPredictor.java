public class LogisticPredictor implements Predictor {
    private final double[] weights;

    public LogisticPredictor(double[] w) {
        this.weights = w;
    }
    
    @Override
    public double predict(double[] a) {
        double prodSum = 0;
        for(int i = 0; i < a.length; i++) {
            prodSum += (a[i] * this.weights[i]);
        }
        double denominator = (1+Math.exp(-prodSum));

        return (1/denominator);
    }
}
