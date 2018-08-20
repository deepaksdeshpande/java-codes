package oops;

public class RefCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Dog d = new Dog();
		
		/*
		 * This kind of casting is known as down casting as we are casting down the 
		 * inheritance tree to a more specific class type. Here, we are taking an 
		 * Animal type and casting it to a Dog type 
		 */
		Dog dog = (Dog)a;
		dog.eat();
		
		/*
		 * This kind of casting is known as up casting as we are casting up the 
		 * inheritance tree to a more general class type. Here, we are taking a 
		 * Dog type and casting it to an Animal type. This kind of casting happens 
		 * implicitly i.e. we don't need to cast explicitly.
		 */
		Animal an = (Animal) d;
		an.eat();
	}

}
