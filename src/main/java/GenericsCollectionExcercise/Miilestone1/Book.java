package GenericsCollectionExcercise.Miilestone1;

public class Book extends Item{
    private String author;

    public Book(String authortitle) {
        this.author = authortitle;
    }

    public Book(String id, String name, double price, int quantity, String authortitle) {
        super(id, name, price, quantity);
        this.author = authortitle;
    }

    public String getAuthortitle() {
        return author;
    }

    public void setAuthortitle(String authortitle) {
        this.author = authortitle;
    }
}
