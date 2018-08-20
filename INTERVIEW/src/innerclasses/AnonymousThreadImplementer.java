package innerclasses;

class MyRunnable {
	
}

public class AnonymousThreadImplementer {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" is executing");
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+" is executing");
			}
			
		});
		t1.setName("deepak");
		t1.start();
		System.out.println(Thread.currentThread().getName()+" finished executing");
	}
}
