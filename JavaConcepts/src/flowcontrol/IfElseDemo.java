package flowcontrol;

public class IfElseDemo {

	public static void main(String[] args) {
		int a = 60;
		int b = 30;
		int c = 50;
		
		if(a<b){
			System.out.println("a is greater");
		}
		else if(a > c){
			System.out.println("b is greater");
			System.out.println("abc");
		
		}else{
			System.out.println("Java");
			if(c== 50){
				System.out.println("asert");
			}
		}
			
		System.out.println("End of flow control");
		
		
		
		

	}

}
