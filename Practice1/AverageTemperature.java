public class AverageTemperature implements TemperatureModel {
    @Override
    public double predict(double[] hourlyTemps) {
        double mean = 0;
        for(int i = 0; i < hourlyTemps.length; i++) {
            mean += hourlyTemps[i];
        }
        return mean / hourlyTemps.length;
    }
}