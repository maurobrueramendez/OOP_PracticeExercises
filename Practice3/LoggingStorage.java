import java.util.ArrayList;
public class LoggingStorage<T> implements Storage<T> {
    private final BasicStorage<T> elements;
    private int addCount;
    private int getElementsCount;
    private int clearCount;

    public LoggingStorage() {
        this.elements = new BasicStorage<>();
        this.addCount = 0;
        this.getElementsCount = 0;
        this.clearCount = 0;
    }

    @Override
    public void add(T e) {
        addCount++;
        elements.add(e);
    }

    @Override
    public ArrayList<T> getElements() {
        getElementsCount++;
        return elements.getElements();
    }

    @Override
    public void clear() {
        clearCount++;
        elements.clear();
    }

    public void printStatistics() {
        System.out.println("Statistics: ");
        System.out.println("Add: " + addCount);
        System.out.println("Get Elements: " + getElementsCount);
        System.out.println("Clear: " + clearCount);
    }
}
