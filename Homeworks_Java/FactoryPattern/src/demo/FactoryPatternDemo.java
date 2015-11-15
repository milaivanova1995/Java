package demo;

import factory.Factory;
import factory.FactoryProducer;
import factory.country.Country;
import factory.racket.Racket;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		Factory countryFactory = FactoryProducer.getFactory("Country");
		Factory racketFactory = FactoryProducer.getFactory("Racket");
		
		Country country1 = countryFactory.getCountry("Bulgaria");
		country1.tellCountry();
		Racket racket1 = racketFactory.getRacket("Babolat");
		racket1.takeRacket();
		
		Country country2 = countryFactory.getCountry("Holland");
		country2.tellCountry();
		Racket racket2 = racketFactory.getRacket("Victor");
		racket2.takeRacket();
		
		Country country3 = countryFactory.getCountry("China");
		country3.tellCountry();
		Racket racket3 = racketFactory.getRacket("Yonex");
		racket3.takeRacket();

	}

}
