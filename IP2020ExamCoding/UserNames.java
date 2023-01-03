import java.util.ArrayList;
import java.util.List;

public class UserNames {

    public String usernameToEmail(String userName) {
        userName = userName.toLowerCase();
        if ( !userName.endsWith("@itu.dk")) {
            userName = userName + "@itu.dk";
        }
        return userName;
    }

    List<String> usernameListToEmails(List<String> usernames){
        List<String> convertedList = new ArrayList<>();
        for (int i = 0; i < usernames.size(); i++) {
            convertedList.add(usernameToEmail(usernames.get(i)));
        }
        return convertedList;
    }
}
