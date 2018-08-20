package oops;

class Animal4 {
	void eat() {
		System.out.println("Animal eating");
	}
}

class Dog4 extends Animal4 {
	/*
	 * The overriding method can throw any runtime exceptions regardless of whether the
	 * overridden method throws it or not.
	 */
	
	public void eat() throws ClassCastException {
		System.out.println("Dog eating");
	}
}

public class OverridingType4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal4 a = new Dog4();
		a.eat();
	}

}
