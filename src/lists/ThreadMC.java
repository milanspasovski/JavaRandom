package lists;

public class ThreadMC {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadC("first")); 
		Thread t2 = new Thread(new ThreadC("second")); 
		Thread t3 = new Thread(new ThreadC("third")); 
		Thread t4 = new Thread(new ThreadC("fourth")); 
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
