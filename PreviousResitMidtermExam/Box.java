public class Box {
    private int position;
    private int destination;
    private String label;

    public Box(int destination, String label) {
        position = 0;
        this.destination = destination;
        this.label = label;
    }


    public int getPosition() {
        return position;
    }


    public int getDestination() {
        return destination;
    }


    public String getLabel() {
        return label;
    }

    public void forward() {
        this.position = position++;
    }

    public void setPosition(int position) {
        this.position = position;
    }    

    public String toString() {
        return "position: " + position + ", label: " + label; 
    }
    
}
