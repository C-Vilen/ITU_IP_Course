import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* This is my ninth handin of a ProfanityFilter
This was done by C.Vilen 
Due date: 07-11-2022 12:00
*/

// PLEASE BE AWARE THAT IT DOES NOT WORK AS INTENDED

public class PepTalk {
    public static void VowelCheck(String CheckInput) {
        String CharP = "p";
        int MatchEnd = 0;
        Pattern pattern = Pattern.compile("[^aeiou]?[aeiou]((ng|[^aeiou])(?![aeiou]))?", Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(CheckInput);
        while (match.find()) {
            char FirstChar = match.group().charAt(0);
            if(FirstChar == 'a' || FirstChar == 'i' || FirstChar == 'o' || FirstChar == 'e' || FirstChar == 'u' ) {
                System.out.print(CheckInput.substring(MatchEnd, match.end()).trim() + CharP + CheckInput.substring(match.start(), match.end()).trim());
            } else {
                System.out.print(CheckInput.substring(MatchEnd, match.end()).trim() + CharP + CheckInput.substring(match.start(), match.end()).substring(1).trim());
            }
            MatchEnd = match.end();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String Input = sc.nextLine();
        String[] SplitInput = Input.split(" ");
        for (String Word : SplitInput) {
            VowelCheck(Word);
            System.out.print(" ");
        }
        sc.close();
    }
}