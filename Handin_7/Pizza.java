import java.util.ArrayList;
import java.util.List;

/* This is my seventh handin of a FastFood ordering system
This was done by C.Vilen 
Due date: 24-10-2022 12:00
*/

public class Pizza extends Food {
    protected List<String> toppings;
    
    public Pizza(){
        super("Pizza", 45);
        toppings = new ArrayList<>();
    }


    public void addTopping(String topping) {
        toppings.add(topping);
        price = price + 10;
    }

    @Override
    public void display() {
        String output = " { ";
        String seperator = "";
        for (String topping : toppings) {
            output = output + seperator + topping;
            seperator = ", ";
        }
        System.out.println(price + " kr " + name + output + " }");
    }

    public void setName(String name) {
        super.name = name;
    }

}
