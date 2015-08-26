package exercise2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import exercise1.MyThread;

public class Test {

	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(7);
		
		for (int i = 1; i <= 5; i++) {
			MyThread worker = new MyThread("Thread " + i);
			pool.execute(worker);
		}
		
		pool.shutdown();
		while (!pool.isTerminated()) {}
		System.out.println("Finished all threads.");
		
	}

}
