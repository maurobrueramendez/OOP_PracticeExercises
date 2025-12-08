import java.util.ArrayList;
public class Meal extends MealComponent {
    ArrayList<MealComponent> components;
    public Meal(String name) {
        super(name);
        components = new ArrayList<>();
    }

    public void addComponents(MealComponent c) {components.add(c);}

    @Override
    public double getCalories() {
        double sumCal = 0;
        for(int i = 0; i < components.size(); i++) {
            MealComponent temp = components.get(i);
            sumCal += temp.getCalories();
        }
        return sumCal;
    }

    @Override
    public double getPrice() {
        double sumPr = 0;
        for(int i = 0; i < components.size(); i++) {
            MealComponent temp = components.get(i);
            sumPr += temp.getPrice();
        }
        return sumPr;
    }
    
}
