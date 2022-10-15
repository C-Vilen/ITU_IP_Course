# Introductory Programming Resit Midterm exam GP21

In the following you will find the description of the programming problem. In this part, you need to implement a service robot that transfers boxes from an original position to a specified destination for each box. The boxes have labels and the priority of transferring a box depends on its label. Implement the Robot and Box classes as described below. Please note that it is important that the naming of your project, classes, and signature of methods exactly follow the description. All fields must be private and all methods must be public. (Points 77)

1. Define two classes Robot and Box.

2. The class Box has three fields position and destination of type int and label of type String. The fields destination and label are initialised in the constructor of the class with values of the two parameters of the constructor. All boxes have 0 as initial value for their position.

3. The class Robot has one field named name of type String. Furthermore, a field transferList of type List<Box> and another field named labelPriorities of type Map<String,Integer>. The constructor of the class has only one parameter of type String that is used for initialisation of the field name.

4. In class Box, implement three methods getPosition, getDestination and getLabel which have no parameter and return, respectively, the position, destination and the label of a box.

5. In class Box, implement a method forward that receives no parameter and increases the position of box by 1.

6. In class Robot, implement a method addToTransferList which adds boxes to the list to transfer. This method receives an object of type Box as its only parameter and adds it to transferList. The method returns true if the addition is successful and false otherwise.

7. In class Box, override the toString method such that for a box, with position p and label l, the method returns a String with the following format:
"position: p, label: l"
Note that the method does not have any parameters. (Points: 6)

8. In class Robot, implement a method printTransferList that prints the information about boxes in the transferList per line. For example, for a transferList that contains two boxes, b1 with position p1 and label l1, and box b2 with position p2 and label l2; the following will be printed after running the method:
    "position: p1, label: l1"
    "position: p2, label: l2"
This method does not have any parameter and does not return anything. (Hint: use the toString method in class Box as a helper method.)
7

9. In the class Robot, implement a main method. In the main method, create an object of type Robot and two objects of type Box. Add the two objects to the transferList using the methods above. Print the list of boxes to be transferred using the printTransferList method.

10. In class Robot, implement a method moveForward, which has two parameters called box and steps of types Box and int. The robot moves the box forward and steps represents how much the position of the box increases. However, a box may not be moved further than its destination and will remain in place once it reaches it. (Hint: this method uses method forward from the Box class as a helper method.)

11. In class Robot, implement a method setLabelPriority which receives a parameter called label of type String and another parameter called priority of type int that represents the priority of that label. If String is not null, then the method maps the key label to priority in labelPriorities.

12. In class Robot, implement a method getBoxPriority that returns the priority of a box (an int) based on the label of the box. If the label of the box is not a key in labelPriorities the method throws an IllegalArgumentException exception with the message "Invalid label!".

13. In class Robot, implement a method selectNextBox, which selects a box from transferList with highest priority to move. The method returns the selected box. Once the box with highest priority is selected, it is removed from the transferList. If there are several boxes with highest priority, only one will be selected, and it does not matter which one you pick. If the transferList is empty, the method returns null. (Hint: the method uses getBoxPriority as a helper method.)

14. In class Robot, implement a method removeFromTransferList, which receives a parameter labelRem of type String. The method removes all boxes that have a label with value of labelRem from the transferList.