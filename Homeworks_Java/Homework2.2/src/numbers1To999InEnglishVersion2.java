import java.util.Scanner;

public class numbers1To999InEnglishVersion2 {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in, "UTF-8");
          System.out.print("Enter a number between 0-999 and the program will convert it to english words: ");
          int number = input.nextInt();
          int firstDigit = number / 100;
          int secondDigit = number / 10 % 10;
          int thirdDigit = number % 10;

          if (number >= 100 && number != 1000) {
        	  
        	  
                  switch (firstDigit) {
                  
                  case 1: System.out.print("one hundred "); 
                  	break;
                  case 2: System.out.print("two hundred "); 
                  	break;
                  case 3: System.out.print("three hundred "); 
                  	break;
                  case 4: System.out.print("four hundred "); 
                  	break;
                  case 5: System.out.print("five hundred "); 
                  	break;
                  case 6: System.out.print("sixt hundred "); 
                  	break;
                  case 7: System.out.print("seven hundred "); 
                  	break;
                  case 8: System.out.print("eight hundred "); 
                  	break;
                  case 9: System.out.print("nine hundred "); 
                  	break;
                  }

                  if (firstDigit >= 1 && secondDigit == 1) {
                          System.out.print("and ");
                          
                          switch (thirdDigit) {
                          
                          case 0: System.out.print("ten"); 
                          	break;
                          case 1: System.out.print("eleven"); 
                          	break;
                          case 2: System.out.print("twelve"); 
                          	break;
                          case 3: System.out.print("thirteen"); 
                          	break;
                          case 4: System.out.print("fourteen"); 
                          	break;
                          case 5: System.out.print("fifteen"); 
                          	break;
                          case 6: System.out.print("sixteen"); 
                          	break;
                          case 7: System.out.print("seventeen"); 
                          	break;
                          case 8: System.out.print("eighteen"); 
                          	break;
                          case 9: System.out.print("nineteen"); 
                          	break;
                          }
                          
                  } else if (firstDigit >= 1 && secondDigit > 1) {
                  	System.out.print("and ");
                 
                          switch (secondDigit) {
                           
                          case 2: System.out.print("twenty");     
                          	break;
                          case 3: System.out.print("thrirty");
                          	break;
                          case 4: System.out.print("fourty");     
                          	break;
                          case 5: System.out.print("fifty");
                          	break;
                          case 6: System.out.print("sixty");
                          	break;
                          case 7: System.out.print("seventy");
                          	break;
                          case 8: System.out.print("eighty");     
                          	break;
                          case 9: System.out.print("ninety");
                          break;
                          }
                  }
                  
                  if (firstDigit >= 1 && secondDigit >= 2) {
                          System.out.print("-");
                          
                          switch (thirdDigit) {
                          
                          case 1: System.out.print("one");
                          	break;
                          case 2: System.out.print("two");
                          	break;
                          case 3: System.out.print("three");
                          	break;
                          case 4: System.out.print("four ");
                          	break;
                          case 5: System.out.print("five ");
                          	break;
                          case 6: System.out.print("six ");
                          	break;
                          case 7: System.out.print("seven ");
                          	break;
                          case 8: System.out.print("eight ");
                          	break;
                          case 9: System.out.print("nine ");
                          	break;
                         
                          }
                  } else if (firstDigit >= 1 && secondDigit == 0) {
                          System.out.print(" and ");

                          switch (thirdDigit) {
                          
                          case 1: System.out.print("one");
                          	break;
                          case 2: System.out.print("two");
                          	break;
                          case 3: System.out.print("three");
                          	break;
                          case 4: System.out.print("four ");
                          	break;
                          case 5: System.out.print("five ");
                          	break;
                          case 6: System.out.print("six ");
                          	break;
                          case 7: System.out.print("seven ");
                          	break;
                          case 8: System.out.print("eight");
                          	break;
                          case 9: System.out.print("nine ");
                          	break;
                          }
                  }

          } else if (number < 100 && number >= 10) {
                  if (secondDigit == 1) {
                	  
                          switch (thirdDigit) {
                          
                          case 0: System.out.print("ten");
                          	break;
                          case 1: System.out.print("eleven");
                          	break;
                          case 2: System.out.print("twelve");
                          	break;
                          case 3: System.out.print("thirteen");
                          	break;
                          case 4: System.out.print("fourteen");
                          	break;
                          case 5: System.out.print("fifteen");
                          	break;
                          case 6: System.out.print("sixteen");
                          	break;
                          case 7: System.out.print("seventeen");
                          	break;
                          case 8: System.out.print("eighteen");
                          	break;
                          case 9: System.out.print("nineteen");
                          	break;
                          }
                  } else if (secondDigit > 1) {
                	  
                          switch (secondDigit) {
                          
                          case 2: System.out.print("twenty");
                          	break;
                          case 3: System.out.print("thrirty");
                          	break;
                          case 4: System.out.print("fourty");
                          	break;
                          case 5: System.out.print("fifty");	
                          	break;
                          case 6: System.out.print("sixty");
                          	break;
                          case 7: System.out.print("seventy");
                          	break;
                          case 8: System.out.print("eighty");
                          	break;
                          case 9: System.out.print("ninety");
                          	break;
                          }
                  }
                  
                  if (secondDigit >= 2) {
                          System.out.print("-");
                          
                          switch (thirdDigit) {
                          
                          case 1: System.out.print("one");
                          	break;
                          case 2: System.out.print("two");
                          	break;
                          case 3: System.out.print("three");
                          	break;
                          case 4: System.out.print("four ");
                          	break;
                          case 5: System.out.print("five ");
                          	break;
                          case 6: System.out.print("six ");
                          	break;
                          case 7: System.out.print("seven ");
                          	break;
                          case 8: System.out.print("eight ");
                          	break;
                          case 9: System.out.print("nine ");
                          	break;
                         
                          }
                  } 
          } else if (number <= 9 && number >= 0) {
                  switch (thirdDigit) {
                  case 0: System.out.print("zero");
                  	break;
                  case 1: System.out.print("one");
                  	break;
                  case 2: System.out.print("two");
                  	break;
                  case 3: System.out.print("three");
                  	break;
                  case 4: System.out.print("four ");
                  	break;
                  case 5: System.out.print("five ");
                  	break;
                  case 6: System.out.print("six ");
                  	break;
                  case 7: System.out.print("seven ");
                  	break;
                  case 8: System.out.print("eight ");
                  	break;
                  case 9: System.out.print("nine ");	
                  	break;
                 
                  }
          }
          input.close();
	}

}
