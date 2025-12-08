public class TestCart {
    public static void main(String[] args) {
        Product prod1 = new Product("Mouse", 25);
        Product prod2 = new Product("Laptop", 1250);
        Product prod3 = new Product("Headphones", 189);
        Product prod4 = new Product("Notebook", 7.99);
        Product prod5 = new Product("Pens", 4.99);

        ProductBundle bundle1 = new ProductBundle();
        bundle1.addItem(prod1);
        bundle1.addItem(prod2);

        ProductBundle bundle2 = new ProductBundle();
        bundle2.addItem(prod4);
        bundle2.addItem(prod5);

        ProductBundle bundle3 = new ProductBundle();
        bundle3.addItem(prod1);
        bundle3.addItem(prod2);
        bundle3.addItem(prod3);
        bundle3.addItem(prod4);
        bundle3.addItem(prod5);

        System.out.println("Product 1: " + prod1.toString());
        System.out.println("Product 2: " + prod2.toString());
        System.out.println("Product 3: " + prod3.toString());
        System.out.println("Product 4: " + prod4.toString());
        System.out.println("Product 5: " + prod5.toString());

        System.out.println("Bundle 1: " + bundle1.toString());
        System.out.println("Bundle 2: " + bundle2.toString());
        System.out.println("Bundle 3: " + bundle3.toString());

    }
}
