/**
 * 
 */
package threads;

/**
 * @author deepak
 *
 */

class Account {

	private int balance = 50;
	
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance = balance - amount;
	}

}


public class ThreadSync implements Runnable {

	private Account acct = new Account();
	

	@Override
	public void run() {
		for (int x = 0; x < 5; x++) {
			makeWithdrawal(10);
			if (acct.getBalance() <= 0) {
				System.out.println("Account is overdrawn !!!");
			}
		}
	}


	private void makeWithdrawal(int amt) {
		if(acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			try {
				Thread.sleep(500);
				} 
			catch(InterruptedException ex) { 
				ex.printStackTrace();
			}
				acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+" completed the withdrawal \n");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new ThreadSync());
		Thread t2 = new Thread(new ThreadSync());
		t1.setName("Fred ");
		t2.setName("Lucy ");
		t1.start();
		t2.start();
		
	}

}
