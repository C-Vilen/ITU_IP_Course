Exercise

You want to make the process of cooking during a week faster. So you write a program that based on the items that are available at home and the ingredients in some recipes that you want to cook, can print a shopping list. The shopping list includes all the ingredients and their amount that you need to buy for cooking. Your program should be called ShoppingList.

The program should first read the available ingredients at home and one or more recipes provided as input text. The list of available ingredients at home will start with a line AVAILABLE. Each recipe also starts with a line starting with RECIPE. An example of such input is as follows.

AVAILABLE
100 g potato
1 kg tomato
500 g eggs
300 g bread
2 kg oil
RECIPE 1
1 kg fish
500 g potato
100 g oil
500 g milk
As you can see above, each ingredient line has three parts: amount unit ingredient, where amount is a whole number, unit is either g or kg and ingredient name is at the end of the line.

Your implementation must have a printShoppingList() method that prints a list of ingredients to buy. The printed list must be in alphabetical order and in the following format:

Shopping List:
1000 g fish
500 g milk
400 g potato
The required amount for each ingredient must be in g (grams).

If no item is in the shopping list the method just prints the header Shopping List: