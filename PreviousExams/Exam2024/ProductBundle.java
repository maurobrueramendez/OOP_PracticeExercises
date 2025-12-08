import java.util.ArrayList;
public class ProductBundle implements CartItem {
    private ArrayList<CartItem> items;
    private int count;
    
    public ProductBundle() {
        this.items = new ArrayList<>();
        this.count = 0;
    }

    @Override
    public double getPrice() {
        double price = 0;
        for(int i = 0; i < items.size(); i++) {
            CartItem temp = items.get(i);
            price += temp.getPrice();
        }
        return price;
    } 

    public void addItem(CartItem item) {
        this.items.add(item);
        this.count++;
    }

    @Override
    public String toString() {
        String bundle = "(";
        for(int i = 0; i < items.size(); i++) {
            CartItem temp = items.get(i);
            bundle += temp.toString();
            if((i+1) < items.size()) {bundle += ", ";}
        }
        bundle += ("): " + getPrice() + "€");
        return bundle;
    }
}
