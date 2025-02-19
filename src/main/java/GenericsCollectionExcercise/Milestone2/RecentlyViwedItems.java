package GenericsCollectionExcercise.Milestone2;
import GenericsCollectionExcercise.Miilestone1.Item;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViwedItems {
    private LinkedList<Item> recentlyViwedItems;
    private int MAX_SIZE = 3;
    public RecentlyViwedItems() {
        recentlyViwedItems = new LinkedList<>();
    }
    public void addRecentlyViwedItem(Item item) {
        //wherever it is present removed it and add it on top of the list
        recentlyViwedItems.remove(item);
        recentlyViwedItems.add(item);
        if (recentlyViwedItems.size() > MAX_SIZE) {
            recentlyViwedItems.removeFirst();
        }
    }
    public List<Item> getRecentlyViwedItems() {
        return recentlyViwedItems;
    }
}
