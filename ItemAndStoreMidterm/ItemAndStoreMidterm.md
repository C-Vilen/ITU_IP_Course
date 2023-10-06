# Midterm Exam for Item and Store.
Please note that in this programming question, it is important that the naming of your classes, and signature of methods exactly follow the description. All fields must be private and all methods must be public.  

## Problem description:
This programming problem is about an online store for a number of cloth items. Implement two classes Item and Store based on the following description.

## Tasks:
1. Implement a class Item which has two fields of type String called kind and color. This class also has a field called price of type int (here we assume prices are rounded). Implement the constructor of the class which receives three parameters. Initialize the fields using the  parameters of the constructor.

2. In class Item, implement three methods getKind(), getColor() and getPrice() that, respectively, return the value of kind, color and price fields.

3. In class Item, implement a method setPrice(p) which receives a parameter p of type int. The method sets the price of item to p.

4. In class Item, implement a method compare(i) which receives an item i. The method returns true if i has the same kind, color and price as this item. Otherwise it returns false.

5. Implement a class called Store which has one field called storeItems of type List<Item>. This field keeps a list of items available in the store. In the constructor of the class initialize the storeItems field with an empty list.

6. In class Store, implement a method addItem(i) which receives a parameter i of type Item. The method adds i to the storeItems list.

7. In class Store, implement a method removeLatest() that removes the last item that was added in the storeItems and returns the removed item.

8. In class Store, implement a method findItem(i) which returns true if there is at least one item in the storeItems list that has the same kind, color and price as i and otherwise it returns false.

9.  In class Store, implement a method allColors(k) that receives k that is the kind of an item (a parameter of type String) and returns a  set that includes the color of items in storeItems that have kind k (each color appears at most once in the set).

10. In class Store, implement a method filterPrice(p) which receives a parameter p of type int. This method removes all items from the storeItems that have a price strictly higher than p.

11. In class Store, implement a method discount(k,d) which receives an item's kind k (of type String) and a discount amount d of type int. The method decreases the price of each item in the storeItems that has kind k, with amount d.

12. In class Store, implement a method kindNumbers() which returns a map of type Map<String,Integer>. This map contains as keys the kind of items in the storeItems mapped to the number of items with that kind.