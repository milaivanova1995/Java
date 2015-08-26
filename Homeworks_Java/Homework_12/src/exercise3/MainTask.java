package exercise3;

public class MainTask extends Thread {

	synchronized void message() {
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

	synchronized void numbers() {
		for (int i = 1; i <= 50000; i++) {
			System.out.println(i);
			if (i == 25000) {
				try {
					wait();
				} catch (Exception e) {
				}
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]) {
		MainTask t = new MainTask();
		new MainTask() {
			public void run() {
				t.numbers();
			}
		}.start();

		new MainTask() {
			public void run() {
				t.message();
			}
		}.start();
	}

}
