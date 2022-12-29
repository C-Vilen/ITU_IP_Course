# Introductory Programming Midterm exam GP21

In the following you will find the description of a system for managing a laboratory. A laboratory has a set of available equipment and students can sign up to and sign off from a laboratory. Additionally they can book equipment to work with. Implement the classes for laboratory and students as described below. Please note that it is important that the naming of your project, classes, and signature of methods exactly follow the description. All fields must be private and all methods must be public. For methods where the signature is not fully described, implement a method with an appropriate signature. (Points 60)
1. Define two classes Lab and Student.

2. The Lab class has two fields name and capacity of types String and int, respectively. These two fields are initialised in the constructor of the class with values of the two parameters of the constructor.

3. The Student class has a field name of type String and a field age of type int. The constructor of the class initialises the field name with the value of its parameter.

4. The Student class also has two methods setAge and getAge which are used, respec- tively, to set the value of age to different values and to return the value of age.

5. Define a field named students of type List<Student> in the Lab class.

6. In the Lab class create the following two methods that take a Student as an argumentand return true if the operation succeeds and false if it fails:
• a method register which registers a student (adds it to students) if the lab
capacity is not full and if the student is not already registered.
• a method remove that removes a student from the list if the student is registered.

7. Define two methods, signUp and signOff in the Student class which are responsible for signing up the student to a lab and signing off the student from a lab, using the register and remove methods from Lab as helper methods. These new methods should take a Lab as an argument and return true if the operation was successful and false otherwise.

8. A lab contains available equipment. Define a field in the Lab class which is named availableEquipment of type Set<String>. Each member in this set is the name of a piece of equipment that is available in the laboratory, for example ”barometer”.

9. Implement a method addEquipment in the class Lab such that it receives the names of equipment from the standard input and adds them to the set availableEquipment. In this method you need to use a Scanner to get the input from the standard input. The first line includes a whole number representing the number of pieces of equipment that are going to be added. Assuming that the value n is in the first line; the next n lines in the input each include a name of a piece of equipment. For example reading the following lines from the standard input

    3
    "hammer"
    "spanner"
    "mallet"
    "this row will not be read because the number was three"
should add the strings "hammer", "spanner", and "mallet" to availableEqipment.

10. Define a field studentEquipment in the Lab class of type Map<Student, Set<String >> representing all equipment that has been booked by a student. Each entry in studentEquipment contains a Student object mapped to a set of equipment names i.e., set of strings, that the student has borrowed.

11. In the class Lab, implement a method with signature boolean bookEquipment( Student student, String equipmentName) that adds the single piece of equip- ment called equipmentName to the equipment booked by student and removes equipmentName from the available equipment of the lab. If the lab does not contain equipmentName throw an excption of the type IllegalArgumentException with the message "Equipment not available!".

12. In class Lab implement a method void returnEquipment(Student student) which adds all the equipment booked by the student to the set availableEquipment and furthermore updates the map studentEquipment by removing the entry with key student.

13. Define a class GradStudent as a subclass of the Student class.

14. Each graduate student can at most be signed up to three labs at any one time. To implement this restriction, add necessary fields and override the signUp and signOff methods by making the necessary changes. Make sure that any relevant state of GradStudent only updates when you successfully register or deregister from a lab.