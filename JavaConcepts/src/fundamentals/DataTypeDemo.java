package fundamentals;

public class DataTypeDemo {

	char cch;
	static char c;
	
	public static void main(String[] args) {
		//int x = 20;
		byte b = 43;
		int y = b;
		
		short s = (short)y;
		
		//int i = 8323023892383;
		long l = 832302386786987l;
		
		float f = 2.3f;
		
		c = 56;
		char ch = 'a';
		char chh;
		chh = 'a';
		
		int res = addNumber(45, 46);
		System.out.println(res);
		
		double finalResult = multiplyAndSubtract(8, 5.5, 3);
		System.out.println(finalResult);
		
		//double result = multiplyAndSubtract_Part2(8, 5.5, 3);
		System.out.println(multiplyAndSubtract_Part2(8, 5.5, 3));
		
		greeting("Samba");
		greeting("Ram");
		
	}
	
	public static int addNumber(int a, int b){
		int c =a + b;
		return c;
	}
	
	
	public static double multiplyAndSubtract(double a, double b, double c){
		double d = a * b - c;
		return d;
	}
	
	
	public static double multiplyAndSubtract_Part2(double a, double b, double c){
		return a * b - c;
	}
	
	public static void greeting(String s){
		String greet = "Hi "+s;
		System.out.println(greet);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
