package oops;

class A {
	void read() {
		System.out.println("A reading");
	}
}

class B extends A {
	void read() {
		System.out.println("B reading");
	}
}

class C extends B {
	void read() {
		System.out.println("C reading");
	}
}

public class ObjectInheritanceCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();
		
		A ab = new B();	//object of type B
		B bc = new C();	//Object of type C
		
		//C ca = (C) ab;
		//ca.read();	//will throw a ClassCastException.
		
		//C ca = (A) ab;	This will not compile only as we can't assign an object of
		//type B to a reference variable of type C. we can do the opposite assignment
		
		A aa = bc;
		bc.read();
	}

}
