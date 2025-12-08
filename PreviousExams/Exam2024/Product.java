public class Product implements CartItem {
    private final String name;
    private final double price;

    public Product(String n, double p) {
        this.name = n;
        this.price = p;
    }

    public String getName() {return this.name;}

    @Override
    public double getPrice() {return this.price;}

    @Override
    public String toString() {return (this.name + ": " + this.price + "€");}
}
