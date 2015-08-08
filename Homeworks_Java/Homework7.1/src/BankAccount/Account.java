package BankAccount;
import java.util.Scanner;

public class Account {

	protected long sum;
	
	public Account() {
		this.sum = 0;
	}
	
	public Account(long sum) throws NegativeMoneyException {
		this();
		this.sum = sum;
		if (sum < 0) {
			throw new NegativeMoneyException("Money cannot be negative!");
		}
		
	}
	
	public long getSum() {
		return sum;
	}

	public void setSum(long sum) throws NegativeMoneyException {

		this.sum = sum;
	}

	
public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the sum of the account: ");
		long sum = input.nextLong();
		
		System.out.print("Enter the name of the person: ");
		String personName = input.nextLine();
		input.nextLine();
		
		System.out.print("Enter the ID of the person: ");
		long ID = input.nextLong();
		
		System.out.print("Enter the name of the company: ");
		String companyName = input.nextLine();
		input.nextLine();
		

		System.out.print("Enter the bulstat of the company: ");
		String bulstat = input.nextLine();
		
		Account account = new Account(sum);
		System.out.print("Account, sum: " + account.sum);
		
		PersonalAccount pa = new PersonalAccount(sum, personName, ID);
		CoorporativeAccount ca = new CoorporativeAccount(sum, companyName, bulstat);
		
		
		System.out.print("\nPersonal Account, ID: " + pa.checkInstance(pa));
		System.out.print("\nCoorporative Account, bulstat: " + ca.checkInstance2(ca));

		
		input.close();
		
	}
	
	
	
	public long checkInstance(Object object)  throws InvalidAccountException {
		
		if (!(object instanceof Account || object instanceof PersonalAccount || object instanceof CoorporativeAccount)) {
			throw new InvalidAccountException();
		}
		return ((PersonalAccount) object).getID();
	}
	
	
	public String checkInstance2(Object object)  throws InvalidAccountException {
		
		if (!(object instanceof Account || object instanceof PersonalAccount || object instanceof CoorporativeAccount)) {
			throw new InvalidAccountException();
		}
		
		return ((CoorporativeAccount) object).getBulstat();
	}
	
	
	
//	@SuppressWarnings("static-access")
//	public static void main(String[] args) throws Exception {
//		
//		Scanner input = new Scanner(System.in, "UTF-8");
//		System.out.print("Enter the sum of the account: ");
//		long sum = input.nextLong();
//		
//		System.out.print("Enter the name of the person: ");
//		String personName = input.nextLine();
//		input.nextLine();
//		
//		System.out.print("Enter the ID of the person: ");
//		String ID = input.nextLine();
//		
//		System.out.print("Enter the name of the company: ");
//		String companyName = input.nextLine();
//		input.nextLine();
//		
//
//		System.out.print("Enter the bulstat of the company: ");
//		String bulstat = input.nextLine();
//		
//		Account account = new Account(sum);
//		System.out.print("Account, sum: " + account.sum);
//		
//		PersonalAccount pa = new PersonalAccount(sum, personName, ID);
//		CoorporativeAccount ca = new CoorporativeAccount(sum, companyName, bulstat);
//		String temp1 = checkInstance(pa);
//		String temp2 = checkInstance(ca);
//		
//		Long.parseLong(temp1);
//		//try catch
//		
//		
//		System.out.print("\nPersonal Account, ID: " + pa.checkInstance(pa));
//		System.out.print("\nCoorporative Account, bulstat: " + ca.checkInstance2(ca));
//
//		
//		input.close();
//		
//	}
//	
//	
	
	
//	
//	public static String checkInstance(Object object)  throws InvalidAccountException {
//		
//		if (!(object instanceof Account || object instanceof PersonalAccount || object instanceof CoorporativeAccount)) {
//			throw new InvalidAccountException();
//		}
//		if (object instanceof PersonalAccount) {
//		return ((PersonalAccount) object).getID();
//		} else if(object instanceof CoorporativeAccount) {
//			return ((CoorporativeAccount) object).getBulstat();
//		} else {
//			return null;
//		}
//	}
	
	


}
