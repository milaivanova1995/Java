
public class Person {
	
	protected String firstName;
	protected String lastName;
	protected byte serviceLength;
	public static int counter = 0;
	
	public Person() {}

	public Person(String firstName, String lastName, byte serviceLength) {
		
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setServiceLength(serviceLength);
		counter++;

	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte getServiceLength() {
		return serviceLength;
	}

	public void setServiceLength(byte serviceLength) {
		
		if (serviceLength > 0) {
			this.serviceLength = serviceLength;
		}
	}

	

	

}