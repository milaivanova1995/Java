package exercise3;

import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;

public class DeckOfCards {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		String card = null;
		HashSet<String> deck = new HashSet<String>();
		HashMap<String, Integer> userCards = new HashMap<String, Integer>();
		
		deckOfCards(deck);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a card: ");
			card = input.nextLine();
			
			if (deck.contains(card)) {
				CountRepeatedWords(userCards, card);
			} else {
				System.out.println("Wrong input");
			}
		}
		
		Print(userCards);
		input.close();
	}

	public static void deckOfCards(HashSet<String> deck) {
		
		for (int i = 2; i <= 10; i++) {
			deck.add(Integer.toString(i));
		}
		deck.add("J");
		deck.add("Q");
		deck.add("K");
		deck.add("A");
		deck.add("j");
		deck.add("q");
		deck.add("k");
		deck.add("a");
	}
	
	public static void CountRepeatedWords(HashMap<String, Integer> userCards, String card) {
		
		if (userCards.containsKey(card)) {
			int count = userCards.get(card);
			count++;
			userCards.replace(card, count);
		}
		else {
			userCards.put(card, 1);
		}
	}
	
	public static void Print(HashMap<String, Integer> userCards) {
		
		System.out.println();
		int count = -1;
		for (Object key : userCards.keySet()) {
			if (userCards.get(key) > count) {
				count = userCards.get(key);
			}
		}
		
		if (count == 2) {
			System.out.println("Pair.");
		} else if (count == 3) {
			System.out.println("Three of a kind.");
		} else if (count == 4) {
			System.out.println("Four of a kind.");
		} else if (count == 5) {
			System.out.println("Your hand contains 5 identical cards.");
		} else {
				System.out.println("No pair. No three of a kind. No four of a kind.");
		}
		
	}
}
