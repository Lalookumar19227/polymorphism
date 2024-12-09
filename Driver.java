package polymorphism;

public class Driver {
	public static void main(String[] args) {
		Weapon w1=new Gun();
		Weapon w2=new Bomb();
		Weapon w3=new Knife();
		
		w1.use();
		System.out.println("=================");
		w2.use();
		System.out.println("==================");
		w3.use();
		
		
	}

}
