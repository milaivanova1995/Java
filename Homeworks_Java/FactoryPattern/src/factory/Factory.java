package factory;

import factory.country.Country;
import factory.racket.Racket;

public abstract class Factory {

	public abstract Country getCountry(String country);
	public abstract Racket getRacket(String racket);
}
