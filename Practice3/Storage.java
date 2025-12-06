import java.util.ArrayList;
public interface Storage<T> {
    void add(T element);
    ArrayList<T> getElements();
    void clear();
}
