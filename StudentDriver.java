package day5;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setR_no(101);
		s1.setName("Ashish");
		s1.setPer(54.65);
		s1.setOutStationCandidate(false);
		
		test(s1);
		System.out.println("---------------------------After change in s2-----------------------");
		s1.accesStudent();
		
	}
	
	private static void test(Student s) {
		s.accesStudent();
		s.setName("Raj");
	}

}
