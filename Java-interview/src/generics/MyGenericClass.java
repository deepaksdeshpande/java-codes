package generics;

class Custom<E, T> {
	private E e;
	private T t;
	
	public Custom() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean put(E e, T t){
		return true;
	}
	
	public T get(E e) {
		return t;
	}
}

public class MyGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Custom<String, String> c = new Custom<String, String>();
		c.put("a", "A");
		System.out.println("Added element is : "+c.get("a"));
	}

}
