package oops;

public class Calculator {

	public int add(int a, int b){
		System.out.println("Called integer addition");
		return a+b;
	}
	
	public double add(double a, double b){
		System.out.println("Called double addition");
		return a+b;
	}
	
	public int add(int a, int b, int c){
		System.out.println("Called three integer addition");
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(34, 56);
		cal.add(34.3, 56.0);
		cal.add(45, 90, 32);
	
	}

}
