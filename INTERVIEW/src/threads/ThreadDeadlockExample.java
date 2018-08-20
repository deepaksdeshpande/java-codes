package threads;

class A {
	private int i=1;
	A() {
		System.out.println("i is : "+i);	
	}
}

class B {
	private int j=2;
	B() {
		System.out.println("j is : "+j);
	}
}
public class ThreadDeadlockExample implements Runnable {
	A a = new A();
	B b = new B();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(a) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(b){
				System.out.println("A Block sync and called B");
			}
		}
		
		synchronized (b) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(a) {
				System.out.println("B block sync and called A in it");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDeadlockExample td = new ThreadDeadlockExample();
		Thread t1 = new Thread(td);
		Thread t2 = new Thread(td);
		t1.start();
		t2.start();
	}

}
