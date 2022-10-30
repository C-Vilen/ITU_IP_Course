import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* This is my eight handin of a Todo program
This was done by C.Vilen 
Due date: 30-10-2022 12:00
*/

public class Todo {
    private List<Task> TodoList;
    private int totalAmount;

    public Todo(){
        TodoList = new ArrayList<>();
        totalAmount = 0;
    }

    public void addTask(String description, int priority, int minutes){
        if(priority>4) System.out.println(description + " has invalid priority");
        if(priority<1) System.out.println(description + " has invalid priority");
        if(minutes < 0) System.out.println(description + " has invalid workload");
        Task t = new Task(description, priority, minutes);
        TodoList.add(t);
    }

    public void print(){
        System.out.println("Todo:\n-----");
        if(TodoList.isEmpty()){
            System.out.println("You're all done for today! #TodoZero");
        } else {
            for (Task task : TodoList) {
                System.out.println(task.toString());
            }
        }
        if(totalAmount>0) System.out.println(totalAmount + " minutes of work done!");
    }

    public void completeTask(int index){
        try {
            totalAmount += TodoList.get(index).getWorkload();
            TodoList.remove(index);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }

    public void printPriority(int limit) {
        System.out.println("Filtered todo:\n--------------");
        for (Task task : TodoList) {
            if (limit >= task.getPriority()){
                System.out.println(task.toString());
            }
        }
    }

    public void printPrioritized(){
        System.out.println("Prioritized todo:\n-----------------");
        TodoList.stream()
        .sorted(Comparator.comparing(Task::getWorkload))
        .sorted(Comparator.comparing(Task::getPriority))
        .forEach(System.out::println);
    }
}