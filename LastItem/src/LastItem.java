import java.util.Scanner;
import java.util. ArrayList;

public class LastItem {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
            ArrayList<String> stringList = new ArrayList<String>();
            System.out.println("Enter a word");
            while(true) {
            String text = input.nextLine();
            stringList.add(text); 
    
    
            if(text.isEmpty() || text == null) {
                System.out.println("The last item in the list is: " + stringList.get((stringList.size()-2)));
                break;
            } 
            }
    }
}
