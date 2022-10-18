public class Main2 {
    /* This is my second handin of Student class
    This was done by C.Vilen 
    Due date: 12-09-2022 12:00
    */
    public static void main(String[] args) {
        // Student stud = new Student("Christian", 25); // Create new object of my class student.

        System.out.print("\033[H\033[2J"); //Clear terminal command
        // stud.setAge(10); // Try to set age of stud of age to 10.
        // System.out.println(stud.toString()); //Call toString method on my object stud.
        StudentHandin student = new StudentHandin("Henri", 42);
		student.setName("Julie");
		System.out.println(student.getName());
    }
}