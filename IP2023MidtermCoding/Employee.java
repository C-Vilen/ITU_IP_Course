package IP2023MidtermCoding;

import java.util.ArrayList;
import java.util.List;

// 1
public class Employee {
    private String name;
    private int departmentId;
    private int salary;
    private List<String> assignedTasks;
    private int totalProcessed;
    
    // 2
    public Employee(String name, int salary, int departmentId){
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
        this.totalProcessed = 0;
        this.assignedTasks = new ArrayList<>();
    }
    
    // 3
    public int getTotalProcessed() {
        return totalProcessed;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getSalary() {
        return salary;
    }

    public int getAssignedTasksNum() {
        return assignedTasks.size();
    }

    // 4
    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    // 5
    public void processTask(){
        if(!assignedTasks.isEmpty()){
            String processedTask = assignedTasks.remove(0);
            System.out.println("processing task "+processedTask);
            totalProcessed++;
        } else {
            System.out.println("no tasks to process");
        }
    }
    
    // 6
    public String toString(){
        return "name: "+name+", department Id: "+departmentId+", salary: "+salary;
    }
    
    // 7
    public void addTask(String newTask){
        assignedTasks.add(newTask);
    }
}
