package innerclasses;

public class MethodLocalInnerClass {
/*
 * A method local inner class can be instantiated and used only in the method 
 * in which it is declared.
 * 
 * A method local inner class can use private and any other variables declared
 * in the outer class.
 * 
 * A method local inner class cannot use the local variables of the method 
 * it is declared in.
 * 
 * A method local class can use only final variables of the method in which 
 * it is declared.
 */
	private int x = 10;
	
	public void displayGreetingMessage() {
		final int length=0;
		
		class Message {
			public void pringMessage() {
				System.out.println("Greetings from Method local inner class! "+x+" "+length);
			}
		}
		
		Message m = new Message();
		m.pringMessage();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLocalInnerClass mlic = new MethodLocalInnerClass();
		mlic.displayGreetingMessage();
	}

}
