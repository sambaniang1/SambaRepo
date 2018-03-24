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
		
		Flat f2 = new Flat("Ram", 10, 5600);
		
		System.out.println(f2.owner);
		System.out.println(f2.members);
		System.out.println(f2.rent);
		
		Flat f3 = new Flat("John", 6, 5000.32);
		
		
		
		/*f2.cleanFlat();
		f1.addMembers();
		System.out.println(f3.members);*/
		
		
		
	}
	
}
