public class Student extends Person {

    /*
     * Implement a class Student that is a subclass of Person.
     * The class has a field studyProgram of type String.
     * The field is initialised in the constructor.
     * Additionally, the constructor receives String parameters
     * used for initialising idNumber and name of the super class.
     */

    private String studyProgram;

    public Student(String name, String idNumber, String studyProgram) {
        super(name, idNumber);
        this.studyProgram = studyProgram;
    }

    /*
     * In the class Student, implement a toString method that returns
     * a String. This String includes the name and idNumber of a student
     * in addition to the studyProgram. The format of the String is same
     * as the one explained above just at the end the study program is
     * added. For example:  "Name: Alex, Id number: 921001XXXX, Study program: Software Design"
     */

    @Override
    public String toString() {
        return super.toString() + ", Study program: " + studyProgram;
    }
}