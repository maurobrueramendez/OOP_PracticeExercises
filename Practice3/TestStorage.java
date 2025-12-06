import java.util.ArrayList;
public class TestStorage {
    public static void main(String[] args) {
        LoggingStorage<String> storage = new LoggingStorage<>();

        String s1 = "Hello, World!";
        String s2 = "My name is Mauro.";
        String s3 = "My birthday is on the 13th of April";
        String s4 = "I am studying Computer Science";
        String s5 = "Goodbye, World!";

        storage.add(s1);
        storage.add(s2);
        storage.add(s3);
        storage.add(s4);
        storage.add(s5);

        ArrayList<String> firstSave = storage.getElements();

        storage.clear();

        storage.add(s5);
        storage.add(s4);
        storage.add(s3);
        storage.add(s2);
        storage.add(s1);
        
        ArrayList<String> secondSave = storage.getElements();

        storage.clear();

        storage.printStatistics();
    }
}
