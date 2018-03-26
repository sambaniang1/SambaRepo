package modifiers;

import fundamentals.Flat;

public class AccessModifiers {

	public static void main(String[] args) {
		Flat f1 = new Flat("Samba", 2, 3400);
		
		System.out.println(f1.owner);
		//System.out.println(f1.members);
		//System.out.println(f1.rent);
	}

}
