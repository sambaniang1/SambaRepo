package fundamentals;

public class StringDemo {

	public static void main(String[] args) {
		
		
		/*String s1 = "Samba";
		String s2 = new String("Samba");
		String s3 = "Samba";
		String s4 = new String("Samba");
		String s5 = s2;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equals(s5));
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s4);
		System.out.println(s2 == s5);*/
		
		String s = "LearningFundamentalOfJava";
		System.out.println(s.substring(21));
		System.out.println(s.substring(8));
		System.out.println(s.substring(8, 19));
		
		System.out.println(s.length());
		System.out.println(s.charAt(7));
		System.out.println(s.isEmpty());
		
		String ss = "  Roller Coaster  ";
		System.out.println(ss.length());
		String sss = ss.trim();
		System.out.println(sss.length());
		System.out.println(ss);
		System.out.println(sss);
		
		/*System.out.println((int)'B');
		System.out.println((int)'b');
		
		String a1 = "cppln";
		String a2 = "bpplnai";
		System.out.println(a1.compareTo(a2));*/

	}

}
