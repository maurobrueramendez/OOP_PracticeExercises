public abstract class MealComponent {
    protected String name;

    public MealComponent(String n) {
        this.name = n;
    }

    public abstract double getCalories();
    public abstract double getPrice();
    
}
