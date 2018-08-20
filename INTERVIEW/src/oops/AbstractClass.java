package oops;

abstract class AbsTest {
	
	@SuppressWarnings("unused")
	private int name;
	
	public abstract void read(String name);
	
	public void write() {
		System.out.println("writing from an abstract class");
	}
	
	public static void sayHi() {
		System.out.println("saying hi from a static method in an abstract class");
	}
}

class AbsTestImpl extends AbsTest {
	@Override
	public void read(String name) {
		// TODO Auto-generated method stub
		System.out.println("reading your name : " +name);
	}
	
}

public class AbstractClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Abstract classes have a constructor, but they cannot be used to
		 * instantiate the class. The purpose of having a constructor in an
		 * Abstract class is that it can instantiate variables defined inside
		 * the abstract class and it can be used for constructor chaining while
		 * a concrete class which extends the abstract class can have the values
		 * of the instance variables defined in the class.
		 * 
		 * An abstract class can never be instantiated even if doesn't contain
		 * any abstract methods as by marking a class abstract, we are telling
		 * the compiler that the class is incomplete and so it shouldn't be
		 * instantiated.
		 * 
		 * As we can't write a constructor in an Abstract class, the compiler
		 * will put a default no-arg constructor for the Abstract class.
		 * 
		 * Abstract classes can implement interfaces. Since the methods of an
		 * interface are implicitly public and abstract they need not be
		 * implemented in the abstract class.
		 * 
		 * Abstract class cannot be final, because final stops the class from
		 * being extended.
		 * 
		 * Abstract class can have static methods in them. but they can't be
		 * considered for overriding as only instance methods can be over
		 * ridden.
		 */
		
		//AbsTest at = new AbsTest();	
		AbsTestImpl ati = new AbsTestImpl();
		ati.read("deepak");
		ati.write();
		AbsTest.sayHi();
	}

}
