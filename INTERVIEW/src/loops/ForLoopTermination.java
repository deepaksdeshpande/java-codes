package loops;

public class ForLoopTermination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0; i<5; i++) {
			System.out.println("In the loop@@@");
			return;
		}
		System.out.println("Out of the loop@@@");*/
		
		for(int i=0; i<5; i++) {
			System.out.println("In  the loop...");
			break;
		}
		System.out.println("Out of the loop...");
		
		for(int i=0; i<5; i++) {
			System.out.println("In the loop !!!");
			System.exit(0);
		}
		System.out.println("Out of the loop !!!");

	}

}
