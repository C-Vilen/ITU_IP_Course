/* This is my fourth handin of a song generator
This was done by C.Vilen 
Due date: 26-09-2022 12:00
*/
public class SongGenerator {
    private int N;
    private String text;
    
    public SongGenerator(int N, String text) {
        // Creating my two variable inputs from the scanner
        this.N = N;
        this.text = text;
    }

    public void songPrint(){
        // Splitting the text variable into seperate variables to make the words singular
        String[] splitter = text.split(" ");
        String containers = splitter[1];
        String container = containers.substring(0, containers.length() - 1);
        String of = splitter[2];
        String drink = splitter[3];

        // Main logic to generater the song in a for loop with 4 different if statements to change the lyric depending on a input variables
        for (int i = 0; i < N; i++) {
            if (i == 0 && N > 2) {
                System.out.println(N + text + " on the wall" + "\n" + N + text + "\n" + "Take one down, pass it around" + "\n" + (N-1) + text + " on the wall" + "\n");
            } else if (N-i > 1 && (N-(i+1)) > 1) {
                System.out.println((N-i) + text + " on the wall" + "\n" + (N-i) + text + "\n" + "Take one down, pass it around" + "\n" + (N-(i+1)) + text + " on the wall" + "\n");
            } else if (N-i > 1 && (N-(i+1)) == 1){
                System.out.println((N-i) + text + " on the wall" + "\n" + (N-i) + text + "\n" + "Take one down, pass it around" + "\n" + "One " + container + " " + of + " " + drink + " on the wall" + "\n");
            } else {
                System.out.println("One " + container + " " + of + " " + drink + " on the wall" + "\n" + "One " + container + " " + of + " " + drink + "\n" + "Take one down, pass it around" + "\n" + "No more " + containers + " " + of + " " + drink + " on the wall" + "\n");
            }
        }
    }
}
