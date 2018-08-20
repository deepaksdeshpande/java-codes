package statics;

class NullType {
	static void invokeWithNullReference() {
		System.out.println("Success");
	}
}

public class InvokeWithNull {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		NullType n = null;
		n.invokeWithNullReference();
	}

}
