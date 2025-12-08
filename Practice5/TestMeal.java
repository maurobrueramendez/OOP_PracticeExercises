public class TestMeal {
    public static void main(String[] args) {
        Ingredient ing1 = new Ingredient("Carrot", 50, 0.75);
        Ingredient ing2 = new Ingredient("Potato", 68, 0.30);
        Ingredient ing3 = new Ingredient("Rice", 110, 1.95);
        Ingredient ing4 = new Ingredient("Egg", 90, 0.60);
        Ingredient ing5 = new Ingredient("Beef", 450, 4.50);

        Meal meal1 = new Meal("Stew");
        meal1.addComponents(ing1);
        meal1.addComponents(ing2);
        meal1.addComponents(ing5);

        Meal meal2 = new Meal("Rice and Egg");
        meal2.addComponents(ing3);
        meal2.addComponents(ing4);

        Meal meal3 = new Meal("Combination");
        meal3.addComponents(meal1);
        meal3.addComponents(meal2);

        System.out.println("Meal " + meal1.name + ":");
        System.out.println("Calories: " + meal1.getCalories() + " kcal");
        System.out.println("Price: " + meal1.getPrice() + "€");
        System.out.println("Meal " + meal2.name + ":");
        System.out.println("Calories: " + meal2.getCalories() + " kcal");
        System.out.println("Price: " + meal2.getPrice() + "€");
        System.out.println("Meal " + meal3.name + ":");
        System.out.println("Calories: " + meal3.getCalories() + " kcal");
        System.out.println("Price: " + meal3.getPrice() + "€");
    }
}
