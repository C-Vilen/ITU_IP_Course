import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

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
        System.out.println("\nsubstring test : " + x.substring(4,11).substring(4, 7));

        //Print number string
        System.out.println(a=0%3);

        // Incrementers
        int y = 5;
        System.out.println("\nIncrementer test : " + (y++) + " " + (++y));

        System.out.println("test int : " +(2147483647+1));

        // Removal of index and specific element
        List<Integer> list = new ArrayList<>();
        for(int p=1;p<20;p++){
            if (p % 3==0){
                list.add(p); 
            }
        }
        System.out.println("This is a list: " + list);
        Collection<Integer> col = list;
        System.out.println("This is a col: " + col);
        list.remove(3);
        System.out.println("This is a list: " + list);
        System.out.println("This is a col: " + col);
        col.remove(3);
        System.out.println("This is a list: " + list);
        System.out.println("This is a col: " + col);


        // Iterator
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
        Integer integer = it.next();
        if(integer < 10) {
            it.remove();
        }
        }
        System.out.println(numbers);
    }
}
