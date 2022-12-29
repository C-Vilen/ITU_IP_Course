import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lab {
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
        studentEquipment = new TreeMap<>();
    }

    public boolean register(StudentMidterm student) {
        boolean success = false;
        if (students.size() < capacity && !students.contains(student)){
            students.add(student);
            success = true;
        }
        return success;

    }

    public boolean remove(StudentMidterm student) {
        if(students.contains(student)) {
            students.remove(student);
            return true;
        }
        return false;
    }

    public void addEquipment() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            availableEquipment.add(sc.nextLine());
        }
        sc.close();
    }

    public boolean bookEquipment(StudentMidterm student, String equipmentName) {
        if(!availableEquipment.contains(equipmentName)) {
            throw new IllegalArgumentException("Equipment not available!");
        }
        
        if (!studentEquipment.containsKey(student)) {
            studentEquipment.put(student, new TreeSet<>());
        }

        studentEquipment.get(student).add(equipmentName);
        availableEquipment.remove(equipmentName);
        return true;
    }

    public void returnEquipment(StudentMidterm student) {
        if (studentEquipment.containsKey(student)) {
            for (String e : studentEquipment.get(student)) {
                availableEquipment.add(e);
            }
            studentEquipment.remove(student);
        }
    }
}