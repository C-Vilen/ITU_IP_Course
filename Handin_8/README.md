Exercise
You are struck by an inexplicable urge to become more organized, but instead of doing something useful, you end up procrastinating by creating a program for keeping track of stuff you need to get done.

Create two classes, Task (which will represent a single item that needs to get done) and Todo (which will hold all the tasks organized).

Create a constructor for Task that takes three parameters:

A description of the task, as a String
A priority, which is int between 1 and 4 inclusive. The four priorities translate to:
very important
important
unimportant
after learn Portuguese
The workload as an amount of time (in minutes) it would take to complete the task, which is an int
Create a toString() method for Task, so that:

new Task("Stuff", 1, 15).toString() will give the String "Stuff takes 15 minutes and has priority very important"
new Task("Eat lunch", 3, 1).toString() will give the String "Eat lunch takes 1 minutes and has priority unimportant"
Add a method addTask(String description, int priority, int minutes) to Todo.
If the priority isn't valid, it should print: "[Description] has invalid priority" e.g. "Get a hangover has invalid priority".
If the workload is negative, it should similarly print: "[Description] has invalid workload". Otherwise, it should add a new task to the Todo with the given parameters.

Add a method print() to Todo that first prints two lines:
Todo:
-----
, followed by all the tasks previously added, with one line per task.
Add a method completeTask(int index). If the index is not valid, it must print: Invalid index. Otherwise the matching task is removed.

Modify print() so that it prints: You're all done for today! #TodoZero if the Todo does not contain any items.

Modify completeTask(int index) so that the workload of each completed task is added to a running total of completed work.
Furthermore, modify print() so that if a positive amount of work has been completed, it prints: "[total] minutes of work done!" after the tasks, e.g. "10 minutes of work done!".

Add a method printPriority(int limit) that prints:
Filtered todo:
--------------
followed by all the tasks that have a priority more important than the given limit. E.g., if the limit is 2, only tasks with priority 1 or 2 should be printed. If no tasks are printed in this way, it must print: No tasks with given priority
Add a method printPrioritized() that prints:
Prioritized todo:
-----------------
followed by all tasks first ordered by priority. If two tasks have the same priority, the task requiring the least amount of work should come first.