package GenericsCollectionExcercise.Miilestone1;

public class Electronics extends Item{
    private int warrantyDate;

    public Electronics(int warrantyDate) {
        this.warrantyDate = warrantyDate;
    }
    public Electronics(String id, String name, double price, int quantity, int warrantyDate) {
        super(id, name, price, quantity);
        this.warrantyDate = warrantyDate;
    }

    public int getWarrantyDate() {
        return warrantyDate;
    }

    public void setWarrantyDate(int warrantyDate) {
        this.warrantyDate = warrantyDate;
    }
}
