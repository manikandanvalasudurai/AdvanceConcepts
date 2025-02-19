package GenericsCollectionExcercise.Milestone2;
import GenericsCollectionExcercise.Miilestone1.Item;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Inventory<T extends Item>{
    private HashMap<String, T> items;
   public Inventory() {
        items = new HashMap<>();
    }
    public void add(T item) {
        items.put(item.getId(), item);
    }
    //with item itself removed
    public void remove(T item) {
        items.remove(item.getId());
    }
    // with Id only removed
    public void remove(String id) {
       items.remove(id);
    }
    public T retrive(String id) {
        return items.get(id);
    }
    public List<T> getAllItems() {
        return new ArrayList<>(items.values());
    }
}
