package StrategyPatternHorse;

public class Main {

	public static void main(String[] args) {
		Horse bulgarianHorse = new BulgarianHorse();
		bulgarianHorse.moving();
		bulgarianHorse.display();
		
		Horse circusHorse = new CircusHorse();
		circusHorse.moving();
		circusHorse.setMoving(new Trot());
		circusHorse.moving();
		circusHorse.display();

	}

}
