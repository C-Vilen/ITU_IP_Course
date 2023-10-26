package IP2023MidtermCoding;

import java.util.HashSet;
import java.util.Set;

// 8
public class Company {
    private Set<Employee> allEmployees;
    
    public Company(){
        allEmployees = new HashSet<>();
    }

    // 9
    public void addEmployee(Employee emp, int salary){
        emp.setSalary(salary);
        allEmployees.add(emp);
    }

    // 10
    public Employee findLeastBusy(int depId){
        Employee leastBusyEmployee = null;
        int leastAssignedTasks = Integer.MAX_VALUE;
        for (Employee employee : allEmployees) {
            if(depId == employee.getDepartmentId()){
                if(employee.getAssignedTasksNum() < leastAssignedTasks){
                    leastBusyEmployee = employee;
                    leastAssignedTasks = employee.getAssignedTasksNum();
                }
            }
        }
        return leastBusyEmployee;
    }

    // 11 
    public void assignTask(String task, int depId){
        Employee leastBusyEmployee = findLeastBusy(depId);
        if(leastBusyEmployee != null){
            leastBusyEmployee.addTask(task);
        }   
    }

    // 12
    public void raiseSalary(int percentage){
        int highestNumOfTasks = 0;
        for (Employee employee : allEmployees) {
            if(employee.getTotalProcessed() > highestNumOfTasks){
                highestNumOfTasks = employee.getTotalProcessed();
            }
        }
        for (Employee employee : allEmployees) {
            if(employee.getTotalProcessed() == highestNumOfTasks){
                int newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
                employee.setSalary(newSalary);
                System.out.println(employee.toString());
            }
        }
    }
}

