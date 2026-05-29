package day5;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private int age;
	private String post;
	
//	Getter And Setters 
	
	

	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}
	
//	Constructor
	
	public Employee() {
		
	}
	
	public  Employee(int id,String name,double salary,int age, String post) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.post = post;
	}

	
	
	
	public void getEmployee() {
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
		System.out.println("Age: " + this.age);
		System.out.println("Post: " + this.post);
	}
	
	
}
