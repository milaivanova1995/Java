package exercise3;

public class Thread2 extends Thread {
	
	public synchronized void run() {
	//public synchronized void numbers() {
		for (int i = 0; i <= 50000; i++) {
			if (i == 25000) {
				try {
					wait();
				} catch (Exception e) {}
			} 
			System.out.println(i);
		}
	}

}
