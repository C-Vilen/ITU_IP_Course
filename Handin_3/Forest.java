/* This is my second handin of Student class
This was done by C.Vilen 
Due date: 19-09-2022 12:00
*/

// Import statements to create the arraylist
import java.util.ArrayList;
import java.util.List;

// Class called Forest
public class Forest {
    private List<Tree> trees;
    private Tree tree;

    public Tree getTree() {
        return tree;
    }

    // Constructor of Forest class
    public Forest(){
        trees = new ArrayList<>();
    }

    // A addTree method which adds a new object to the arraylist trees
    public void addTree(int growthPct) {
        Tree t = new Tree(growthPct);
        trees.add(t);
    }

    // A return method for calling all trees in the arraylist
    public String toString() {
        Tree t = trees.get(0);
        String text = "Forest(";
        String addText = "";
        for (int i = 0; i < trees.size(); i++) {
            t = trees.get(i);
            addText = t.toString();
            text = text + addText;
            
        }
        text = text + ")";
        return text;
        }

    // A growOneYear method to increment the age of all trees in the arraylist
    public void growOneYear() {
        Tree t = trees.get(0);
        for (int i = 0; i < trees.size(); i++) {
            t = trees.get(i);
            t.growOneYear();    
        }
    }
}
