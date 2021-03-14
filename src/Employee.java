
public class Employee {
	private int employeeId;
	private String employeeLastName;
	private String employeeFirstName;
	
	private double salary;
	
	private String workHours;
	
	private boolean isFullTime;
	
	private boolean isActive;
	
	private Role role;
	
	@SuppressWarnings("unused")
	private Gender gender;
	
	

	public Employee(
			int employeeId, String employeeLastName, 
			String employeeFirstName, double salary,
			String workHours, boolean isFullTime, 
			boolean isActive, Role role, Gender gender
	) {
		
		this.employeeId = employeeId;
		this.employeeLastName = employeeLastName;
		this.employeeFirstName = employeeFirstName;
		this.salary = salary;
		this.workHours = workHours;
		this.isFullTime = isFullTime;
		this.isActive = isActive;
		this.role = role;
		this.gender = gender;
		
	}
	
	//Getting the first and last name of the employee
	String getFullName() {
		return this.employeeFirstName + " " + this.employeeLastName;
				
	}

	//Printing the employee information
	@Override
	public String toString() {
		return "Employee with ID number: " + employeeId +", named "+ 
				this.getFullName() + ", in the role of " + role;
	}

	//To Fire an employee
	void fireEmployee() {
		this.isActive = false;

	}
	
	//To Promote an employee
	public Role promoteEmployee() {		
		this.role = role.next();
		return role;
	}
	
	//To get the work status, full time or otherwise
	public boolean getIsFullTime() {
		return isFullTime;
	}
	
	//To get the employment status of the employee
	public boolean getIsActive() {
		return isActive;
	}

	//To get the work hours of the employee
	public String getWorkHours() {
		return workHours;
	}

	//To change the work hours of the employee
	public void setWorkHours(String workHours) {
		this.workHours = workHours;
	}

	//To get the role of the employee
	public Role getRole() {
		return role;
	}

	//To get the salary of the employee
	public double getSalary() {
		return this.salary; 
	}
	
	//To get the gender of the employee. I don't know what for?? :!
	public Gender getGender() {
		return this.gender;
	}
}
