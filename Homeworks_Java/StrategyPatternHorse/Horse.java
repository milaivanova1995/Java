package StrategyPatternHorse;

public abstract class Horse {
	Movable moving;
	
	public Horse() {}
	
	public void moving() {
		moving.move();
	}

	public void setMoving(Movable moving) {
		this.moving = moving;
	}
	
	public abstract void display();

}
