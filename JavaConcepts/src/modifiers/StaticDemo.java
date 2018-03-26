package modifiers;

public class StaticDemo {

	public void m1(){
		System.out.println("m1");
		m2(); // We can call a non-static method directly from a non-static area
		m3(); // We can call a static method directly from a non-static area
	}
	
	public int m2(){
		System.out.println("m2");
		return 2;
	}
	
	public static String m3(){
		return "Hello";
	}
	
	public static void main(String[] args) {
		// m1(); We cannot call a non-static method directly from a static area
		StaticDemo sd = new StaticDemo();
		sd.m1();
		m3(); // We can call a static method directly from a static area
	}
	
	

}
