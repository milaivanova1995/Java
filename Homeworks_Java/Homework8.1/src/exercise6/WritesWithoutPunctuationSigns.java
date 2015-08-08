package exercise6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritesWithoutPunctuationSigns {

	public static void main(String[] args) {
		
		StringBuilder text = null;
		String[] words = null;

		System.out.println("Reading from \"read.txt\" file:");
		
		try {
			text = readFile("read.txt");
		} catch (IOException e) {
			System.out.println("Error reading from file:");
			System.out.println(e.getMessage());
		}
		
		words = text.toString().replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		System.out.println("Writing to \"write.txt\" file.");
		try {
			writeFile(words, "write.txt");
		} catch (IOException e) {
			System.out.println("Error writing to file.");
			System.out.println(e.getMessage());
		}

	}
	
	public static StringBuilder readFile(String fileName) throws IOException {
		
			StringBuilder text = new StringBuilder();
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					text.append(bufferedReader.readLine());
					System.out.println(text);
			}
			
			bufferedReader.close();
			fileReader.close();
			return text;
	}
	
	public static void writeFile(String[] text, String fileName) throws IOException {
			
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			for (int i = 0; i < text.length; i++) {
				bufferedWriter.write(text[i]);
				System.out.println(text[i]);
			}
		
			System.out.println("Writing is done.");
			
			bufferedWriter.close();
			fileWriter.close();
	}
	
	
}

