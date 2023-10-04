import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ProfanityFilterTwo {

    /**
     * Check if given string contains a punctuation mark from a custom list of characters
     * 
     * @param word the string to check
     * @return true if the string contains a punctuation mark, false otherwise
     */
    public static boolean hasPunctuationMark(String word){
        boolean hasPunctuationMark = false;
        char[] punctuationMark = {',', '.', '!', '?'};

        for (char c : punctuationMark){
            if (word.length() > 1 && word.charAt(word.length()-1) == c) {
                hasPunctuationMark = true;
                break;
            }
        }
        return  hasPunctuationMark;
    }

    /**
     * Check if given string contains a punctuation mark from regex list of characteres
     * @param word the string to check
     * @return true if teh string contains a punctuation mark, false otherwise
     */
    public static boolean hasPunctuationMarkRegex(String word){
        boolean hasPunctuationMark = false;
        String regex = "\\w\\p{Punct}{1}+";
        // Straight forward pattern matching
        if (Pattern.matches(regex, word)){
            hasPunctuationMark = true;
        }
        return  hasPunctuationMark;
    }

    /**
     * Censor the given word(string), using a "bad word" blacklist
     * 
     * @param word the word to censor
     * @param badWords blacklist
     * @return a string with the censored word
     */
    public static String censorWord(String word, String[] badWords){
        String censored = word;
        String filter = "*&#$%";
        List<String> swearWords = Arrays.asList(badWords);

        if (hasPunctuationMark(word)){
            censored = censorWord(word.substring(0, word.length()-1), badWords);
            censored += word.charAt(word.length()-1);
        }
        else{
            boolean found = false;
            for (String swearWord : swearWords){
                if (swearWord.equalsIgnoreCase(word))
                    found = true;
            }
            if (found){
                censored = "";
                if (word.length() >= filter.length()){
                    int nBlocks = word.length() / filter.length();
                    int nResidual = word.length() % filter.length();
                    for (int i = 0; i < nBlocks; i++) censored = censored + filter;
                    censored = censored + filter.substring(0, nResidual);
                } else {
                    censored = censored + filter.substring(0, word.length());
                }
            }
        }
        return censored;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String swearWords = input.nextLine();
        while (input.hasNext()){
            String [] words = input.nextLine().split(" ");
            for (int i = 0; i < words.length; i++){
                words[i] = censorWord(words[i], swearWords.split(" "));
            }
            String censoredSentence = String.join(" ", words);
            System.out.println(censoredSentence);
        }

        input.close();
    }
}