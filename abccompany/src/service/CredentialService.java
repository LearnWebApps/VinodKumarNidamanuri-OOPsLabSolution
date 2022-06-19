package service;

import model.Employee;
import java.util.Random;

public class CredentialService {
	
	private Employee employee;
	public CredentialService(Employee employee) 
	{

		super();
		this.employee = employee;
	}
	
	public void generateEmailAddress()
	{
		String firstName = employee.getFirstName().replaceAll("\\s", "");
		String lastName = employee.getLastName().replaceAll("\\s", "");
		String deptName = employee.getDeptName().replaceAll("\\s", "");
		employee.setEmailAddress(firstName + lastName + "@" + deptName + "." + "abc.com");
		//return firstName + lastName + "@" + deptName + "." + "abc.com";
	}
	
	public String fetchTwoRandChars(String src)
	{
        Random rnd = new Random();
        int index1 = (int) (rnd.nextFloat() * src.length());
        int index2 = (int) (rnd.nextFloat() * src.length());
        return "" + src.charAt(index1) + src.charAt(index2);
    }
	
	public void generatePassword()
	{
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String NUMS = "1234567890";
        String SPEC = "@#$%^&+=";

        String pass = fetchTwoRandChars(chars) + fetchTwoRandChars(CHARS) + fetchTwoRandChars(NUMS) + fetchTwoRandChars(SPEC);
        employee.setPassword(pass);
        //return pass;
	}
	
	public void showCredentials()
	{
		generateEmailAddress();
		generatePassword();
		System.out.println("Dear " + employee.getFirstName() + ", your generated credentials are as follows.");
		System.out.println("Email    ---> " + employee.getEmailAddress());
		System.out.println("Password ---> " + employee.getPassword());
	}
}
