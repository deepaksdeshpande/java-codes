package java7;

public class MultipleExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 9/0;
			System.out.println(a);
		}
		catch(NullPointerException | ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
