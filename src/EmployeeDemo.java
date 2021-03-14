
public class EmployeeDemo {
	
	public static void main(String[] args) {
		
//		This was the default sample for the assignment.
//		Moved some things around a bit.
//		===========================================================
//		Employee e1 = new Employee(1, "Aliu", "Adams", 100000.00, 
//				"9-5", true, true, Role.LEAD, Gender.MALE );
//		Employee e2 = new Employee(2, "Aliu", "Adebayo", 60000.00, 
//				"7-3", true, true, Role.TESTER, Gender.MALE );
//		System.out.println(e1);
//		System.out.println(e2);
//		===========================================================		
		
		//Hiring an Employee and entering them into the system.
			Employee e15 = new Employee(1551, "Muhammad", "Amina", 250000.00, 
					"6-12",true, true, Role.PRESIDENT, Gender.FEMALE);
			
			System.out.println(e15);
		
		//employee to be fired. Just for identification purposes.
			Employee e3 = new Employee(2034, "Alimi", "Adebayo", 60000.00, 
					"7-3", true, true, Role.TESTER, Gender.MALE );
			
			System.out.println(e3);
			System.out.println("========================================");
			
		//Firing Employee
			e3.fireEmployee();
			System.out.println("The status of "+ e3+ ", is currently "+ 
					e3.getIsActive()+("."));
			System.out.println("This employee has been terminated");
			System.out.println("========================================");

			
       //Setting The Work Hours
			Employee e4 = new Employee(4001, "Mahmoud", "Yinka", 50000.00, 
					"12-12", true, true, Role.ENGINEER, Gender.FEMALE);
			e4.setWorkHours("9-5");
			System.out.println(e4+ ", works from " + e4.getWorkHours() +".");
			System.out.println("========================================");
			
	   //Promoting The Employee
			Employee e5 = new Employee(5004, "Stevens", "James", 45000.00, 
					"9-3", true, true, Role.ENGINEER, Gender.MALE);
			System.out.println(e5 + " has been promoted to " + e5.promoteEmployee());
			System.out.println("========================================");
	  
	   
	   //Printing Employee Salary
			System.out.println(e5 + " gets paid $" +e5.getSalary() + " per annum.");
			System.out.println("========================================");
			System.out.println("Assignment is complete");
	}

}
