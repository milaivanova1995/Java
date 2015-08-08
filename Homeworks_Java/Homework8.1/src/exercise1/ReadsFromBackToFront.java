package exercise1;
import java.util.Scanner;

public class ReadsFromBackToFront {

	  public static void main(String[] args) {
		  
		  Scanner input = new Scanner(System.in, "UTF-8");
			
			System.out.print("Enter a word or a sentense: ");
			String word = input.nextLine();
	        String sentense = new String(reverseWord(word));
	        System.out.print("The reverse word/sentense is: " + sentense);
	        
	        input.close();
	    }

	    public static String reverseWord(String sentense) {
	    	
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i = sentense.length() - 1; i >= 0; i--) {
	            sb.append(sentense.charAt(i));
	        }
	        return sb.toString();
	    }

}
