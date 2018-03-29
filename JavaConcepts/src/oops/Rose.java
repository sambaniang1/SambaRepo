package oops;

public class Rose {

	public static void main(String[] args) {
		Rose r = new Rose();
		/*System.out.println(r);
		System.out.println(r.toString());*/
		
		for(int i = 0;i<10;i++){
			r = new Rose();
		}
		r = null;
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.gc();
	}
	
	/*public String toString(){
		return "Samba";
	}*/

	/*public int hashCode(){
		return 2;
	}*/
	
	public void finalize(){
		System.out.println("Rose object is being killed");
	}
	
}
