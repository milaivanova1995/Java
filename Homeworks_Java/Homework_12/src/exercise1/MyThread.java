package exercise1;

import java.util.Random;

public class MyThread extends Thread {

	public MyThread() {
		super();
	}
	
	public MyThread(String name) {
		setName(name);
	}

	public void run() {
		System.out.println("The thread is started.");
		Random rand = new Random();
		long time = (long)(rand.nextInt(10) + 1);
		System.out.println("The name of the thread is: " + this.getName());
		
		try {
			Thread.sleep(1000 * time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The thread completed!");
	}

}
