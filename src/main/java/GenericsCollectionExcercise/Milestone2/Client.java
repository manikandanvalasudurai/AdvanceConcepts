package GenericsCollectionExcercise.Milestone2;

import GenericsCollectionExcercise.Miilestone1.Item;

import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        Inventory<Item> inventory = new Inventory<>();
        inventory.add(new Item("101", "Shirt", 499.99, 10));
        inventory.add(new Item("102", "Pants", 799.50, 5));
        inventory.add(new Item("103", "Shoes", 1299.00, 3));
        inventory.add(new Item("104", "Hat", 199.99, 15));
        inventory.add(new Item("105", "Jacket", 2499.99, 7));






    }
}
