package exercise6;

public class Doctor extends Employee {
	
	protected short dayShifts;
	protected short nightShifts;

	public Doctor() {
		
		super();
		this.dayShifts = 0;
		this.nightShifts = 0;
	}
	
	public Doctor(short hoursPerMonth, float salary, short dayShifts, short nightShifts) {
		
		super(hoursPerMonth, salary);
		this.dayShifts = dayShifts;
		this.nightShifts = nightShifts;
	}

	public short getDayShifts() {
		return dayShifts;
	}

	public void setDayShifts(short dayShifts) {
		this.dayShifts = dayShifts;
	}

	public short getNightShifts() {
		return nightShifts;
	}

	public void setNightShifts(short nightShifts) {
		this.nightShifts = nightShifts;
	}
	

	
	
	
	
}
