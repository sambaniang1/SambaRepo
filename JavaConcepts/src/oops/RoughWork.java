package oops;

public class RoughWork {

	public static void main(String[] args) {
		/*Human h = new Human();
		Man m = new Man();
		Woman w = new Woman();
		h.swim();
		h.travel();
		
		m.cook();
		m.swim();
		m.travel();
		
		w.drive();
		w.swim();
		w.travel();*/
		
		Human h = new Human();
		Man m = new Man();
		Human hm = new Man();
		//Man mh = new Human();
		h.swim();
		h.travel();
		
		m.cook();
		m.travel();
		m.swim();
		
		
		hm.travel();
		hm.swim();
		//hm.cook();
		
	}

}
