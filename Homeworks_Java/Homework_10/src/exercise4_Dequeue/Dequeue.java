package exercise4_Dequeue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Dequeue {

	public static void main(String[] args) {
		  
		Deque<String> dequeue = new LinkedList<String>();
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter how many names would you like to add: ");
		int count = input.nextInt();
		input.nextLine();
		String names = null;
		
		if (count == 0) {
			System.out.print("Strng is empty.\n");
		}

		for (int i = 0; i < count / 2; i++) {
			System.out.format("Enter the %d name which will be added to the head: ", i + 1);
			names = input.nextLine();
			dequeue.push(names);
		}
	
		for (int i = count / 2; i < count; i++) {
			System.out.format("Enter the %d name which will be added to the tail: ", i + 1);
			names = input.nextLine();
			dequeue.add(names);
		}
		
		System.out.println("The dequeue is: " + dequeue + "\n");

		System.out.format("First - removing elements from the head.");
		for (int i = 0; i < (count / 2) - 1; i++) {
			dequeue.removeFirst();
		}
		
		System.out.println("\nSecond - removing elements from the tail.");
		for (int i = count / 2; i < count - 1; i++) {
			dequeue.removeLast();
		}
		
		System.out.println("\nThe dequeue after removing is: " + dequeue + "\n");
		
		input.close();
	}

}


