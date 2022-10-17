import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Robot {
    private String name;
    private List<Box> transferList;
    private Map<String, Integer> labelPriorities;

    public Robot(String name) {
        this.name = name;
        transferList = new ArrayList<>();
        labelPriorities = new HashMap<>();
    }


    public boolean addToTransferList(Box box) {
        return transferList.add(box);
    }


    public void printTransferList() {
        for (Box box : transferList) {
            System.out.println(box.toString());
        }
    }

    public void moveForward(Box box,int steps){
        for (int i = 0; i <steps ; i++) {
            if (box.getDestination() != box.getPosition()){
                box.forward();
            }
        }
    }


    public void setLabelPriority(String label, int priority){
        if(label != null){
            labelPriorities.put(label,priority);
        }
    }

    
    public int getBoxPriority(Box box){
        if(labelPriorities.containsKey(box.getLabel())){
           return labelPriorities.get(box.getLabel());
        }
        throw new IllegalArgumentException("Invalid label!");
    }

    public Box selectNextBox() {
        int priority = 0;
        String boxName = "";
        if (!transferList.isEmpty()) {
            for (Box box : transferList) {
                if (getBoxPriority(box) > priority) {
                    priority = getBoxPriority(box);
                    boxName = box.getLabel();
                }
            }

            Box newBox = new Box(priority, boxName);

            for (Box box : transferList) {
                if (boxName.equals(box.getLabel())) {
                    transferList.remove(box);
                    return newBox;
                }
            }
        }
        return null;
    }

    public void removeFromTransferList(String labelRem){
        for(Box box:transferList){
            if (box.getLabel().equals(labelRem)){
                transferList.remove(box);
            }
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot("Simon");
        Box box1 = new Box(10,"box1");
        Box box2 = new Box(20,"box2");
        Box box3 = new Box(30,"box3");
        Box box4 = new Box(40,"box4");

        robot.addToTransferList(box1);
        robot.addToTransferList(box2);
        robot.addToTransferList(box3);
        robot.addToTransferList(box4);
        robot.setLabelPriority("box1",5);
        robot.setLabelPriority("box2",20);
        robot.setLabelPriority("box3",10);
        robot.setLabelPriority("box4",12);
        robot.moveForward(box1,11);
        System.out.println(robot.selectNextBox());
    }
}
