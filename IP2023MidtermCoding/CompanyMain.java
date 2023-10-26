package IP2023MidtermCoding;

public class CompanyMain {
    public static void main(String[] args) {
        // Add employees
        Employee alice = new Employee("Alice", 1000, 1);
        Employee bob = new Employee("Bob", 100, 1);
        Employee charlie = new Employee("Charlie", 100, 2);
        Employee dave = new Employee("Dave", 1000, 2);
        
        // Create company and add employees
        Company ITU = new Company();
        ITU.addEmployee(alice, 1000);
        ITU.addEmployee(bob, 100);
        ITU.addEmployee(charlie, 100);
        ITU.addEmployee(dave, 1000);

        // Assign tasks and process one to Alice
        alice.addTask("Task 1");
        alice.addTask("Task 2");
        alice.addTask("Task 3");
        System.out.println("Alice processes a task");
        alice.processTask();

        // See Alice's info
        System.out.println("\n" + alice.toString());

        // Find least busy employee in department 1
        Employee emp = ITU.findLeastBusy(1);
        System.out.println("\n" + "The least busy employee is: " + emp.toString());

        // Assign tasks to least busy employee in department 1
        ITU.assignTask("Task 4", 1);

        // Raise salary of employee with most processed tasks by 10%
        System.out.println("\n");
        ITU.raiseSalary(10);
    }
}
