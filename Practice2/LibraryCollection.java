import java.util.ArrayList;

public class LibraryCollection {
    private ArrayList<LibraryItem> collection;

    public LibraryCollection() {
        this.collection = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        this.collection.add(item);
    }

    public void setItem(int index, LibraryItem item) {
        this.collection.set(index, item);
    }

    public void printInventory() {
        System.out.println("Inventory: ");
        for(int i = 0; i < this.collection.size(); i++) {
            LibraryItem temp = this.collection.get(i);
            System.out.println("Item " + (i+1) + ": " + temp.toString());
        }
    }
}

