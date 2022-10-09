/* This is my second handin of Student class
This was done by C.Vilen 
Due date: 19-09-2022 12:00
*/

// Class called Tree
public class Tree {
    private int age;
    private double height;
    private double growthPct;

    // Constructor of Tree class
    public Tree(double growthPct) {
        this.growthPct = growthPct;
        this.height = 0.25;
        this.age = 1;
    }

    // A return method for calling the constructor
    public String toString() {
        return "Tree(age = " + this.age + ", height = " + this.height + ")";
    }

    // A growOneYear method to increment the age of a tree
    public void growOneYear() {
        this.age ++;
        if (this.height * (1 + this.growthPct / 100) < 20) {
            this.height = this.height * (1 + this.growthPct / 100);
        } else {
            this.height = 20;
        }
    }
}