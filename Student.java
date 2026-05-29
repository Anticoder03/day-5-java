package day5;
import java.util.Scanner;
public class Student {

	private int r_no;
	private String name;
	private double per;
	private boolean outStationCandidate;
	
	
	
	public int getR_no() {
		return r_no;
	}

	public void setR_no(int r_no) {
		this.r_no = r_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public boolean isOutStationCandidate() {
		return outStationCandidate;
	}

	public void setOutStationCandidate(boolean outStationCandidate) {
		this.outStationCandidate = outStationCandidate;
	}

	public void acceptStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("r no");
		r_no = sc.nextInt();
		
		sc.nextLine(); 
		System.out.println("Name: ");
		name = sc.nextLine();
		
		System.out.println("per");
		per = sc.nextDouble();
		
		
		outStationCandidate = false;
		
	}
	
	public void accesStudent() {
		System.out.println("r no: " + r_no);
		
		System.out.println("Name: " + name);
		
		System.out.println("per :" + per);
		
		System.out.println("Out Station Candidate: " + outStationCandidate);
	}

}
