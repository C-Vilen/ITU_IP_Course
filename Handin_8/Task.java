/* This is my eight handin of a Todo program
This was done by C.Vilen 
Due date: 30-10-2022 12:00
*/

public class Task{
    private String description;
    private int priority;
    private int workload;

    public Task(String description, int priority, int workload) {
        this.description = description;
        this.priority = priority;
        this.workload = workload;
    }

    @Override
    public String toString(){
        return description + " takes " + workload + " minutes and has priority " + StrPriority();
    }
    
    public String StrPriority(){
        String str = "";
        if (priority == 1) str = "very important";
        if (priority == 2) str = "important";
        if (priority == 3) str = "unimportant";
        if (priority == 4) str = "after learn Portuguese";
        return str;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public int getWorkload() {
        return workload;
    }    
}