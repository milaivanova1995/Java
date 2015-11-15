package factory;

import factory.country.Bulgaria;
import factory.country.China;
import factory.country.Country;
import factory.country.Holland;
import factory.racket.Racket;

public class CountryFactory extends Factory {

	@Override
	public Country getCountry(String country) {
		if (country.equals("Bulgaria")) {
			return new Bulgaria();
		} else if (country.equals("Holland")) {
			return new Holland();
		} else if (country.equals("China")) {
			return new China();
		}
		return null;
	}

	@Override
	public Racket getRacket(String racket) {
		return null;
	}

	
}
