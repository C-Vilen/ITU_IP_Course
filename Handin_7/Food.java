/* This is my seventh handin of a FastFood ordering system
This was done by C.Vilen 
Due date: 24-10-2022 12:00
*/

public class Food {
    protected String name;
    protected int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void display(){
        System.out.println(price + " kr " + name);
    }
}
