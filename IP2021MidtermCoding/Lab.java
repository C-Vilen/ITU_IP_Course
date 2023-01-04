import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lab {

    // The Lab class has two fields name and capacity of types String and int, respectively. 
    // These two fields are initialised in the constructor of the class with values of the two parameters of the constructor.
    private String name;
    private int capacity;
    private List<StudentMidterm> students;
    private Set<String> availableEquipment;
    private Map<StudentMidterm, Set<String>> studentEquipment;

    public Lab(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        students = new ArrayList<>();
        availableEquipment = new TreeSet<>(); 
        studentEquipment = new HashMap<>();
    }

    // Register a student to a lab
    public boolean register(StudentMidterm studentMidterm) {

        // If the laboratory still has room and the
        // student is not already registered for that lab,
        // register the student for the lab and return true
        if (students.size() < capacity && !students.contains(studentMidterm)) {
            students.add(studentMidterm);
            return true;
        }
        return false;

    }

    // Remove a student from a lab
    public boolean remove(StudentMidterm studentMidterm) {

        // If the student is registered for the lab,
        // remove the student from the lab and return true
        if (students.contains(studentMidterm)) {
            students.remove(studentMidterm);
            return true;
        }
        return false;
    }

    // Add equiment via the Scanner
    public void addEquipment() {

        Scanner sc = new Scanner(System.in);

        // Turn the first line into an integer using
        // the Integer wrapper class method parseInt(String string)
        int n = Integer.parseInt(sc.nextLine());

        // Read the number of lines given by n
        // and add each line to the set of available equipment
        for (int i = 0; i < n; i++) {
            availableEquipment.add(sc.nextLine());
        }

        sc.close();
    }

    // Allow a student to book equipment
    public boolean bookEquipment(StudentMidterm student, String equipmentName) {

        // If the given equipment is not available, throw an exception
        if (!availableEquipment.contains(equipmentName)) {
            throw new IllegalArgumentException("Equipment not available!");
        }

        // If the student is not signed up for the lab, don't let them book equipment
        if (!students.contains(student))
            return false;

        // If no exception was thrown, remove the
        // given equipment from availableEquipment
        availableEquipment.remove(equipmentName);

        // If the student is not in the studentEquipment map,
        // create a new entry with a new TreeSet or HashSet
        if (!studentEquipment.containsKey(student)) {
            studentEquipment.put(student, new TreeSet<>());
        }

        // Access the (perhaps empty) set of equipment using the
        // student as the key, and add the equipment given as a
        // parameter to the set to book it
        studentEquipment.get(student).add(equipmentName);

        return true;
    }

    // Allow a student to return all the equipment they have booked
    public void returnEquipment(StudentMidterm student) {

        if (studentEquipment.containsKey(student)) {

            // Access the set of equipment that the student has booked
            Set<String> equipment = studentEquipment.get(student);

            // For each piece of equipment, add it
            // to the set of available equipment
            for (String e : equipment) {
                availableEquipment.add(e);
            }

            // Then remove the student key (and thus also
            // the set of booked equipment) from the map
            studentEquipment.remove(student);
        }
    }

    public String getName() {
        return name;
    }
}