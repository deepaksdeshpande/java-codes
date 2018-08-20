package exceptions;

public class FinallyNotExecuting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("In try");
			System.exit(0);
			int a = 2+2/0;
		}
		catch(ArithmeticException e) {
			System.out.println("In catch");
			e.printStackTrace();
		}
		finally {
			System.out.println("In finally");
		}
	}

}
