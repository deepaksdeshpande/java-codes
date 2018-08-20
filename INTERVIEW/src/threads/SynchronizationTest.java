package threads;

class Accounts {
	private int balance=50;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amount) {
		balance = balance-amount;
	}
}

public class SynchronizationTest implements Runnable {
	Accounts a = new Accounts();
	
	public synchronized void makeWithdrawal(int amt) {
		
		if(a.getBalance()>=amt) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			a.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+" completes withdrawal");
		}
		else {
			System.out.println("Not enough balance for "+Thread.currentThread().getName()+" to withdraw "+a.getBalance());
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			makeWithdrawal(10);
		}
		if(a.getBalance()<10) {
			System.out.println("Account is overdrawn");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new SynchronizationTest(), "Fred");
		Thread t2 = new Thread(new SynchronizationTest(), "Lucy");
		t1.start();
		t2.start();
	}

}
