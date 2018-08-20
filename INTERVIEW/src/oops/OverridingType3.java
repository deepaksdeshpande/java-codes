package oops;

class Animal3 {
	void eat() {
		System.out.println("Animal eating");
	}
}

class Dog3 extends Animal3 {
	/*
	 * Access specifier of the overriding method can be less restrictive that that
	 * of the overridden method.
	 */
	
	public void eat() {
		System.out.println("Dog eating");
	}
}

public class OverridingType3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal3 a = new Dog3();
		a.eat();
		
	}

}
