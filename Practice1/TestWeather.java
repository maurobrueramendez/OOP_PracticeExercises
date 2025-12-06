public class TestWeather {
    public static void main(String args[]) {
        double[] temperatures = new double[] {10, 20, 21, 24, 21, 17, 18, 19, 23, 29, 39, 30, 31, 33, 37, 43, 42, 41, 40, 11, 12, 13, 14, 16};
        AverageTemperature averager = new AverageTemperature();
        double avgtemp = averager.predict(temperatures);

        System.out.println("Average prediction: " + avgtemp);

        double[] weights = new double[]{0.1, 0.2, 0.3, 0.01, 0.5, 0.002, 0.03, 0.045, 0.9, 0.8, 0.12, 0.11, 0.33, 0.45, 0.005, 0.95, 0.99, 0.17, 0.55, 0.23, 0.21, 0.25, 0.86, 0.245};
        WeightedTemperature weighter = new WeightedTemperature(weights);
        double weightedPredict = weighter.predict(temperatures);

        System.out.println("Weighted prediction: " + weightedPredict);

        TemperatureReport report = new TemperatureReport();
        report.addModel(averager);
        report.addModel(weighter);

        report.printPredictions(temperatures);

    }
}
