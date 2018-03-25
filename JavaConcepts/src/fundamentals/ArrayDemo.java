package fundamentals;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] iArr = new int[4];
		iArr[0] = 4;
		iArr[1] = -90;
		iArr[2] = 56;
		iArr[3] = 23;
		
		/*for(int num: iArr){
			System.out.println(num);
		}*/
		
		/*for(int i=0;i<iArr.length;i++){
			System.out.println(iArr[i]);
		}*/
		
		int[] jArr = {4, -90, 56, 23};
		
		int[][] twoDArr = new int[3][4];
		
	/*	System.out.println(twoDArr.length);
		System.out.println(twoDArr[0].length);*/
		
		twoDArr[0][0] = 1;
		twoDArr[0][1] = 2;
		twoDArr[0][2] = 3;
		twoDArr[0][3] = 4;
		
		twoDArr[1][0] = 5;
		twoDArr[1][1] = 6;
		twoDArr[1][2] = 7;
		twoDArr[1][3] = 8;
		
		twoDArr[2][0] = 9;
		twoDArr[2][1] = 10;
		twoDArr[2][2] = 11;
		twoDArr[2][3] = 12;
		
		int[][] twoDArr2 = {{1, 2, 3, 4, 80}, {5, 6, 7}, {9, 10, 11, 12}};
		
		/*for(int[] oneDArr: twoDArr2){
			for(int num: oneDArr){
				System.out.print(num+" ");
			}
			System.out.println();
		}*/
		
		for(int i =0;i<twoDArr2.length;i++){
			int[] oneDArr = twoDArr2[i];
			for(int j =0;j<oneDArr.length;j++){
				System.out.println(twoDArr2[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
