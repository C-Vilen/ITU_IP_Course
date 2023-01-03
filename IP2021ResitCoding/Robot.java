import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Define class Robot

public class Robot {
    
    // The class Robot has one field, transferList, of type List<Box> and
    // another field, labelPriorities, of type Map<String, Integer>. The
    // constructor of the class initializes the List as an ArrayList and the
    // Map as a HashMap.

    private List<Box> transferList;
    private Map<String, Integer> labelPriorities;


    public Robot() {

        // Use the interfaces in the fields, e.g. List and Map,
        // and then specify which type of List and Map when
        // initializing them
        transferList = new ArrayList<>();
        labelPriorities = new HashMap<>();

    }

    // In class Robot, implement a method, addToTransferList, which adds boxes
    // to the list to transfer. This method receives an object of type Box as its
    // only parameter and adds it to transferList. The method returns nothing.

    public void addToTransferList(Box box) {

        // The list contains Box objects as defined by List<Box>
        transferList.add(box);

    }


    // In the class Robot, implement a method, printTransferList, that prints
    // the information about boxes in the transferList per line. For example,
    // for a transferList that contains two boxes, b1 with position p1 and label
    // l1, and box b2 with position p2 and label l2, the following will be printed
    // after running the method:
    // "position: p1, label: l1"
    // "position: p2, label: l2"
    // This method does not have any parameters and does not return anything.
    // (Hint: use the toString method in class Box as a helper method)

    public void printTransferList() {

        // For each loop
        for (Box box : transferList) {
            // System.out.println automatically prints a new line with the input
            // The 'ln' in 'println' stands for 'line'
            // The toString() method from the Box class gives us the String we want
            System.out.println(box.toString());
        }

    }


    // In class Robot, implement a method, moveForward, which has two parameters
    // called box and steps of types Box and int. The robot moves the box forward
    // and steps represents how much the position of the box increases. However, a
    // box may not be moved further than its destination and will remain in place
    // once it reaches it. (Hint: this method uses method setPosition from the Box
    // class as a helper method)

    public void moveForward(Box box, int steps) {

        // Get the current position of the box using getPosition()
        // and add the steps to find the value of the new position
        int newPosition = box.getPosition() + steps;

        // Get the destination of the box
        int destination = box.getDestination();
        
        // If the new position is less than the destination (both are ints),
        // then move the box all the way to the new position
        if (newPosition < destination) box.setPosition(newPosition);

        // Otherwise, the new position must be equal to or greater than
        // the destination, so move the box to its destination only
        else box.setPosition(destination);

        // Note: Recall that if there is only one single line of code
        // after if/else like above, we don't need to have {} around it
                
    }


    // In class Robot, implement a method, setLabelPriority, which receives
    // a parameter called box of type Box and another parameter called
    // priority of type int. The method should fetch the label of the box passed
    // as a parameter. If the label is not null, then the method maps the key
    // label to priority in labelPriorities.

    public void setLabelPriority(Box box, int priority) {

        // Get the label of the box
        String label = box.getLabel();

        // Normally we use .equals() for Strings, but if the label
        // is null, then there is nothing to compare with .equals()
        // and we will get an error
        if (label != null) {
            
            // Put the label and priority into the HashMap
            // label is the key, priority is the value
            labelPriorities.put(label, priority);
        }

    }
    
    // In class Robot, implement a method, getBoxPriority, that returns the
    // priority of a box (an int) based on the label of the box. If the label of
    // the box is not a key in labelPriorities, the method returns -1.

    public int getBoxPriority(Box box) {

        // Get the label of the box
        String label = box.getLabel();

        // Check if the label is in the HashMap
        // If it is, return the priority associated
        // with that label using .get(key)
        // Here, the key is the label
        if (labelPriorities.containsKey(label)) return labelPriorities.get(label);

        // Otherwise, return -1
        // We can simply write 'return' here with no 'else' because
        // the method stops executing when it returns something
        // So if the if-statement above is true, the priority will be
        // returned, and we will never reach this last return statement
        return -1;
    }
}