public class Book implements LibraryItem {
    private String title;
    private String author;
    private double price;

    public Book(String t, String a, double p) {
        this.title = t;
        this.author = a;
        this.price = p;
    }

    // interface methods
    @Override
    public String getTitle() {return this.title;}
    @Override
    public double getValue() {return this.price;}

    // other getters
    public String getAuthor() {return this.author;}

    // setters
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setValue(double newValue) {
        this.price = newValue;
    }

    // toString
    @Override
    public String toString() {
        return this.title + " by " + this.author + " at " + this.price + "€";
    }
}
