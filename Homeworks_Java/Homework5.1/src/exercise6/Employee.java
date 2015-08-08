package exercise6;

public class Employee {

	protected short hoursPerMonth;
	protected float salary;
	
	public Employee() {
		
		this.hoursPerMonth = 0;
		this.salary = 0;
	}
	
	public Employee(short hoursPerMonth, float salary) {
		this();
		this.hoursPerMonth = hoursPerMonth;
		this.salary = salary;
	}

	public short getHoursPerMonth() {
		return hoursPerMonth;
	}

	public void setHoursPerMonth(short hoursPerMonth) {
		this.hoursPerMonth = hoursPerMonth;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee info = new Employee();

		info.infoDoctor();
		info.infoPoliceman();
		
		
	}
	

	public void infoDoctor() {
		
		Doctor doctor = new Doctor((short)500, (float) 20000.0, (short)15, (short)16);
		System.out.println("Doctor: I work " + doctor.hoursPerMonth + " hours per month.\n" + "My salary is: " + doctor.salary 
				+ "\nI have " + doctor.dayShifts + " day shifts and " + doctor.nightShifts + " night shifts.");
	}
	

	public void infoPoliceman() {
		
		Policeman policeman = new Policeman((short)400, (float) 3500.0, "commissar");
		System.out.println("Policeman: I work " + policeman.hoursPerMonth + " hours per month.\n" + "My salary is: " + policeman.salary 
				+ "\nMy rang is: " + policeman.rang);
	}
}
