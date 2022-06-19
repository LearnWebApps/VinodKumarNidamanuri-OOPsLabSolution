package model;

public class Employee {

	private String firstName;
	private String lastName;
	private String deptName;
	private String emailAddress;
	private String password;
	
	public Employee (String fName, String lName, String dName){
		super();
		this.firstName = fName;
		this.lastName = lName;
		this.deptName = dName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getDeptName() {
		return deptName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
