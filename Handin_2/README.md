# Student

## Exercise
Create a class called **Student**.

The class has two fields:

* The name of the student (String **name**)
* The age of the student (int **age**)

and a constructor **Student(String name, int age)**, that initializes the fields to the value of the parameters.

Create two methods **String getName()** and **int getAge()** to retrieve the name and age of a student.

Create a **String toString** method (A textual representation of an object). A student should be represented by the following text: "The name of the student is [name]. The student is [age] years old."

Create two setter methods **void setName(String name)** and **void setAge(int age)** to change the name and age for a student.

In the **void setAge(int age)** it is important to know that the university only admits students between 16 and 99 years old. If the student is too young print "The university does not accept students below 16". If the student is too old print "The university does not accept students that are older than 99". Only set the age, if the age is within the range.

## Sample Test

### Test Script (Java):
```sh
public class Test01 {
	public static void main(String[] args) {
		CodeJudgeHelpers.checkClassExist("Student");
	}
}
```
### Expected Output:
```sh
Checking if a class called Student has been uploaded
Yes
```