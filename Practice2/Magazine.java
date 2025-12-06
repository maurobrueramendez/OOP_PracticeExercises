public class Magazine implements LibraryItem {
    private String title;
    private String issueNumber;
    private double price;

    public Magazine(String t, String i, double p) {
        this.title = t;
        this.issueNumber = i;
        this.price = p;
    }

    // interface methods
    @Override
    public String getTitle() {return this.title;}
    @Override
    public double getValue() {return this.price;}

    // other getter
    public String getIssueNumber() {return this.issueNumber;}

    // setters
    public void setTitle(String newTitle) {this.title = newTitle;}
    public void setIssueNumber(String newIssueNumber) {this.issueNumber = newIssueNumber;}
    public void setValue(double newPrice) {this.price = newPrice;}

    @Override
    public String toString() {
        return this.title + " with Issue Number " + this.issueNumber + " at " + this.price + "€";
    }

}
