
public class Employee {
	private int employeeId;
	private String employeeLastName;
	private String employeeFirstName;
	private double salary;
	private String workHours;
	private boolean isFullTime;
	private boolean isActive;
	private Role role;
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
		this.role = role;
		this.gender = gender;
		this.isActive = isActive;
	}

	String getFullName() {
		return this.employeeFirstName + " " + this.employeeLastName;
				
	}

	@Override
	public String toString() {
		return "EmployeeDemo [employeeId=" + employeeId + ", Name=" + this.getFullName() + ", role=" + role + "]";
	}




}
