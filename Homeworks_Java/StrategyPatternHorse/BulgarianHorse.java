package StrategyPatternHorse;

public class BulgarianHorse extends Horse {
	
	public BulgarianHorse() {
		this.moving = new Gallop();
	}
	
	public void display() {
		System.out.println("I'm a bulgarian horse.");
	}

}
