import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

    /* This is my Introductory Programming exam handin 05/01/2023
    This was done by Christian Vilen 
    */

public class ProjectBase {
    // 1. Define a class called ProjectBase which has a private field called projectTitles of type List<String>. 
    // In the constructor of the class, initialise projectTitles with the constructor parameter.
    private List<String> projectTitles;
    
    public ProjectBase(List<String> projectTitles){
        projectTitles = new ArrayList<>(projectTitles);
    }

    // 2. In ProjectBase, implement a method addTitle(String t) which adds the project title t to the projectTitles.
    public void addTitle(String t){
        projectTitles.add(t);
    }

    // 3. In ProjectBase, implement a method search(String query) which returns a set of titles (Set<String>) from projectTitles that contain query, 
    // meaning that query is a substring of each title in the returned set.
    // Hint: s1.contains(s2) returns true if s2 is a substring of s1 and false otherwise. 
    public Set<String> search(String query){
        Set<String> output = new HashSet<>();
        for (String string : projectTitles) {
            if(string.contains(query)){
                output.add(string);
            }
        }
        return output;
    }
}
