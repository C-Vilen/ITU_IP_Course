# Trees and Forests

## Exercise
This exercise is about modelling a small forest of trees. Each tree has an age, a height, and also a growth rate. You have to do the following:

Create a class `Tree`

Add the following three private fields to the Tree class:

* `age` of type `int`: the tree's age in years.
* `height` of type `double`: the tree's height in meters.
* `growthPct` of type `double`: the tree's growth per year as a percentage.

Create a constructor for the class `Tree(double growthPct)`, taking a single parameter of type `double`. The constructor must set the initial height to be 0.25 meters, and the age to be 1 year, and the growth rate to be the parameter given to the constructor.

Create a public `toString()` method that returns a String with the format: "`Tree(age = 1, height = 0.25)`", where `1` and `0.25` are substituted with what the value of the corresponding fields are.

Create a public method `growOneYear()`, which increases the age by one, and increases the height of the tree according to the formula `height * (1 + growthPct / 100)`.

Modify the `growOneYear()` method such that a tree will stop growing once it reaches a height of 20 meters.

Create a class `Forest`

Add a private field trees that stores a `List of Tree`

Create a constructor for the class `Forest()`. The constructor must initialize the `List`.

Create a public `addTree(int growthPct)` that adds a `Tree` to the `List`.

Create a public `toString()` method that returns a String with the format: "`Forest(Tree(age = 1, height = 0.25)Tree(age = 1, height = 0.25)Tree(age = 1, height = 0.25))`", where the data reflects the actual state of each tree.

Create a `growOneYear()` method that causes all the trees in the forrest to grow by one year.

## Sample Test

### Test Script (Java):
```sh
public class Test01 {
    public static void main(String[] args){
        CodeJudgeHelpers.checkClassExist("Tree");
    }
}
```
### Expected Output:
```sh
Checking if a class called Tree has been uploaded
Yes
```