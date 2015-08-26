package exercise3;

public class Test {

	public static void main(String[] args) {
		 Thread1 t1 = new Thread1();
		 Thread2 t2 = new Thread2();
		 t1.start();
		 t2.start();

//		Thread1 t1 = new Thread1();
//		new Thread1() {
//			public void run() {
//				t1.message();
//			}
//		}.start();
//
//		Thread2 t2 = new Thread2();
//		new Thread2() {
//			public void run() {
//				t2.numbers();
//			}
//		}.start();

	}

}
