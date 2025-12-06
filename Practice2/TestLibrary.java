public class TestLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("Philosopher's Stone", "JK Rowling", 12.50);
        Book book2 = new Book("Camilla", "Unknown", 9.99);
        Book book3 = new Book("Wuthering Heights", "Emily Bronte", 10);
        Book book4 = new Book("Giovanni's Room", "James Baldwin", 14.99);
        Book book5 = new Book("Crime and Punishment", "Fyodor Dostoevsky", 12);

        Magazine mag1 = new Magazine("National Geographic", "Vol 1", 4.99);
        Magazine mag2 = new Magazine("Nature", "Vol 5", 3.50);
        Magazine mag3 = new Magazine("Nature", "Vol 12", 3.50);

        book2.setAuthor("Sheridan Le Fanu");
        
        LibraryCollection library = new LibraryCollection();
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);
        library.addItem(book4);
        library.addItem(book5);
        library.addItem(mag1);
        library.addItem(mag2);
        library.addItem(mag3);

        Book replacement = new Book("The Death of Ivan Ilyich and Other Short Stories", "Leo Tolstoy", 11.99);
        library.setItem(0, replacement);

        library.printInventory();
    }
}
