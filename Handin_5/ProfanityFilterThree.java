import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class ProfanityFilterThree {
    private static Set<String> swearWords;
    private static char[] bleep;
    private static Set<Character> punctuation;

    public static void main(String[] args) {
        punctuation = new HashSet<>(); 
        punctuation.add(',');
        punctuation.add('.');
        punctuation.add('?');
        punctuation.add('!');

        bleep = new char[] {'*', '&', '#', '$', '%'};

        Scanner sc = new Scanner(System.in);
        String inputFilter = sc.nextLine();
        String[] swearWordsArr = inputFilter.toLowerCase().split(" ");
        swearWords = new HashSet<>(); 
        for (String swearWord : swearWordsArr) {
            swearWords.add(swearWord);
        }

        while(sc.hasNext()){
            String inputLine = sc.nextLine();
            if(inputLine.isEmpty()) {
                System.out.println();
                continue;
            }
            String outputLine = "";
            String[] lines = inputLine.split(" ");
            for (int i = 0; i < lines.length-1; i++) {
                outputLine += build(lines[i], true);
            }
            outputLine += build(lines[lines.length-1], false);
            System.out.println(outputLine);
        }
        sc.close();
    }

    private static String build(String word, boolean space) {
        char lastChar = word.charAt(word.length()-1); 
        String wordTrimmed = word.substring(0, word.length()-1);
        if (punctuation.contains(lastChar)){ 
            return filter(wordTrimmed) + lastChar + (space ? " " : "");
        } else {
            return filter(word) + (space ? " " : "");
        }
    }

    private static String filter(String word) {
        if (swearWords.contains(word.toLowerCase())) {
            String filteredWord = "";
            for (int i = 0; i < word.length(); i++) {
                filteredWord += bleep[i % (bleep.length)];
            }
            return filteredWord;
        }
        return word;
    }
}