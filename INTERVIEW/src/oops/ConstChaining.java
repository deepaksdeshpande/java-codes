package oops;

class Vehicle1 {
	Vehicle1() {
		this("hello");
		System.out.println("no-arg vehicle");
	}
	
	Vehicle1(String name) {
		super();
		System.out.println("1-arg vehicle");
	}
}

class Car1 extends Vehicle1 {
	Car1() {
		this("hi");
		System.out.println("No-arg car");
	}
	
	Car1(String name) {
		super();
		System.out.println("1-arg car");
	}
}

class Ferrari extends Car1 {
	Ferrari() {
		this("Fine");
		System.out.println("No-arg ferrari");
	}
	
	Ferrari(String color) {
		super();
		System.out.println("1-arg ferrari");
	}
}

public class ConstChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ferrari f = new Ferrari("Deepak");
	}

}
