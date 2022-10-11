import java.util.ArrayList;
import java.util.List;

/* This is my seventh handin of a FastFood ordering system
This was done by C.Vilen 
Due date: 24-10-2022 12:00
*/

public class Order {
    protected List<Food> ordered;

    public Order(){
        ordered = new ArrayList<>();
    }

    public void addFood(Food food) {
        ordered.add(food);
    }

    public int total(){
        int total = 0;
        for (Food food : ordered) {
            total = total + food.getPrice();
        }
        return total;
    }

    public void display(){
        for (Food food : ordered) {
            food.display();
            System.out.println("\n");
        }
        System.out.println(total() + " kr TOTAL");
    }

    public boolean payWith(CreditCard card) {
        if(card.withdraw(total()) == true) {
            return card.withdraw(total());
        } else {
            System.out.println("ERROR: Payment failed");
            return card.withdraw(total());
        }
    }
}
