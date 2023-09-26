# Shopping List

<p>In this assignment, all methods described in the following should be defined as public. Note that the definition 
<br>of class and signature of methods should fully match the description. 
<br>If you want to add any additional methods that are not in the description, these should be defined as private. </p>

<p>You want to make the process of cooking during a week faster.<br>
So you write a program that can print a shopping list, based on the ingredients that are available at home and <br>
the required ingredients in some recipes that you want to cook. <br>
The shopping list should include all the necessary ingredients and their amount that you need to buy for cooking.</p>

Create a class called <code>ShoppingList</code>. In this assignment, you can choose which fields to define as you see fit.

Implement the constructor of the class, <code>ShoppingList()</code>, and perform any required initialisation.

<p>The program should first read the available ingredients at home and one or more recipes, all provided as user input. 
<br>Implement a method <code>void read()</code> that reads the user input provided in the following format.
<br>The list of available ingredients at home will start with a line <b>AVAILABLE</b> 
<br>Each recipe also starts with a line starting with <b>RECIPE</b>
<br>An example of such input is as follows:</p>

<b>AVAILABLE</b><br>
100 g potato <br>
1 kg tomato <br>
500 g onion <br>
300 g bread<br>
2 kg oil <br>
<b>RECIPE fish dish</b><br>
1 kg fish<br>
500 g potato<br>
100 g oil<br>
500 g milk

<p> As you can see above, each ingredient line has three parts: 
<b>amount unit ingredient</b>
<br>where amount is a whole number, unit is either <b>g</b> or <b>kg</b> and ingredient name is at the end of the line.</p>
 
<p>Implement the method <code>void printShoppingList()</code> that prints out a shopping list. 
<br>The printed shopping list must start with <b>Shopping List:</b> . Then in each line the required amount for each ingredient (which must be 
<br>in grams), the unit that is <b>g</b>, and the name of ingredient are printed. 
<br>The shopping list must be printed in alphabetical order. For the above example, the following shopping list is printed:
</p>
<p>
<b>Shopping List:</b><br>
    1000 g fish<br>
    500 g milk<br>
    400 g potato<br>
    
</p>
<p>If no item is in the shopping list the method just prints <b>Shopping List:</b></p>

<b>Files to submit:</b> ShoppingList.java



## Sample Test

### Input (stdin):
```sh
AVAILABLE
2 kg oil
1 kg rice
500 g cucumber 
800 g avocado 
RECIPE 1
500 g tomato
900 g cucumber 
300 g cheese 
100 g oil
```
### Expected Output:
```sh
Shopping List:
300 g cheese
400 g cucumber
500 g tomato
```