import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) throws IOException {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Do you want to Hire an employee? Enter 'yes' or 'no'.");
		String feedback = keyboard.next();
				
		if (feedback.equals("yes")) {
			System.out.println("Enter the Employee Information in the following format:"
					+ " employeeId (e.g.-> 001), employeeLastName (e.g.-> John), employeeFirstName (e.g.-> James),"
					+ "	salary (e.g.-> 10000.00), workHours (e.g.-> 8 - 5), isFullTime (enter one: true / false), "
					+ " isActive (enter one: true / false)");
			
			int employeeId = keyboard.nextInt();
			String employeeLastName = keyboard.next();
			String employeeFirstName = keyboard.next();
			double salary = keyboard.nextDouble();
			String workHours = keyboard.next();
			boolean isFullTime = keyboard.nextBoolean();
			boolean isActive = keyboard.nextBoolean();
			
			System.out.println("What role is this employee going to be in? (Engineer, Tester, President, Lead)");
			String roleInput = keyboard.next();
			roleInput.toLowerCase();
			Role role = Role.ENGINEER;
			
			if (roleInput.equals("engineer")) {
				role = Role.ENGINEER;
			} else if (roleInput.equals("tester")) {
				role = Role.TESTER;
			} else if (roleInput.equals("president")) {
				role = Role.PRESIDENT;
			} else if (roleInput.equals("lead")) {
				role = Role.LEAD;
			}
				
			System.out.println("Is this employee Male or Female? ");
			String genderInput = keyboard.next();
			genderInput.toLowerCase();
			Gender gender = Gender.Female;
			
			if (genderInput.equals("male")) {
				gender = Gender.Male;
			}else if (genderInput.equals("female")) {
				gender = Gender.Female;
			}
			
			Employee e100 = Employee.hireEmployee(employeeId, employeeLastName, employeeFirstName, 
					salary, workHours, isFullTime, isActive, role, gender);
			System.out.println("You have successfully hired " + e100 + " with a salary of $" + salary
					+ ", and will work from " + workHours +".");
		
		} else if(feedback.equals("no")) {
			
			System.out.println("Do you want to promote an employee? 'yes' or 'no'");
			String promoteInput = keyboard.next();
			
			if (promoteInput.equals("yes")) {
				System.out.println("Enter the employee's ID: (All employees have an ID between 1 - 100)");
				int promoteUp = keyboard.nextInt();
				
				if (promoteUp != 0 ) {
					
					BufferedReader reader = new BufferedReader(new FileReader("EmployeeData.csv"));
					
					// read file line by line
					String line = null;
					Scanner scanner = null;
					int count = 0;

					while ((line = reader.readLine()) != null) {

						scanner = new Scanner(line);
						
							String[] employeeID = line.split(",");
							if (promoteUp == Integer.parseInt(employeeID[0])) {
								count++;
								
								Employee e500 = new Employee(Integer.parseInt(employeeID[0]),employeeID[1],
										employeeID[2],Double.parseDouble(employeeID[3]),employeeID[4],
										Boolean.parseBoolean(employeeID[5]), Boolean.parseBoolean(employeeID[6]),
										Role.valueOf(employeeID[7]),Gender.valueOf(employeeID[8]));
								
								System.out.println(e500 + " has been promoted to " + e500.promoteEmployee());
								break;
							}
						}
					if (count==0) {
						System.out.println("This ID is not assigned to an employee.");
						System.out.println("========================================");	
					}
						scanner.close();
						reader.close();
					}
				
				
				} else if(promoteInput.equals("no")) {
					System.out.println("Do you want to fire an employee? Enter 'yes' or 'no'.");
					String fireInput = keyboard.next();
					
					if (fireInput.equals("yes")) {
						System.out.println("Enter the employee's ID: (All employees have an ID between 1 - 100)");
						int fireDown = keyboard.nextInt();
						
						if (fireDown != 0 ) {
							
							BufferedReader reader = new BufferedReader(new FileReader("EmployeeData.csv"));
							
							// read file line by line
							String line = null;
							Scanner scanner = null;
							int count = 0;
		
							while ((line = reader.readLine()) != null) {
		
								scanner = new Scanner(line);
								
									String[] employeeID = line.split(",");
									if (fireDown == Integer.parseInt(employeeID[0])) {
										count++;
										
										Employee e500 = new Employee(Integer.parseInt(employeeID[0]),employeeID[1],
												employeeID[2],Double.parseDouble(employeeID[3]),employeeID[4],
												Boolean.parseBoolean(employeeID[5]), Boolean.parseBoolean(employeeID[6]),
												Role.valueOf(employeeID[7]),Gender.valueOf(employeeID[8]));
										e500.fireEmployee();
										System.out.println(e500 + " has been terminated");
										break;
									}
								}
							if (count==0) {
								System.out.println("This ID is not assigned to an employee.");
								System.out.println("========================================");	
							}
								scanner.close();
								reader.close();
						}
					}
			keyboard.close();
		}
		
	}

}
}

