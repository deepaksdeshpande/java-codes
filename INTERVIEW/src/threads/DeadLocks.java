package threads;

class ResourceA {
	private int i=10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}

class ResourceB {
	private int j=20;

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
}

public class DeadLocks implements Runnable {

	ResourceA a = new ResourceA();
	ResourceB b = new ResourceB();
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(b) {
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(a) {
				System.out.println("In block Two");
			}
		}
		
		synchronized (a) {
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(b) {
				System.out.println("In block one");
			}
		}
	}
	
	public static void main(String[] args) {
		DeadLocks d = new DeadLocks();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
	}
}
