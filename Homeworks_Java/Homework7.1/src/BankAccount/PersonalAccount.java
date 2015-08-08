package BankAccount;
public class PersonalAccount extends Account {

	protected String name;
	protected long ID;
	
	public PersonalAccount() {
		
		super();
		this.name = "";
		this.ID = 0;
	}
	
	public PersonalAccount(long sum, String name, long ID) throws NegativeMoneyException {
		
		super(sum);
		this.name = name;
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}
	
	
}
