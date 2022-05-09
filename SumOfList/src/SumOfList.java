import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();

        System.out.println("Enter a number: ");

        while(true) {
            int text = input.nextInt();
            nums.add(text); 

            int sum = 0;
             for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);

    }
    
            if(text== 0) {
                nums.remove(nums.get(nums.size()-1));
              System.out.print(nums.toString().replace("[","").replace("]","") + " were the items in the list. ");
                
                System.out.println("The sum of the list is: " + sum);
                break;
            } 
    }
}

}
