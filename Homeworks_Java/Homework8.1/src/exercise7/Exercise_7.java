package exercise7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Exercise_7 {

	public static void main(String[] args) {
		
		String[] text = null;
		String fileName = null;
		
		System.out.println("Choose a file to read from:");
		fileName = openFile();
		
		try {
			text = readFile(fileName);
		} catch (IOException e) {
			System.out.println("Error reading from file:");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Choose the first file to save the odd lines:");
		fileName = saveFile();
		
		try {
			writeFileOdd(text, fileName);
		} catch (IOException e) {
			System.out.println("Error writing to file.");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Choose the second file to save even lines:");
		fileName = saveFile();
		
		try {
			writeFileEven(text, fileName);
		} catch (IOException e) {
			System.out.println("Error writing to file.");
			System.out.println(e.getMessage());
		}
	}

	
	public static String openFile() {
		
		JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
		fc.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
		int retValue = fc.showOpenDialog(fc);
		
		if (retValue == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			return file.getName();
		} else {
			return null;
		}
	}
	
	public static String saveFile() {
		
		JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
		fc.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
		int retValue = fc.showSaveDialog(fc);
		
		if (retValue == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			if (file.getName().endsWith(".txt")) {
				return file.getName();
			} else {
				return file.getName() + ".txt";
			}
		} else {
			return null;
		}
	}
	
	public static String[] readFile(String fileName) throws IOException {
		
		String[] text = null;
		FileReader file = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(file);
		int length = 0, i = 0;
		
		while (reader.readLine() != null) {
			length++;
		}
		
		reader.close();
		file.close();
		file = new FileReader(fileName);
		reader = new BufferedReader(file);
		
		text = new String[length];
		
		while (reader.ready()) {
			text[i] = reader.readLine();
			i++;
		}
		
		reader.close();
		file.close();
		return text;
	}
	
	public static void writeFileOdd(String[] text, String fileName) throws IOException {
		
		FileWriter file = new FileWriter(fileName);
		BufferedWriter writer = new BufferedWriter(file);
		
		writer.write("Odd lines:");
		writer.newLine();
		
		for (int i = 0; i < text.length; i++) {
			if (i % 2 == 0) {
				writer.write(text[i]);
				writer.newLine();
			}
		}
		System.out.println("Writing is done.");
		
		writer.close();
		file.close();
	}
	
	public static void writeFileEven(String[] text, String fileName) throws IOException {
		
		FileWriter file = new FileWriter(fileName);
		BufferedWriter writer = new BufferedWriter(file);
		
		writer.write("Even lines:");
		writer.newLine();
		
		for (int i = 0; i < text.length; i++) {
			if (i % 2 != 0) {
				writer.write(text[i]);
				writer.newLine();
			}
		}
		
		System.out.println("Writing is done.");
		writer.close();
		file.close();
	}
	
}
