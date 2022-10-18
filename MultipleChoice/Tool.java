public class Tool {
    public static void main(String[] args) {
        System.out.println("\n");
        // Tenary operator test
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println("\nquestion 1 : " + ((a>b) && !(b<c)));
        System.out.println("Answer a: " + ((a>b) ? !(b<c): true));
        System.out.println("Answer b : " + (!(b<c) ? (a<b) : true));
        System.out.println("Answer c : " + ((a>b) ? !(b<c): false));
        System.out.println("Answer d : " + ((b<c) ? (a<b) : false));

         // Tenary operator test
         int i = 2;
         System.out.println("\nquestion 2 : " + (i % 15 == 0));
         System.out.println("Answer a: " + (i % 5 == 0 ? false : i % 3 == 0));
         System.out.println("Answer b : " + (i % 15 == 0 ? false : true));
         System.out.println("Answer c : " + (i % 5 == 0 ? i % 3 == 0 : false));
         System.out.println("Answer d : " + (i % 3 == 0 ? i % 5 == 0 : true));

        // Substring method
        String x = "orange,apple,banana";
        System.out.println("\nsubstring test : " + x.substring(1,9).substring(1, 3));

        //Print number string
        int j = 4;
        System.out.println("\nNumber string test : " +"1"+j+1+"2");

        // Incrementers
        int y = 5;
        System.out.println("\nIncrementer test : " + (y++) + " " + (++y));
    }
}
