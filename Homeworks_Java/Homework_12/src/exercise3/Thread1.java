package exercise3;

public class Thread1 extends Thread {
	
	public synchronized void run() {
	//public synchronized void message() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Running...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			
		}
		notify();
	}

}
