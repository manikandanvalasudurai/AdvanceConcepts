package GenericsCollectionExcercise.Miilestone1;

import java.util.Comparator;
//Descending order with quantity
public class ItemQuantityComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        // o1 first --> -1

        // o2 first --> 1
        if(o1.getQuantity() > o2.getQuantity()){
            return -1;
        }
        else if(o1.getQuantity() < o2.getQuantity()){
            return 1;
        }
        return 0;
    }
}
