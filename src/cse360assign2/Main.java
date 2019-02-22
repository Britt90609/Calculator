package cse360assign2;

public class Main {
	public static void main(String[] args) {
		Calculator testing = new Calculator();
		
		testing.add (20);
		testing.subtract (100);
		testing.multiply (-3);
		testing.add(5);
		testing.divide(2);
		testing.add(10);
		testing.subtract(11);



		
		System.out.println(testing.getHistory());
		System.out.println(testing.getTotal());
	}
}