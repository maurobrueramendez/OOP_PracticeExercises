public class LinearPredictor implements Predictor {
    private final double[] weights;

    public LinearPredictor(double[] w) {
        this.weights = w;
    }

    @Override
    public double predict(double[] a) {
        double prediction = 0;
        for(int i = 0; i < a.length; i++) {
            prediction += (a[i] * this.weights[i]);
        }
        return prediction;
    }

}
