import java.util.Scanner;

public class permutationVersion3 {

	
	    public static void main(String[] args) {
	    	
	    	Scanner input = new Scanner(System.in, "UTF-8");
	    	System.out.print("Enter what you want to permute: ");
	    	String n = input.nextLine();
	        permutation("", n);
	        input.close();
	    }
	    
	    private static void permutation(String prefix, String str) {
	        int n = str.length();
	        if (n == 0) 
	            System.out.println(prefix);
	        else {
	            for (int i = 0; i < n; i++) {
	                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
	            }
	        }
	    }
}
