package ItemAndStoreMidterm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
// 5
public class Store {
    List<Item> storeItems;
    
    public Store() {
        storeItems = new ArrayList<>();
    }

    // 6
    public void addItem(Item i) {
        storeItems.add(i);
    }
    
    // 7
    public Item removeLatest() {
        return storeItems.remove(storeItems.size()-1);
    }

    // 8
    public boolean findItem(Item i) {
        for (Item item : storeItems) {
            if (item.compare(i)) {
                return true;
            }
        }
        return false;
    }
    
    // 9
    public Set<String> allColors(String k) {
        Set<String> colors = new HashSet<>();
        for (Item item : storeItems) {
            if (item.getKind().equals(k)) {
                colors.add(item.getColor());
            }
        }
        return colors;
    }
    
    // 10
    public void filterPrice(int p) {
        Iterator<Item> iter = storeItems.iterator();
        while (iter.hasNext()) {
            Item item = iter.next();
            if (item.getPrice() > p) {
                iter.remove();
            }
        }
    }
    
    // 11
    public void discount(String k, int d) {
        for (Item item : storeItems) {
            if (item.getKind().equals(k)) {
                item.setPrice(item.getPrice()-d);
            }
        }
    }
    
    // 12
    public Map<String,Integer> kindNumbers() {
        Map<String,Integer> kindNumbers = new HashMap<>();
        for (Item item : storeItems) {
            String kind = item.getKind();
            if (!kindNumbers.containsKey(kind)) {
                kindNumbers.put(kind, 1);
            } else {
                kindNumbers.put(kind, kindNumbers.get(kind) + 1);
            }
        }
        return kindNumbers;
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.addItem(new Item("trash", "red", 10));
        store.addItem(new Item("trash", "blue", 400));
        store.addItem(new Item("magic", "red", 100));
        store.addItem(new Item("stuff", "black", 50));
        store.addItem(new Item("trash", "red", 10));
        store.discount("magic", 50);
        // store.filterPrice(90);

        Map<String, Integer> map = store.kindNumbers();
        for (String c : store.allColors("trash")) {
            System.out.println(c);
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(String.format("%s: %s", e.getKey(), e.getValue()));
        }
    }

}
