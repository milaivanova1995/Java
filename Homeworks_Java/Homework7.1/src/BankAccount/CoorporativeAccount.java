package BankAccount;

public class CoorporativeAccount extends Account {
	
	protected String companyName;
	protected String bulstat;
	
	public CoorporativeAccount() {
		
		super();
		this.companyName = "";
		this.bulstat = "";
	}
	
	public CoorporativeAccount (long sum, String companyName, String bulstat) throws NegativeMoneyException {
		
		super(sum);
		this.companyName = companyName;
		this.bulstat = bulstat;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getBulstat() {
		return bulstat;
	}

	public void setBulstat(String bulstat) {
		this.bulstat = bulstat;
	}
	

	
}
