/**
 * 
 */
package threads;

/**
 * @author deepak
 *
 */
public class Threads extends Thread {

	
	public void run() {
		System.out.println("Executing a new thread :"+Thread.currentThread().getName());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread: "+Thread.currentThread().getName());
		Threads t = new Threads();
		t.setName("deepak");
		t.start();
	}

}
