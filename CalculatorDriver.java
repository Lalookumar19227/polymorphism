package polymorphism;

public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add(12, 23.5);
		System.out.println("==================");
		c1.add(12, 45);
	}

}
