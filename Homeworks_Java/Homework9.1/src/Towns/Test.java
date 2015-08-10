package Towns;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {

		HashSet<Town> town = new HashSet<Town>();

		for (int i = 0; i < 5; i++) {
			Town t = new Town("Town " + Integer.toString(i), "Country", 256 * i + 1000 * i * i + 6000);
			town.add(t);
		}
		
		Town varna = new Town("Varna", "Bulgaria", 330000);
		town.add(varna);
		System.out.println(town.toString());
		System.out.println("Contains \"Varna\": " + town.contains(varna));
		town.remove(varna);
		System.out.println("Contains \"Varna\": " + town.contains(varna));
	}
	
}

