import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter a number: ");
        while(true) {
            int text = input.nextInt();
            numbers.add(text); 
    
    
            if(text== 0) {
                System.out.println("You're done adding integers to the list");
                System.out.println("What number are you lookng for?");
                int text2 = input.nextInt();
                System.out.println(text2 + " is at index " + numbers.indexOf(text2));

                break;
            } 
    }
}
}
