package factory;

public class FactoryProducer {

	public static Factory getFactory(String choice) {
		if (choice.equals("Country")) {
			return new CountryFactory();
		} else if (choice.equals("Racket")) {
			return new RacketFactroy();
		}
		return null;
	}
}
