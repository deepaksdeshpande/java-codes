package innerclasses;
/*
 * A static nested class does not have access to non-static members and 
 * variables of the outer class just like the way static methods do not have 
 * access to non-static instances of a class.
 */
class TestStatic {
	static class Nest {
		void display(){
			System.out.println("static nested class");
		}
	}
}

class Broom {
	static class BroomUser {
		void use() {
			System.out.println("Use broom");
		}
	}
}

public class StaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic.Nest n = new TestStatic.Nest();
		n.display();
		
		Broom.BroomUser b = new Broom.BroomUser();
		b.use();
	}

}
