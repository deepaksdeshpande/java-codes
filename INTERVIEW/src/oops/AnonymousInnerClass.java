package oops;

abstract class Display implements Displayable {

}


public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Displayable d = new Display() {

			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Displaying something");
			}
			
		};
	}

}
