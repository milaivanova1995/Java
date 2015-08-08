import java.util.Scanner;

public class factorialExerciseDivisionNK {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in, "UTF-8");
          System.out.println("Enter two positive numbers N and K (N > K).");
          System.out.print("Enter N: ");
          int n = input.nextInt();
          System.out.print("Enter K: ");
          int k = input.nextInt();
          long factorialN = 1;
          long factorialK = 1;
          
          if (1 < k && k < n) {
        	  for (int i = 1; i <= n; i++) {
                  factorialN = factorialN * i;
                 
        	  }
          
        	  for (int j = 1; j <= k; j++) {
                  factorialK = factorialK * j;
                  
        	  }
        	  System.out.println("N! = " + factorialN);
        	  System.out.println("K! = " + factorialK);
        	  System.out.println("N!/K! is: " + factorialN / factorialK);
          } else {
          System.out.println("Numbers are negative or N <= K");
          }
          input.close();    

	}

}
