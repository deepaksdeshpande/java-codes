package threads;

class AccountType {
	private int balance = 50;
	
	public int getBalance() {
		return balance;
	}
	
	public int withdraw(int amt) {
		balance = balance - amt;
		return balance;
	}
	
}

public class ThreadSynchronization implements Runnable {
	
	private Account ac = new Account();
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			makeWithdrawal(10);
			if(ac.getBalance() < 0) {
				System.out.println("Account is overdrawn !!!");
			}
		}
	}
	
	private synchronized void makeWithdrawal(int amt) {
		if(ac.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			try {
				Thread.sleep(500);
				} 
			catch(InterruptedException ex) { 
				ex.printStackTrace();
			}
				ac.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+" completed the withdrawal \n");
		}
		else {
			System.out.println("Not enough balance for "+Thread.currentThread().getName()+" to make withdrawal "+ac.getBalance());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSynchronization ts = new ThreadSynchronization();
		Thread t1 = new Thread(ts);
		Thread t2 = new Thread(ts);
		t1.setName("Fred ");
		t2.setName("Lucy ");
		t1.start();
		t2.start();
	}

}
