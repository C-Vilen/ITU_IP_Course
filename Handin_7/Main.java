/* This is my seventh handin of a FastFood ordering system
This was done by C.Vilen 
Due date: 24-10-2022 12:00
*/

public class Main {
    public static void main(String[] args) {

        Pizza p = new Pizza();
        p.display();
        p.addTopping("Pepperoni");
        p.addTopping("Pineapple");
        p.addTopping("Pesto");
        p.setName("jørgen");
        p.display();

        Order o = new Order();
        // o.total();
        o.display();
    }
}