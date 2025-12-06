public class WeightedTemperature implements TemperatureModel {
    private double[] weights;

    public WeightedTemperature(double[] weights) {
        this.weights = weights;
    }
    
    @Override
    public double predict(double[] hourlyTemps){
        double prodSum = 0;
        double weightSum = 0;
        for(int i = 0; i < hourlyTemps.length; i++) {
            prodSum += hourlyTemps[i] * weights[i];
            weightSum += weights[i];
        }
        double prediction = prodSum / weightSum;
        return prediction;
    }
}