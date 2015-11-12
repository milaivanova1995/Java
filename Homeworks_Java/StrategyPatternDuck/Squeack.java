package StrategyPatternDuck;

public class Squeack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak.");
		
	}

}
