import java.util.Scanner;

public class multipyFactorialsNKThenDivideThem {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in, "UTF-8");
         System.out.println("Enter two numbers N and K.");
         System.out.print("Enter N: ");
         int n = input.nextInt();
         System.out.print("Enter K: ");
         int k = input.nextInt();
         long factorialN = 1;
         long factorialK = 1;
         long factorialNK = 1;
         
       	  for (int i = 1; i <= n; i++) {
                 factorialN = factorialN * i;
                
       	  }
         
       	  for (int j = 1; j <= k; j++) {
                 factorialK = factorialK * j;
                 
       	  }
       	  int nMinusK = n - k;
       	  for (int m = 1; m <= nMinusK; m++) {
       		  factorialNK = factorialNK * m;
       	  }
       	  
       	  System.out.println("N! = " + factorialN);
       	  System.out.println("K! = " + factorialK);
       	  System.out.println("N-K = " + nMinusK);
       	  System.out.println("(N-K)! = " + factorialNK);
       	  System.out.println("(N!*K!)/(N-K)! is: " + (factorialN * factorialK) / (factorialNK));
         
         input.close();    

	}

}
