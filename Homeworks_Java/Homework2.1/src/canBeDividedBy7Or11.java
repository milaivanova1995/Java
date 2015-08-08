public class canBeDividedBy7Or11 {

	public static void main(String[] args) {
		
		for (int counter = 1; counter <= 100; counter ++) {
			if ((counter % 7 == 0) || (counter % 11 == 0)) {	
				System.out.format("Number: %d\n", counter);	
			}	
		}

	}

}
