package modifiers;

public class StaticInstanceCheck {

	static int statVar;
	int instVar;
	
	void incrementInst(){
		instVar++;
	}
	
	void incrementStat(){
		statVar++;
	}
	
	public static void main(String[] args) {
		StaticInstanceCheck sic1 = new StaticInstanceCheck();
		System.out.println(sic1.instVar);
		System.out.println(sic1.statVar);
		sic1.incrementInst();
		sic1.incrementStat();
		System.out.println(sic1.instVar);
		System.out.println(sic1.statVar);
		
		StaticInstanceCheck sic2 = new StaticInstanceCheck();
		sic2.incrementInst();
		sic2.incrementStat();
		System.out.println(sic2.instVar);
		System.out.println(sic2.statVar);
		
		StaticInstanceCheck sic3 = new StaticInstanceCheck();
		sic3.incrementInst();
		sic3.incrementStat();
		System.out.println(sic3.instVar);
		System.out.println(sic3.statVar);
		System.out.println(StaticInstanceCheck.statVar);
		System.out.println(sic1.statVar);
		
	}

}
