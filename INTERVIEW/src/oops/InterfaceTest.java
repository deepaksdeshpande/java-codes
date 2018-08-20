package oops;

interface Testable {
	public static final int testResult=10;
	public abstract void startTesting();
}
public class InterfaceTest implements Testable {

	@Override
	public void startTesting() {
		// TODO Auto-generated method stub
		System.out.println("Start testing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTest it = new InterfaceTest();
		it.startTesting();
		int result = Testable.testResult;
		System.out.println(result);
		
		Testable t = new InterfaceTest();
		t.startTesting();
		int res = Testable.testResult;
		System.out.println(res);
	}

}
