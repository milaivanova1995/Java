
public class canBeDividedBy7Or11Version3 {

	public static void main(String[] args) {
		
		int counter = 1;
		
		 while (counter <= 100) {
			 if ((counter % 7 == 0) || (counter % 11 == 0)) {	
					System.out.format("Number: %d\n", counter);	
					}
				counter++;
		 }
		
	

	}

}
