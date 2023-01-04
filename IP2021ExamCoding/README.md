# Introductory Programming Reexam exam GP21
## Question 1 - First coding part
In the following you will find the description of the first programming problem that is about a smart garden. A smart garden assists taking care of house plants.

Please note that it is important that the naming of your classes, and signature of methods exactly follow the description. All fields must be private and all methods must be public. (55 Points)



1. Create a Plant class containing a field name of type String and three fields moistureLevel, optimalMoistureLevel, and optimalLightingLevel of type int.  The moistureLevel field is the amount of water that the plant currently has whereas the optimalMoistureLevel represents the amount of water that the plant should typically have. 



2. Create a constructor for Plant that takes the value of all four fields as arguments and initialises the fields of the class. 



3. Create the methods getName() and getOptimalLightingLevel()  that return the name and the optimalLightingLevel of the plant, respectively.



4. Create a method getRequiredWater() that returns how much water a plant must receive in order to reach its optimal moisture level. You may assume that the moistureLevel is smaller than or equal to the optimalMoistureLevel.



5. Create a method water(amountOfWater) that given an argument of type int increases the moistureLevel of a plant by that amount. 



6. Generate the methods equals() and hashCode() for the Plant class (in VSCode right click in source document -> Source Action -> generate hashCode() and equals()). Do not try to create them yourself if you are not able to do this. Questions (12) and (14) will work incorrectly if you don't have these methods but rather use the default ones, but you will not be docked point from them. The implementation of the two methods are also attached in one file below the page. Using these implementations requires that the fields are defined exactly according to the description. 



7. Create SmartGarden class containing two fields roomLight  and waterTankLevel of type int and a field plants of type List<Plant>



8. In the SmartGarden class, create a constructor that takes values for the fields roomLight and waterTankLevel as arguments and initialises them. Your constructor should also include other code required to make instances of the class work properly.



9. In the SmartGarden class, create a method addPlant(plant) that given an argument of type Plant adds that plant to the plants list. 



10. In the SmartGarden class, implement a method waterPlants() that goes through the plants list and waters all plants with the amount they require to reach their optimalMoistureLevel. Furthermore, decrease the value of the water tank level by the corresponding amount. However, if there is not enough water in the tank to water a plant then throw a  LowWaterLevelException exception with the message "there is not enough water". (The implementation of this exception is attached at the end of this page.) 



11. In the SmartGarden class, create a method checkLighting() that compares the room light level with the required light for each of the plants in the SmartGarden. For every plant in the smart garden print:

“plant <name> requires more light" if the light level of the room is strictly smaller than the optimal light level for the plant 
"plant <name> requires less light" if the light level of the room is strictly greater than the optimal light level for the plant 
"plant <name> has the perfect amount of light" otherwise. 
In all cases <name> refers to the actual name of the plant. 



12. In the SmartGarden class, create a method numberOfPlants() that returns a map of type Map<Plant, Integer> containing a plant as a key and the number of times that plant appears in the garden as its value. 



13. In the Plant class, create a method printReport() that prints the name, the moistureLevel, the optimalMoistureLevel, and the optimalLightingLevel of the plant using the format:

 "plantName: <name>, current water: <moistureLevel>, required water: <optimalMoistureLevel>, required light: <optimalLightingLevel>"



14. In the SmartGarden class, implement a method printReport() that prints the plant description for all the plants in the smart garden using the printReport method of the Plant class. However, you should only print each plant once, even if it occurs multiple times. Hint: Use the numberOfPlants() method.  



Helper files: LowWaterLevelExceptionhashcode(),equals() implementations 

## Question 2 - Second coding part
In this programming problem (Points: 15):

1. Implement a class Person. Define a field name of type String  and  a field idNumber also represented using a String. We assume that each idNumber by default has 10 digits. Both fields are initialised in the constructor. 

2. In class Person, implement a method toString() which returns a String. The String includes the name of the person and the idNumber such that the last 4 digits are replaced with four X. For example, for a person with name "Alex" and idNumber "9210019774", the method returns the following String:  "Name: Alex, Id number: 921001XXXX" 

3. Implement a class Student that is a subclass of Person. The class has a field studyProgram of type String. The field is initialised in the constructor. Additionally, the constructor receives String  parameters used for initialising idNumber and name of the super class.

4. In the class Student, implement a toString method that returns a String. This String includes the name and ideNumber of a student in addition to the studyProgram. The format of the String is same as the one explained above just at the end the study program is added. For example:  "Name: Alex, Id number: 921001XXXX, Study program: Software Design"  

5. In a class called Main, implement a method printInfo which receives a List of person and prints the information of each person per line.