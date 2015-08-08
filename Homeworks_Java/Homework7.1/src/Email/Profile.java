package Email;

public class Profile {

	protected String email;
	protected String password;
	
	public Profile() {
		
		this.email = "";
		this.password = "";
	}
	
	public Profile(String email, String password) throws ExceptionEmail, ExceptionPassword {
		
		this();
		this.email = email;
		this.password = password;
	}
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws ExceptionEmail {
		
		if (email.length() < 5) {
			throw new ExceptionEmail("The email is too short. Enter at least 5 symbols.");
		}
			
		if (!email.contains("@") || !email.contains(".")) {
			throw new ExceptionEmail("The e-mail has to contain \'@\' and \'.\'.");
		}

		
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws ExceptionPassword {
		
		if (password.length() < 6) {
			throw new ExceptionPassword("The password is too short. Enter at least 6 symbols.");
		}
		
		boolean checkForDigits = false;
		
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				checkForDigits = true;
			}
		}
		
		if (checkForDigits == false) {
			throw new ExceptionPassword("The password does not contain a number.");
		}
		
		this.password = password;
	}

	
	public static void main(String[] args) {

		try {

			Profile p1 = new Profile();
			p1.setEmail("milaIvanova1995@abv.bg");
			p1.setPassword("milam");	
		} catch (ExceptionEmail exception) {
			System.out.println("Email error: " + exception.getMessage());
		} catch (ExceptionPassword exception) {
			System.out.println("Password error: " + exception.getMessage());
		}
		
		try {
			Profile p2 = new Profile();
			p2.setEmail("chungi.tw");
			p2.setPassword("34ugi3gr");
		} catch (ExceptionEmail exception) {
			System.out.println("Email error: " + exception.getMessage());
		} catch (ExceptionPassword exception) {
			System.out.println("Password error: " + exception.getMessage());
		}
		
		try {
			Profile p3 = new Profile();
			p3.setEmail("vincentdevries@yahoo.nl");
			p3.setPassword("123321");
		} catch (ExceptionEmail exception) {
			System.out.println("Email error: " + exception.getMessage());
		} catch (ExceptionPassword exception) {
			System.out.println("Password errorr: " + exception.getMessage());
		}
		
	}
	
	
}
