package day5;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setId(101);
		e1.setName("Ashish");
		e1.setSallary(20000.00);
		e1.setAge(20);
		e1.setPost("Full Stack Devloper");
		
		System.out.println("Before any changes: ");
		e1.getEmployee();
		
		System.out.println("After making by using test employee method");
		test_Employee(e1);
		e1.getEmployee();
		
		Employee e2 = new Employee(101,"Raj",15000.00,25,"Programmer");
		
		System.out.println("-------------------------Before change to SD-------------------------");
		e2.getEmployee();
		System.out.println("------------------------- After change to SD-------------------------");
		ChangeToSD(e2);
		e2.getEmployee();
		

		
		
	}
	private static void test_Employee(Employee e) {
		e.setSallary(25000.00);
	}
	private static void ChangeToSD(Employee e){
		e.setPost("Software Devloper");
		e.setSallary(30000.00);
	}
}
