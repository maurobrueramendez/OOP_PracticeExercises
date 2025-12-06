import java.util.ArrayList;
public class BasicStorage<T> implements Storage<T> {
    ArrayList<T> elements;
    public BasicStorage(){
        this.elements = new ArrayList<>();
    }

    @Override
    public void add(T e) {
        this.elements.add(e);
    }

    @Override
    public ArrayList<T> getElements() {
        return elements;
    }

    @Override
    public void clear() {
        this.elements.clear();
    }
}
