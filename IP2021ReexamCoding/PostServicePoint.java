package IP2021ReexamCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 3. Implement a class named PostServicePoint with the following fields: a field called registeredItems of type Item[] with size 10, another field named processedItems of type List<Item>, and two fields named maxWeight and count which are of type int. 
public class PostServicePoint {
    private Item[] registeredItems;
    private List<Item> processedItems;
    private int maxWeight;
    private int count;
 
    // 4. The fields maxWeight is initialised by the parameter of the constructor of the class and furthermore, the constructor should include any code required to make instances of the class work properly. 
    public PostServicePoint(int maxWeight){
        registeredItems = new Item[10];
        processedItems = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.count = 0;
    }

    // 5. In class PostServicePoint, implement a method register(item), which receives a parameter of type Item. 
    // The method adds the item in registeredItems array if it has capacity (is not full) and if the array is full, prints "no available capacity!". 
    // Note that item is added right after the last item in registeredItems array (if the array is empty it is added in position 0). 
    // (hint: use the field count to keep track of the number of items that are in registeredItems.)  
    public void register(Item item){
        if (count < 10){
            registeredItems[count] = item;
            count = count + 1;
        } else {
            System.out.println("no available capacity!");
        }
    }

    // 6. In class PostServicePoint, implement a method checkItemAddress(adr) which receives an address (a String). 
    // The method checks that the received address adr is valid by checking that it has a length strictly smaller than 20.
    // The method returns true if the address is valid and returns false otherwise. 
    public boolean checkItemAddress(String adr){
        return adr.length() < 20;
    }

    // 7. In class PostServicePoint, implement a method checkItemWeight(wgh), which receives a value for weight (an int). 
    // The method checks that the received value wgh is valid by checking it is strictly smaller than the maxweight and returns true if it is the case and returns false otherwise. 
    public boolean checkItemWeight(int wgh){
        return wgh < maxWeight;
    }

    // 8. In class PostServicePoint, implement a method printPrice(i), which receives an index i (an int). 
    // The method calculates and prints the price for sending the item in index i in the registeredItems array (if it exists). 
    // The price is calculated based on the weight of the item as: 12 DKK for each two kilograms. For price x the method prints "The price for sending is: <x>". 
    // (If the value of weight is not divisible by two then it is rounded up. 
    // For example if the value of weight is 3, the price is 24 DKK and if the weight is 5 the price is 36 DKK.)
    public void printPrice(int i){
        if(registeredItems[i] != null) {
            int priceOutput = 0;
            if(registeredItems[i].getWeight() % 2 == 0) {
                priceOutput = registeredItems[i].getWeight() * 6;
            } else {
                priceOutput = (registeredItems[i].getWeight()+ 1 ) * 6;
            }
            System.out.println("The price for sending is: " + priceOutput);
        }
    }

    // 9. In class PostServicePoint, implement a method printAllPrices() 
    // which prints per line the calculated price for each of the items in array registeredItems, starting from the first item to the last item in the array. 
    //(hint: use the method printPrice as a helper method)
    public void printAllPrices(){
        for (int i = 0; i < count; i++) {
            printPrice(i);
        }
    }

    // 10. In class PostServicePoint, implement a method processOne() which processes the last item in the registeredItems array as follows. 
    // If the item has valid address and weight, then it is added to the processedItems list. 
    // If the item has invalid address it prints "invalid address!" and if weight is invalid it prints "invalid weight!". 
    // After processing the item the number of items in registeredItems is decreased by one, i.e. the processed item is not considered any more. 
    public void processOne() {
        // Stops if count is zero
        if (count == 0) { return;}

        int i = count - 1;
        Item item = registeredItems[i];
        if (!checkItemAddress(item.getAddress())) {
            System.out.println("invalid address!");
        } else if (!checkItemWeight(item.getWeight())) {
            System.out.println("invalid weight!");
        } else {
            processedItems.add(item);
        }
        count--;
      }

    // 11. In class PostServicePoint, implement a method processAll() 
    // that processes all the items in the registeredItems array, starting from the last item to the first item in the array. 
    // (hint: use processOne as a helper method.) 
    public void processAll() {
        while (count > 0) {
            processOne();
        }
    }

    // 12. In class PostServicePoint, implement a method totalweight() 
    // that returns the sum of the weight of the items in the processedItems list. 
    public int totalweight(){
        int totalweightOutput = 0;
        for (Item item : processedItems) {
            totalweightOutput = totalweightOutput + item.getWeight();
        }
        return totalweightOutput;
    }

    // 13. In class PostServicePoint, implement a method checkCategories() that returns a map of type Map<String,Integer>. 
    // Each entry in the returned map contains a category mapped to the number of items in the processedItems list which have that category. 
    public Map<String, Integer> checkCategories() {
        Map<String, Integer> categories = new HashMap<>();
        for (Item item : processedItems) {
            String category = item.getCategory();
            if (!categories.containsKey(category)) {
            categories.put(category, 0);
            }
            categories.put(category, categories.get(category) + 1);
        }
        return categories;
    }
      
    // 14. In class PostServicePoint, implement a method removeCategory(c) which receives a category c (a String). 
    // It removes all the items in the processedItems list which have category c. 
    public void removeCategory(String c) {
        for (int i = 0; i < processedItems.size(); i++) {
            if (processedItems.get(i).getCategory().equals(c)) {
            processedItems.remove(i);
            }
        }
    }      
}