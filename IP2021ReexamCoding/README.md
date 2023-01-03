# Introductory Programming Reexam exam GP21
## Question 1 - First coding part
In the following you will find the description of a postal service point system in which it is possible to register items to post. All the fields should be private and all the methods in the description should be public. In the implementation, you are not allowed to add methods which are not a part of the description unless the method is declared as private. Note that in the description <x> represents value of variable x.

1. Implement a class Item with fields called category and address of type String and also a field weight of type int. The field weight represents the weight of an item in kilograms. All fields are initialised in the constructor of the class.

2. Implement methods getAddress(), getWeight(), and getCategory() that respectively return the value of address, weight and category of an item. 



3. Implement a class named PostServicePoint with the following fields: a field called registeredItems of type Item[] with size 10, another field named processedItems of type List<Item>, and two fields named maxWeight and count which are of type int. 



4. The fields maxWeight is initialised by the parameter of the constructor of the class and furthermore, the constructor should include any code required to make instances of the class work properly. 



5. In class PostServicePoint, implement a method register(item), which receives a parameter of type Item. The method adds the item in registeredItems array if it has capacity (is not full) and if the array is full, prints "no available capacity!". Note that item is added right after the last item in registeredItems array (if the array is empty it is added in position 0). (hint: use the field count to keep track of the number of items that are in registeredItems.)  



6. In class PostServicePoint, implement a method checkItemAddress(adr) which receives an address (a String). The method checks that the received address adr is valid by checking that it has a length strictly smaller than 20. The method returns true if the address is valid and returns false otherwise. 



7. In class PostServicePoint, implement a method checkItemWeight(wgh), which receives a value for weight (an int). The method checks that the received value wgh is valid by checking it is strictly smaller than the maxweight and returns true if it is the case and returns false otherwise. 



8. In class PostServicePoint, implement a method printPrice(i), which receives an index i (an int). The method calculates and prints the price for sending the item in index i in the registeredItems array (if it exists). The price is calculated based on the weight of the item as: 12 DKK for each two kilograms. For price x the method prints "The price for sending is: <x>". (If the value of weight is not divisible by two then it is rounded up. For example if the value of weight is 3, the price is 24 DKK and if the weight is 5 the price is 36 DKK.)



9. In class PostServicePoint, implement a method printAllPrices() which prints per line the calculated price for each of the items in array registeredItems, starting from the first item to the last item in the array. (hint: use the method printPrice as a helper method)



10. In class PostServicePoint, implement a method processOne() which processes the last item in the registeredItems array as follows. If the item has valid address and weight, then it is added to the processedItems list. If the item has invalid address it prints "invalid address!" and if weight is invalid it prints "invalid weight!". After processing the item the number of items in registeredItems is decreased by one, i.e. the processed item is not considered any more. 



11. In class PostServicePoint, implement a method processAll() that processes all the items in the registeredItems array, starting from the last item to the first item in the array. (hint: use processOne as a helper method.) 



12. In class PostServicePoint, implement a method totalweight() that returns the sum of the weight of the items in the processedItems list. 



13. In class PostServicePoint, implement a method checkCategories() that returns a map of type Map<String,Integer>. Each entry in the returned map contains a category mapped to the number of items in the processedItems list which have that category. 



14. In class PostServicePoint, implement a method removeCategory(c) which receives a category c (a String). It removes all the items in the processedItems list which have category c. 

## Question 2 - second coding part
In the following you will find the description of a programming problem. All the fields should be private. In the implementation, you are not allowed to add methods which are not a part of the description unless they are defined as private. 



In the following tasks, you can assume that any parameter of type String only contains digits and dots (.), for example "12.13.1" or "1.432.111.22." and is not null (you do not need to check for this).



1. Implement a class User, with fields userIP of type String and level of type int. In the constructor only the field level is initialised. 

In this class implement a private method called checkIPValidity(ip) which receives a parameter of type String. The method returns true if the received parameter ip is valid, that is: it starts with "99", contains three dots, and each dot is followed by at least one digit. Otherwise it returns false. for example:

"993.342.12.01" is valid 

"99.111.9999." is not valid (last dot is not followed by a digit)

"99.121.44" is not valid  (does not have three dots)

".9999.11.23.1" is not valid (does not start with "99")





2. In the class User, implement a method setIP(ip) which receives a parameter of type String. The method sets the value of userIP to ip (the received parameter), if ip is valid otherwise it does not change the value of userIP. (hint: use checkIPValidity as a helper method.) 



3. Implement a class RegUser which is a subclass of User. In this class add a field called region of type int, which is initialised in the constructor. 



4. In class RegUser, implement a private method checkIPValidity(ip) which receives a parameter of type String. This method checks that ip is valid, that is: none of the substrings separated by dots are equal to "111". If this condition is satisfied it returns true otherwise it returns false. For example:

"111.101.12.01" is not valid as the substrings separated by dots are "111", "101", "12" and "01" and one of them is equal to "111"





5. In class RegUser, override the method setIP such that setIP(ip) sets the value of userIP to ip (the received parameter) if ip satisfies both of the following conditions:  

- starts with "99", contains three dots, and each dot is followed by at least one digit

- none of the substrings separated by dots are equal to "111"