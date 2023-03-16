package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private int passwordLenght = 8;
	private String alternateEmail;
	private String companySuffix = "company.com";

	// Constructor for first name and last name

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.email = createEmail();
		this.password = this.randomPassword(passwordLenght);
	}

	private String setDepartment() {
		System.out.println("Enter the department\n 1 for sales \n 2 for development \n 3 for accounting \n 0 for none");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		switch (depChoice) {
		case 1:
			return "sales";
		case 2:
			return "dev";
		case 3:
			return "accounting";
		default:
			return "";
		}
	}

	private String createEmail() {
		return firstName + "." + lastName + "@" + department + "." + companySuffix;
	}

	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getmailBoxCapacity() {
		return this.mailBoxCapacity;
	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPRSWYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public String showInfo() {
		return "Display name: " + firstName + " " + lastName + 
				"Company email: " + email + 
				"Mailbox capacity: " + mailBoxCapacity;
	}
	
	
	
	

}
