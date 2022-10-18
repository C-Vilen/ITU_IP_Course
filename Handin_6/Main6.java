import java.util.Scanner;

/* This is my Sixth handin of a ShoppingList generator
This was done by C.Vilen 
Due date: 10-10-2022 12:00
*/

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingList SL = new ShoppingList();
        sc.nextLine();
        while (sc.hasNextLine()) {
            String lineInput = sc.nextLine();
            if (!lineInput.contains("RECIPE")) {
                String[] input = lineInput.split(" ");
                Integer amount = Integer.parseInt(input[0]);
                String ingredient = input[2];
                if (input[1].equals("kg")) {
                    SL.AddToAvailable(ingredient, amount*1000);
                } else {
                    SL.AddToAvailable(ingredient, amount);
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
                            SL.AddToRecipe(ingredient, amount*1000);
                        } else {
                            SL.AddToRecipe(ingredient, amount);
                        }
                    } continue;
                }
            }
        }
        // System.out.println("\n");
        // SL.PrintAvailable();
        // System.out.println("\n");
        // SL.PrintRecipe();
        SL.AddtoShoppingList();
        // System.out.println("\n");
        SL.PrintShoppingList();
        sc.close();
    }
}