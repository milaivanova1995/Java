package StrategyPatternHorse;

public class CircusHorse extends Horse {
	
	public CircusHorse() {
		this.moving = new Piaffe();
	}

	public void display() {
		System.out.println("I'm a circus horse.");
	}
}
