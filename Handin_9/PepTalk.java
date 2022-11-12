import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* This is my ninth handin of a Peptalk generator
This was done by C.Vilen 
Due date: 07-11-2022 12:00
*/

public class PepTalk {
    public static void VowelCheck(String CheckInput) {
        boolean startWord = true;
        boolean endWord = false;
        Pattern charPattern = Pattern.compile("([a-z&&[^aeiou]]*)([aeiou])(?=([a-z&&[^aeiou]]*)([aeiou]*))", Pattern.CASE_INSENSITIVE);
        Matcher charMatch = charPattern.matcher(CheckInput);
        Pattern vowelPattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        String outputString = "";
        String vowelString = "";
        String charP = "p";

        // Peptalk generator method
        while (charMatch.find()) {
            String groupOne = charMatch.group(1);
            String groupTwo = charMatch.group(2);
            String groupThree = charMatch.group(3);
            Boolean groupFourIsEmpty = charMatch.group(4).isEmpty();
            int groupOneLength = groupOne.length();
            int groupThreeLength = groupThree.length();

            // Finder for single vowel vords
            if(startWord && groupFourIsEmpty) {
                vowelString = groupOne + groupTwo + groupThree;
                endWord = true;
            }

            // Finder for vowel start of the word
            else if (startWord) {
                vowelString = groupOne + groupTwo + groupThree.substring(0, groupThreeLength/2);
                startWord = false;
                endWord = false;
            }

            // Finder for vowel end of the word
            else if(groupFourIsEmpty) {
                vowelString = groupOne.substring(groupOneLength/2) + groupTwo + groupThree;
                startWord = true;
                endWord = true;
            } 

            // Finder for other types of vowels in words
            else {
                vowelString = groupOne.substring(groupOneLength/2) + groupTwo + groupThree.substring(0, groupThreeLength/2);
                startWord = false;
                endWord = false;
            }

            // P repeater method to found word
            Matcher vowelMatch = vowelPattern.matcher(vowelString.substring(0, 1));
            if(vowelMatch.matches()) {
                vowelString += charP + vowelString.toLowerCase();
                if(endWord) vowelString += " ";
            } else {
                vowelString += vowelString.replaceFirst("[a-zA-Z&&[^aeiouAEIOU]]*", charP);
                if(endWord) vowelString += " ";
            }

            // Creation of output string based found and repeated words
            outputString += vowelString;
        }
        // Printing of output string
        System.out.println(outputString);
    }

    // Main method for call of Peptalk generator method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String Input = sc.nextLine();
        VowelCheck(Input);
        sc.close();
    }
}