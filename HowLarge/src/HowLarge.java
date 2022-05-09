import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);
            ArrayList<String> stringList = new ArrayList<String> ();
            System.out.println("Enter a word");
            while(true) {
            String text = input.nextLine();
            stringList.add(text); 
    
    
            if(text.isEmpty()) {
                System.out.println("The total amount of items in the list was: " + (stringList.size()-1));
                break;
            } 
            }
    
        }
    }
    