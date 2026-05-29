package day5;

public class Player {
	private int jno;
	private String name;
	private int mp;
	private int Rs;
	
//	noargs constructor/ non-perameterized constructor
	public Player() {
		this.jno = 18;
		this.name = "virat";
		this.mp = 100;
		this.Rs = 1800;
	}
	
	
//	perameterized constructor
	public Player(int i, String string, int j, int k) {
		this.jno = i;
		this.name = string;
		this.mp = j;
		this.Rs = k;
	}

	
//	Copy constructor
	public Player(Player p) {
		this.jno = p.jno;
		this.mp = p.jno;
		this.name = p.name;
		this.Rs = p.Rs;
				
	}


	@Override
	public String toString() {
		return "Player [jno=" + jno + ", name=" + name + ", mp=" + mp + ", Rs=" + Rs + "]";
	}
	
	
	
}
