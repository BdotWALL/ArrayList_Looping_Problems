import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<String> ();
        System.out.println("Enter a word");
        while(true) {
        String text = input.nextLine();
        stringList.add(text); 


        if(text.isEmpty() || text == null && stringList.size()  > 4 ) {
            System.out.println("The fifth item in the list is: " + stringList.get(4));
            break;
        } 
        }

    }
}
