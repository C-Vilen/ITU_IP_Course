import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/* This is my fifth handin of a ProfanityFilter
This was done by C.Vilen 
Due date: 03-10-2022 12:00
*/

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> SwearWords = new ArrayList<>(Arrays.asList(sc.nextLine().toLowerCase().split(" ")));         // Creates ArrayList for SwearWords
        while (sc.hasNextLine()) {
            ArrayList<String> input = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));                       // Creates ArrayList for the input strings 
            String ChangeChars = "*&#$%*&#$%*&#$%*&#$%*&#$%*&#$%*&#$%*&#$%";                                                 // The bleeping characters 
            String SpecialChars = "[^a-z0-9 ]";                                                                              // Remover of the non-regular characters
            for (int i = 0; i < input.size(); i++) {
                String IndexInput = input.get(i).toLowerCase().replaceAll(SpecialChars, "");                    // Normalises the input string
                if (SwearWords.contains(IndexInput.replaceAll(SpecialChars, ""))) {                             // Check if any swearwords matches the input string 
                    String ReplaceString = "";                                                                              // The replacement string to fill a bleeping string
                    for (int j = 0; j < input.get(i).length(); j++) {                                                       // For loop to add the bleeping characters except special characters
                        if (input.get(i).charAt(j) == '.') {
                            ReplaceString = ReplaceString + '.';
                        } else if (input.get(i).charAt(j) == ',') {
                            ReplaceString = ReplaceString + ',';
                        } else if (input.get(i).charAt(j) == '!') {
                            ReplaceString = ReplaceString + '!';
                        } else if (input.get(i).charAt(j) == '?') {
                            ReplaceString = ReplaceString + '?';
                        } else {
                            ReplaceString = ReplaceString + ChangeChars.charAt(j);
                        }
                    }
                    input.set(i, ReplaceString);
                }
            }
            String ListString = String.join(" ", input);
            System.out.println(ListString);
            // break;
        }
        sc.close();
    }
}
