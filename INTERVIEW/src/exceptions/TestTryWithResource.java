package exceptions;

class MyClass implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
public class TestTryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (MyClass m = new MyClass();) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
