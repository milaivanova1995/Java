package exercise3;

import java.util.Scanner;

public class Meat extends Stock{
	
	String meatType;
	String expireDate;
	
		public Meat() {
			this.meatType = "";
			this.expireDate = "";
		}
		
		public Meat(String type, String color) {
			this();
			setMeetType(type);
			setExpireDate(color);
		}
		
	public String getMeetType() {
		return meatType;
	}
	public void setMeetType(String meetType) {
		this.meatType = meetType;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	
	public void TellInfoMeat() {
		System.out.println("Vegitable type: " + this.meatType);
		System.out.println("Expire date: " + this.expireDate);
	}
	
	public void meatInput() {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the meat type: ");
		String meatType = input.nextLine();
		System.out.print("Enter its expire date: ");
		String expireDate = input.nextLine();
		System.out.print("Enter the price: ");
		float price = input.nextFloat();	
		
		
		
		Meat meat = new Meat(meatType, expireDate);
		
		meat.TellInfoMeat();
		System.out.println("Meat price: " + meat.getPrice(price) + "\nAvailable: " + meat.isAvailable(super.available));
		
	
		
	}
}
