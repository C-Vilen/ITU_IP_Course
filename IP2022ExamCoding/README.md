# Exam in Introductory Programming (Autumn 2022)
## Question 1 - First coding part
In the following you will find the description of a car service center in which it is possible to service cars and fill gas (gasoline). All the fields should be private and all the methods in the description should be public. In the implementation, you are not allowed to add methods which are not a part of the description unless the method is declared as private. We assume that the arguments in method calls have valid values and you do not need to use defensive programming (check for validity of arguments)  

points: 50

1. Define the class Car with a field plate of type String representing a car's unique license plate. It also contains the integer fields mileage representing the number of kilometers the car has driven in its life time, lastServiceMileage representing the car's mileage when it was last serviced, tankCapacity representing the gas tank capacity in liters, and gasLevel representing the current amount of gas. Finally, it contains a field consumption of type float representing the number of liters of gas the car consumes per kilometer driven. 

    In the constructor of the class, initialise the fields plate, tankCapacity and consumption with parameters of the constructor and set all other fields to 0.

2. In Car, implement the methods getPlate(), getTankCapacity(), and getGasLevel(), which return the value of the corresponding fields in the class.

3. In Car, implement a method kmSinceService() that returns the number of kilometers the car has driven since the last service.

4. In Car, implement a method fillTank(int gasAmount) that increases the gas level in the tank with gasAmount, if this does not exceed (become strictly greater than) the tank capacity, and throws a GasOverFlowException otherwise. 

    The implementation of GasOverFlowException is attached at the end of this page.

5. In Car, implement a method service() which sets the value of lastServiceMileage to mileage.

6. In Car, implement a method needsService(), which returns true if the car has driven more than 30000 kilometers since its last service and false otherwise.

7. In Car, define a method drive(int d) that computes the amount of gas required to drive d kilometers, using d and consumption, and rounding the result to the nearest integer using Math.round. If there is enough gas in the tank then add d to mileage, remove the required gas from gasLevel, and return true. Otherwise do nothing and return false.

    Math.round(float f) takes a floating point number f and rounds f to its nearest integer value.

8. Define a class ServiceCenter with fields serviceQueue of type List<Car>, carsPriority of type Map<String, Integer>, which maps a car license plate to a value representing a priority (higher value means higher priority) and gasPrice of type int that shows the price of each liter of gas. In the constructor, initialise gasPrice with the parameter of the constructor and serviceQueue and carsPriority as an empty list and an empty map, respectively.

9. In ServiceCenter, implement a method addToServiceQueue(Car c), that first checks whether the license plate of c is in the carsPriority keys, if yes then it adds c to the end of serviceQueue. Otherwise, it prints “Car <license plate> not found” where <license plate> is the license plate of c.

10. In ServiceCenter, implement a method fillGas(Car c) that fills the gas tank of car c to full capacity. This method returns an int value that is the total price of the gas that was filled in the tank of the car. 

11. In ServiceCenter, implement a method updatePriority(Car c, int p) that updates the priority mapped to the license plate of the car c, in the carsPriority map, with priority p. If the license plate of the car is not in the map, it is added with priority p.

12. In ServiceCenter, implement a method serviceCar(Car c) that fills the gas tank, services the car if it needs service, and prints “Car <license plate> serviced for <price> dollars” where <license plate> is the license plate of c and <price> is the total price for the filled gas plus 500 if the car needed service.

13. In ServiceCenter, implement a method serviceAll() which services the cars in serviceQueue from the beginning to the end (using the serviceCar method). After servicing each car, the car is removed from the serviceQueue.

14. In ServiceCenter, implement a method called findHighestPriority() which returns the index of the car with highest priority in the serviceQueue. You may assume that priorities are strictly greater than 0 and return -1 if the queue is empty. If there are several cars with same priority, returns the smallest index.

15. In ServiceCenter, implement a method serviceAllWithPriority() which services the cars (using the serviceCar and/or serviceAll methods) in serviceQueue in order of priority. The cars with higher priority are serviced first. After servicing each car the car is removed from serviceQueue.

    Helper file: GasOverFlowException.java

## Question 2 - Second coding part
In the following you will find the description of a project base system which keeps the title of a set of projects and can search in the titles with specific queries. All the fields should be private and all the methods in the description should be public. In the implementation, you are not allowed to add methods which are not a part of the description unless the method is declared as private. We assume that the arguments in method calls have valid values and you do not need to use defensive programming (check for validity of arguments) 

points: 15

1. Define a class called ProjectBase which has a private field called projectTitles of type List<String>. In the constructor of the class, initialise projectTitles with the constructor parameter.

2. In ProjectBase, implement a method addTitle(String t) which adds the project title t to the projectTitles.

3. In ProjectBase, implement a method search(String query) which returns a set of titles (Set<String>) from projectTitles that contain query, meaning that query is a substring of each title in the returned set. 

    Hint: s1.contains(s2) returns true if s2 is a substring of s1 and false otherwise.

4. Implement a class called AdvancedProjectBase that extends the ProjectBase class.

5. In AdvancedProjectBase, implement a method search(String query) in which if query contains commas (","), it is split on these commas. For example, the query “q1,q2,q3” is split into three sub-queries “q1”, “q2”, and “q3”. The method returns a set of titles (Set<String>) which contain at least one of the sub-queries (In the above example, titles that contain at least one of “q1”, “q2” or “q3”.)