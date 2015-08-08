import java.util.Scanner;

public class printsMinMax {

	public static void main(String[] args) {

		  Scanner input = new Scanner(System.in, "UTF-8");
          String line;
          int min = 0, max = 0, temp = 0;
         
          System.out.print("Enter your numbers on one row by using space between them: ");
          line = input.nextLine();
          input = new Scanner(line);
          min = input.nextInt();
          max = min;
         
          while (input.hasNextInt()) {
        	  temp = input.nextInt();
        	  
        	  if (temp > max) {
        		  max = temp;
              }
              if (temp < min) {
                  min = temp;
                  }
                 
          }
         
          System.out.print("\nMax: " + max + "\nMin: " + min);
          input.close();
          
	}
}
