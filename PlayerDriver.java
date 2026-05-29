package day5;

public class PlayerDriver {
	
	public static void main(String[] args) {
		Player p1 = new Player();
		
		System.out.println(p1.toString());
		
		Player p2 = new Player(19,"Raj",200,300);
		System.out.println(p2.toString());
		
		Player p3 = new Player(p2);
		System.out.println(p3.toString());
		
	}
	
	 

}
