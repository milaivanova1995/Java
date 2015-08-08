package Countries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Countries {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		String[] countries = null;
		String[] capitals = null;
		int n = 5;
		
		try {
			countries = readFile("Countries.txt");
		} catch (IOException e) {
			System.out.println("Error reading from file:");
			System.out.println(e.getMessage());
		}
		
		capitals = new String[n];
		
		for (int i = 0; i < countries.length; i++) {
			
			System.out.format("The capital of %s is: ", countries[i]);
			capitals[i] = input.nextLine();
		}
		
		try {
			writeFile(capitals, "Capitals.txt");
			System.out.println("Writing is done.");
		} catch (IOException e) {
			System.out.println("Error writing to file.");
			System.out.println(e.getMessage());
		}
		
		input.close();
	}
	
	

	public static String[] readFile(String fileName) throws IOException {
		
		int n = 5;
		int i = 0;
		
		String[] text = new String[n];
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while (bufferedReader.ready()) {
			text[i] = bufferedReader.readLine();
			i++;
		}
		
		bufferedReader.close();
		fileReader.close();
		return text;
	}
	
	
	
	public static void writeFile(String[] capitals, String fileName) throws IOException {
		
		FileWriter fileWriter = new FileWriter(fileName);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		for (int i = 0; i < capitals.length; i++) {
			bufferedWriter.write(capitals[i]);
			bufferedWriter.newLine();
		}
		
		bufferedWriter.close();
		fileWriter.close();
	}

}


