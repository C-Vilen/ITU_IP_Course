import java.util.HashSet;
import java.util.List;
import java.util.Set;

    /* This is my Introductory Programming exam handin 05/01/2023
    This was done by Christian Vilen - 0410961911 
    */

public class AdvancedProjectBase extends ProjectBase{

    // 4. Implement a class called AdvancedProjectBase that extends the ProjectBase class
    public AdvancedProjectBase(List<String> projectTitles) {
        super(projectTitles);
    }

    // 5. In AdvancedProjectBase, implement a method search(String query) in which if query contains commas (","), it is split on these commas. 
    // For example, the query “q1,q2,q3” is split into three sub-queries “q1”, “q2”, and “q3”. 
    // The method returns a set of titles (Set<String>) which contain at least one of the sub-queries 
    // (In the above example, titles that contain at least one of “q1”, “q2” or “q3”.)
    public Set<String> search(String query){
        Set<String> output = new HashSet<>();
        String[] parts = query.split(",");
        for (String part : parts) {
            output.addAll(super.search(part));
        }
        return output;
    }
}
