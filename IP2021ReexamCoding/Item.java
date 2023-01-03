package IP2021ReexamCoding;

public class Item {

    /*
     * In the following you will find the description of a postal service point system in which it is possible to register items to post. All the fields should be private and all the methods in the description should be public. 
     * In the implementation, you are not allowed to add methods which are not a part of the description unless the method is declared as private. Note that in the description <x> represents value of variable x.
     * 
     * The field weight represents the weight of an item in kilograms. All fields are initialised in the constructor of the class
     * 1. Implement a class Item with fields called category and address of type String and also a field weight of type int. 
     */

    private String category;
    private String address;
    private int weight;
    
    public Item(String category, String address, int weight){
        this.category = category;
        this.address = address;
        this.weight = weight;
    }

    // 2. Implement methods getAddress(), getWeight(), and getCategory() that respectively return the value of address, weight and category of an item. 
    public String getCategory() {
        return category;
    }

    public String getAddress() {
        return address;
    }

    public int getWeight() {
        return weight;
    }
}
