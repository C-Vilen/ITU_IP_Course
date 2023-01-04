// Define class Student

public class StudentMidterm {
    
    // Fields
    private String name;
    private int age;

    // Constructor
    public StudentMidterm(String name) {
        this.name = name;
    }

    // Get age
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Sign up to lab
    public boolean signUp(Lab lab) {
        // The register() method already returns a boolean,
        // so we can just return the same boolean immediately
        return lab.register(this);  // 'this' refers to the current student object
    }

    // Sign off from lab
    public boolean signOff(Lab lab) {
        // The remove() method already returns a boolean,
        // so we can just return the same boolean immediately
        return lab.remove(this);   // 'this' refers to the current student object
    }
}