import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/* This is my Sixth handin of a ShoppingList generator
This was done by C.Vilen 
Due date: 10-10-2022 12:00
*/

public class ShoppingList {
    private Map<String, Integer> AVAILABLE;
    private Map<String, Integer> RECIPE;
    private Map<String, Integer> SHOPPINGLIST;

    // Constructor for the ShoppingList class
    public ShoppingList() {
        AVAILABLE = new HashMap<>();
        RECIPE = new HashMap<>();
        SHOPPINGLIST = new TreeMap<>();
    }

    public void read(){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        while (sc.hasNextLine()) {
            String lineInput = sc.nextLine();
            if (!lineInput.contains("RECIPE")) {
                String[] input = lineInput.split(" ");
                Integer amount = Integer.parseInt(input[0]);
                String ingredient = input[2];
                if (input[1].equals("kg")) {
                    AddToAvailable(ingredient, amount*1000);
                } else {
                    AddToAvailable(ingredient, amount);
                }
            } 
            else {
                while (sc.hasNextLine()) {
                    lineInput = sc.nextLine();
                    if (!lineInput.startsWith("RECIPE")) {
                        String[] input = lineInput.split(" ");
                        Integer amount = Integer.parseInt(input[0]);
                        String ingredient = input[2];
                        if (input[1].equals("kg")) {
                            AddToRecipe(ingredient, amount*1000);
                        } else {
                            AddToRecipe(ingredient, amount);
                        }
                    } continue;
                }
            }
        }
        AddtoShoppingList();
        sc.close();
    }

    // Add to available hashmap
    public void AddToAvailable(String Ingredient, Integer Amount){
        AVAILABLE.put(Ingredient, Amount);
    }

    // Add to recipe hashmap
    public void AddToRecipe(String Ingredient, Integer Amount){
        if (RECIPE.containsKey(Ingredient)) {
            RECIPE.put(Ingredient, RECIPE.get(Ingredient)+Amount);
        } else {
            RECIPE.put(Ingredient, Amount);
        }
    }

    // Add to shopping treemap
    public void AddtoShoppingList() {
        for (Map.Entry<String, Integer> entryR : RECIPE.entrySet()) {
            if (AVAILABLE.containsKey(entryR.getKey())) {
                int entryA = AVAILABLE.get(entryR.getKey());
                if (entryR.getValue() > entryA) {
                    SHOPPINGLIST.put(entryR.getKey(), (entryR.getValue() - entryA));
                }
            } else if (!AVAILABLE.containsKey(entryR.getKey())) {
                SHOPPINGLIST.put(entryR.getKey(), entryR.getValue());
            }
        }
    }

    // Print available hashmap
    public void PrintAvailable() {
        System.out.println("Available:");
        for (Map.Entry<String, Integer> entry : AVAILABLE.entrySet()) {
            System.out.println(entry.getValue() + " g " + entry.getKey());
        }
    }
    // Print recipe hashmap
    public void PrintRecipe() {
        System.out.println("Recipe:");
        for (Map.Entry<String, Integer> entry : RECIPE.entrySet()) {
            System.out.println(entry.getValue() + " g " + entry.getKey());
        }
    }

    // Print shopping treemap
    public void printShoppingList() {
        System.out.println("Shopping List:");
        for (Map.Entry<String, Integer> entry : SHOPPINGLIST.entrySet()) {
            System.out.println(entry.getValue() + " g " + entry.getKey());
        }
    }
}
