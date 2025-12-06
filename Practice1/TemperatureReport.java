import java.util.ArrayList;
public class TemperatureReport {
    private ArrayList<TemperatureModel> models;

    public TemperatureReport() {
        this.models = new ArrayList<>();
    }

    void addModel(TemperatureModel m) {
        models.add(m);
    }

    void printPredictions(double[] hourlyTemps) {
        for(int i = 0; i < models.size(); i++) {
            TemperatureModel m = models.get(i);
            double prediction = m.predict(hourlyTemps);
            System.out.println("Model " + i + ": " + prediction);
        }
    }
}
