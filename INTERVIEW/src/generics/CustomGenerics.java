package generics;

class MyClass<E, T> {
	private E e;
	private T t;
	
	public boolean add(E e) {
		return true;
	}
	
	public E get(int i) {
		return e;
	}

	@Override
	public String toString() {
		return "MyClass [e=" + e + ", t=" + t + "]";
	}

}

public class CustomGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass<String, String> myclass = new MyClass<String, String>();
		myclass.add("1");
		
		System.out.println(myclass.get(1));
	}

}
