package day5;

public class Employee {
	private int id;
	private String name;
	private double sallary;
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

	public double getSallary() {
		return sallary;
	}

	public void setSallary(double sallary) {
		this.sallary = sallary;
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
	
	public  Employee(int id,String name,double sallary,int age, String post) {
		this.id = id;
		this.name = name;
		this.sallary = sallary;
		this.age = age;
		this.post = post;
	}

	
	
	
	public void getEmployee() {
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Sallary: " + this.sallary);
		System.out.println("Age: " + this.age);
		System.out.println("Post: " + this.post);
	}
	
	
}
