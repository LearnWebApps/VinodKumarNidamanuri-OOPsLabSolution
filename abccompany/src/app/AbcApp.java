package app;

import java.util.Scanner;

import model.Employee;
import service.CredentialService;

public class AbcApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String firstNm = "";
		String lastNm = "";
		int choice = 0;
		String deptName = null;
		
		do 
		{
			if (firstNm.isEmpty())
			{
				System.out.println("Enter First Name: ");
				firstNm = scan.nextLine();
			}
			
			if (lastNm.isEmpty())
			{
				System.out.println("Enter Last Name: ");
				lastNm = scan.nextLine();
			}
		}while (firstNm.equals("")||lastNm.equals("")); 
		
		do {
			System.out.println("Please enter the department from the following");
		
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			
			choice = scan.nextInt();

			switch(choice) 
			{
			case 1: deptName = "Tech";
					break;
			case 2: deptName = "Admin";
					break;
			case 3: deptName = "HR";
					break;
			case 4: deptName = "Legal";
					break;
			default: System.out.println("Invalid selection of department, please make choice between 1 - 4");
			}
		} while (  !(choice == 1 || choice == 2 || choice == 3 || choice == 4)  );

		scan.close();
		
		Employee emp = new Employee(firstNm, lastNm, deptName);
		
		CredentialService credserv = new CredentialService(emp);
		
		credserv.showCredentials();
		
	}

}
