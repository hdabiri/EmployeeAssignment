
public class EmployeeDemo {
	


	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1, "Adams", "Aliu", 2000.00, "9-5", true, true, Role.LEAD, Gender.MALE );
		Employee e2 = new Employee(2, "Adebayo", "Aliu", 20000.00, "7-3", true, true, Role.TESTER, Gender.MALE );
		System.out.println(e1);
		System.out.println(e2);

	}

}
