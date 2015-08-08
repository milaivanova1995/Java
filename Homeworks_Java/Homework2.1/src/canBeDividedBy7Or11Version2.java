
public class canBeDividedBy7Or11Version2 {

	public static void main(String[] args) {
		
		int counter = 1;
		
		do {
		
			if ((counter % 7 == 0) || (counter % 11 == 0)) {	
				System.out.format("Number: %d\n", counter);	
				}
			counter++;
			} while (counter <= 100);
		

	}

}
