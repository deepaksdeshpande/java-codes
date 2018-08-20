package oops;

import java.io.FileNotFoundException;

class AnimalA5 {
	void eat() throws FileNotFoundException {
		System.out.println("Animal eating");
	}
}

class DogD5 extends AnimalA5 {
	/*
	 * The overriding method Must not throw any new or broader checked
	 * exceptions than the ones thrown by the overridden method.
	 * 
	 * It can throw narrower or fewer exceptions than those thrown by the
	 * overridden method.
	 */

	public void eat() {
		System.out.println("Dog eating");
	}
}

public class OverridingType5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalA5 a = new DogD5();
		try {
			a.eat();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
