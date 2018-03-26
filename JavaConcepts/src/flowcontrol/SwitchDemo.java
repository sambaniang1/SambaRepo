package flowcontrol;

public class SwitchDemo {

	public static void main(String[] args) {
		/*String color = "red";
		switch(color){
		case "green":
			System.out.println("Move");
			break;
		case "yellow":
			System.out.println("Get Ready");
			break;
		case "red":
			System.out.println("Stop");
			break;
		default:
			System.out.println("It is not a valid traffic color. Go to driving school");
		}*/
		final char dd = 'e';
		char ch = 'i';
		switch(ch){
		case 'a':
		case dd:
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is vowel");
			break;
		default:
			System.out.println("it is consonant");
		}
		
	}

}
