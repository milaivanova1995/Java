package exercise1;

import java.util.Scanner;

public class Cat {
	
	protected String name;
	protected byte years;
	
	public Cat() {
        this.name = "";
        this.years = 0;
	}
	
	public Cat(String name, byte years) {
		this();
		setName(name);
		setYears(years);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setYears(byte years) {
		this.years = years;
	}
	
	public byte getYears() {
		return years;
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");

		int n = 10;
		Cat[] array = new Cat[n];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = new Cat();
			System.out.print("Cat's name: ");
			String catName = input.nextLine();
			
			System.out.print("Cat's years: ");
			byte catYears = input.nextByte();
			input.nextLine();
			
			array[i].setName(catName);	
			array[i].setYears(catYears);
			
			array[i].Say();
			System.out.println();
		}
		
		input.close();

	}

	public void Say() {
		System.out.print("Hello! My name is " + this.name + ". I'm " + this.years + " years old cat.");
	}
}




