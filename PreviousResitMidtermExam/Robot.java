import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Robot {
    private List<Box> transferList;
    private Map<String, Integer> labelPriorities;

    public Robot() {
        transferList = new ArrayList<>();
        labelPriorities = new HashMap<>();
    }


    public void addToTransferList(Box box) {
        transferList.add(box);
    }


    public void printTransferList() {
        for (Box box : transferList) {
            System.out.println(box.toString());
        }
    }


    public void moveForward(Box box, int steps) {
        int newPosition = box.getPosition() + steps;
        int destination = box.getDestination();
    
        if (newPosition < destination) box.setPosition(newPosition);

        else box.setPosition(destination);                
    }


    public void setLabelPriority(Box box, int priority) {
        String label = box.getLabel();

        if (label != null) {
            labelPriorities.put(label, priority);
        }
    }

    
    public int getBoxPriority(Box box) {
        String label = box.getLabel();

        if (labelPriorities.containsKey(label)) return labelPriorities.get(label);

        return -1;
    }
}
