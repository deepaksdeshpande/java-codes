package oops;


class Animal {
	protected void eat() throws ArithmeticException {
		System.out.println("animal eating");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eating");
		super.eat();
	}
}

public class Overriding {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Animal a = new Dog();
		@SuppressWarnings("unused")
		Animal an = new Animal();
		//Dog d = (Dog)an;	//ClassCastException
		dog.eat();
		a.eat();
		//d.eat();
	}

}
