public class Main {
    public static void main(String[] args) {
        Todo myTodoList = new Todo();
        myTodoList.addTask("Cook dinner", 1, 45);
		myTodoList.addTask("Do dishes", 2, 30);
		myTodoList.addTask("Read chapter 10 of BlueJ book", 4, 180);
		myTodoList.addTask("Phone mom", 3, 240);
		myTodoList.addTask("Pickup kids", 1, 15);
		myTodoList.printPrioritized();
    }
}
