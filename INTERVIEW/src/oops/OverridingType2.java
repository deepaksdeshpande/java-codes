package oops;

class Animal2 {
	public void eat() {
		System.out.println("Animal eating");
	}
}

class Dog2 extends Animal2 {
	/*
	 * Access specifier of the overriding method cannot be more restrictive than that
	 * of the overridden method.  
	 */

	/*void eat() {
		System.out.println("Dog eating");
	}*/
}

public class OverridingType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 a = new Dog2();
		a.eat();
	}

}
