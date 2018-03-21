package fundamentals;

public class Flat {
	String owner;
	int members;
	double rent;
	
	//instance variable
	
	
	public Flat(String owner, int members, double rent){
		this.owner = owner;
		this.members = members;
		this.rent = rent;
	}
	
	public void addMembers(){
		members++;
	}
	public void deleteMembers(){
		members--;
	}
	public void cleanFlat(){
		System.out.println("Flat has been cleaned for "+owner);
	}
	
	
	public static void main(String[] args) {
		Flat f1 = new Flat("Samba", 2, 3400);
		
		System.out.println(f1.owner);
		System.out.println(f1.members);
		System.out.println(f1.rent);
		
		/*f1.members = 2;
		f1.owner = "Samba";
		f1.rent = 3400;*/
		
		
		/*Flat f2 = new Flat();
		
		System.out.println(f2.owner);
		System.out.println(f2.members);
		System.out.println(f2.rent);
		
		f2.owner = "Ram";
		f2.members = 10;
		f2.rent = 5600;
		
		Flat f3 = new Flat();
		f3.owner = "John";
		f3.members = 6;
		f3.rent = 5000.32;*/
		
		
		/*f2.cleanFlat();
		f1.addMembers();
		System.out.println(f3.members);*/
		
		
		
	}
	
}
