package exceptions;

public class TestFinally {
	
	public int read() {
		try{
			System.out.println("In try");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("In catch");
		}
		finally {
			System.out.println("In finally");
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFinally tf = new TestFinally();
		tf.read();

	}

}
