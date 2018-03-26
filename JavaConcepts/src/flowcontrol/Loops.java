package flowcontrol;

public class Loops {

	public static void main(String[] args) {
		int i = 0;
		/*i = 11;
		while(i<=10){
			System.out.println(i);
			i++;
		}*/
		
		/*i = 11;
		do{
			System.out.println(i);
			i++;
		}while(i<=10);*/
		
		/*for(int j=1;j<=10;j++){
			System.out.println(j);
		}*/
		
		/*for(int j=1, k=30;j<k;j=j+2){
			System.out.println(j);
		}*/
		
		/*int[] att = {-45, 42, 12, 90};
		for(int num: att){
			System.out.println(num);
		}*/
		
		
		
		for(int j=1;j<=10;j++){
			if(j == 5)
				continue;
			System.out.println(j);
		}
		
		
	}

}
