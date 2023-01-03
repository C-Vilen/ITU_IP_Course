public class Person {
 
    /* 
     * Implement a class Person. Define a field name of type String
     * and a field idNumber also represented using a String. We assume
     * that each idNumber by default has 10 digits. Both fields are
     * initialised in the constructor.
     */

    private String name;
    private String idNumber;

    public Person(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    /* 
     * In class Person, implement a method toString() which returns a
     * String. The String includes the name of the person and the idNumber
     * such that the last 4 digits are replaced with four X. For example,
     * for a person with name "Alex" and idNumber "9210019774", the method
     * returns the following String: "Name: Alex, Id number: 921001XXXX"
     */
    
    public String toString() {
        return "Name: " + name + ", Id number: " 
        + idNumber.substring(0, 6) + "XXXX";
    }
}