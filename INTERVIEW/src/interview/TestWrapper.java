package interview;

public class TestWrapper {
	
	public static Integer getInt() {
		return null;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getInt().valueOf(1234));
	}

}
