package threads;

public class Threadextend extends Thread {

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " executing");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadextend t = new Threadextend();
		Thread t1 = new Thread(t, "d");
		Thread t2 = new Thread(t, "e");
		t1.start();
		t2.start();
	}

}
