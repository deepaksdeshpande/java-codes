package innerclasses;

class Popcorn1 {
	public void pop() {
		System.out.println("popping popcorn");
	}
}

class Food1 {
	Popcorn1 p1 = new Popcorn1() {
		public void pop() {
			System.out.println("Food poping");
		}
	};

	public void popFood() {
		p1.pop();
	}
}

public class AnonymousInnerClasses {

	public static void main(String[] args) {
		Food1 f1 = new Food1();
		f1.popFood();
	}
}
