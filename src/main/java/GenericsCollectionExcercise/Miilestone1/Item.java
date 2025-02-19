package GenericsCollectionExcercise.Miilestone1;

public class Item implements Comparable<Item>{
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Item() {
    }

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
        //Rule is setting price --> Asending of Price
    @Override
    public int compareTo(Item other) {
        //want this --> return -1
        //want other  --> return 1
        if(this.price > other.price){
            return 1;  // other is small so return want other so 1
        }
        else if(this.price < other.price){
            return -1;  // this is small so return -1
        }
        return 0;
    }
}
