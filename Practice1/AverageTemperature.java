public class AverageTemperature implements TemperatureModel {
    @Override
    public double predict(double[] hourlyTemps) {
        double sum = 0;
        for(int i = 0; i < hourlyTemps.length; i++) {
            sum += hourlyTemps[i];
        }
        return sum / hourlyTemps.length;
    }
}