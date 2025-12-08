public class Ingredient extends MealComponent {
    private final double calories;
    private final double price;

    public Ingredient(String name, double c, double p) {
        super(name);
        this.calories = c;
        this.price = p;
    }

    @Override
    public double getCalories() {return this.calories;}
    @Override
    public double getPrice() {return this.price;}
}
