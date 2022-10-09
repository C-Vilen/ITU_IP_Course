/* This is my fourth handin of a song generator
This was done by C.Vilen 
Due date: 26-09-2022 12:00
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Storing the inputs into two different variables
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String text = sc.nextLine();
        sc.close();
        SongGenerator SG = new SongGenerator(N, text);
        SG.songPrint();
    }
}
