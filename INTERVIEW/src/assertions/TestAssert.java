package assertions;

public class TestAssert {

	private void testMethod(int num) {
		assert(num>0);
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestAssert().testMethod(1);
		
	}

}
