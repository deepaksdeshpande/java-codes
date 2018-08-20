package oops;

class Animal1 {
	void eat() {
		System.out.println("Animal eating");
	}
}

class Dog1 extends Animal1 {
	void eat() {
		System.out.println("Dog eating");
	}
}
public class OverridingType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 a = new Dog1();
		a.eat();
	}

}
