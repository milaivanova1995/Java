package factory;

import factory.country.Country;
import factory.racket.Babolat;
import factory.racket.Racket;
import factory.racket.Victor;
import factory.racket.Yonex;

public class RacketFactroy extends Factory {

	@Override
	public Country getCountry(String country) {
		return null;
	}

	@Override
	public Racket getRacket(String racket) {
		if (racket.equals("Yonex")) {
			return new Yonex();
		} else if (racket.equals("Babolat")) {
			return new Babolat();
		} else if (racket.equals("Victor")) {
			return new Victor();
		}
		return null;
	}

}
