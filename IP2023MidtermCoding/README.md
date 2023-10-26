# Midterm 2023 Coding questions
## Description

In the following you will find the description of a company which has different departments with employees. All fields must be private, and all methods listed for each question must be public. Any auxiliary helper method you create must be private. You may assume that all arguments used in method calls have valid values, so you do not need to use defensive programming (check for validity of arguments)   

 ## Tasks:

1. Implement a class called Employee. The class has the following fields: name of type String, departmentId of type int, which represents the department where the employee works, salary of type int, assignedTasks of type List<String>, which represents the list of tasks that are assigned to the employee to process, and totalProcessed of type int, that represents the number of processed tasks. 

 

2. Implement the constructor Employee(String name, int salary, int departmentId) that initialises the fields with the value of the corresponding parameters. Furthermore, it initialises totalProcessed to zero and assignedTasks with an empty list. 

 

3. Implement methods getTotalProcessed(), getDepartmentId(), and getSalary() that return the value of totalProcessed, departmentId, and salary, respectively, and implement the method getAssignedTasksNum() that returns the size of the assignedTasks list. 

 

4. Implement a method setSalary(int newSalary) that sets the value of salary to newSalary. 

 

5. Implement a method processTask() that prints 
    * “processing task <t>”  where <t> is the task at index 0 in assignedTasks, if assignedTasks is non-empty, removes this task from the list, and increases the value of totalProcessed by one. 
    * “no tasks to process” otherwise. 

 

6. Implement a method toString(), which returns a string “name: <name>, department Id: <departmentId>, salary: <salary>”, where <x> is the value of field x. 

 

7. Implement a method addTask(String newTask), that adds newTask to the end of the list assignedTasks. 

 

8. Implement a class called Company. The class has a field called allEmployees of type Set<Employee>. In the constructor of the class initialise allEmployees with an empty set. 

 

9. In the Company class, implement a method addEmployee(Employee emp, int salary) such that it sets the salary of emp to salary and adds the employee emp to allEmployees.  

 

10. In the Company class, implement a method findLeastBusy(int depId) which returns the employee in allEmployees who has the smallest number of assigned tasks (size of the assignedTasks list) and whose departmentId is depId. Assume that there is at least one employee in each department. If there are multiple employees with the smallest number of assigned tasks, return any of them. 

 

11. In the Company class, implement a method called assignTask(String task, int depId) that adds task to the assignedTasks list of an employee in allEmployees who has smallest number of assigned tasks in department depId. (Hint, use findLeastBusy method as a helper method)  

 

12. In the Company class, implement a method called raiseSalary(int percentage) which finds the employee(s) in allEmployees that have the highest number of processed tasks, increases the salary of these employees by percentage percent, using Math.round(), and prints the information of these employees according to the format explained in task 6. For example, if percentage is 20, the salary is increased by 20 percent for all relevant employees. If there are multiple employees with highest number of processed tasks, the printing order does not matter.
    
    Note: To make this work you will need to use casting between the primitive types as Math.round expects values of either type float or double to function, and the result can be either a value of type int or long and, if it is the latter, it must be cast to an int. 

## Upload instructions
Uploading: Add the Employee.java and Company.java files in one folder called YourName_YourStudentNumber. Upload the compressed folder as a .zip file below (use the box with drag and drop files sign).  

