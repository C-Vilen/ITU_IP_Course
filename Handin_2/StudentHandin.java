/* This is my second handin of Student class
This was done by C.Vilen 
Due date: 12-09-2022 12:00
*/

// Class called student
public class StudentHandin {
    private String name;
    private int age;
    
    // Constructor of Student class
    public StudentHandin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Get method to return name
    public String getName(){
        return name;
    }
    
    // Get method to return age
    public int getAge(){
        return age;
    }

    // Method to create a string of the student object
    public String toString() {
        return "The name of the student is " + getName() + ". The student is " + getAge() + " years old.";
    }

    // Set method to get the name of the student
    public void setName(String name) {
        this.name = name;
    }

    // Set method to get the age of the student if it is not below 16 or above 99 years of age
    public void setAge(int age) {
        if (age < 16) {
            System.out.println("The university does not accept students below 16");
        } else if (age > 99) {
            System.out.println("The university does not accept students that are older than 99");
        } else {
            this.age = age;
        }
    }
}