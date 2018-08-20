/**
 * 
 */
package interview;

/**
 * @author Deepak Deshpande
 *
 */
public class StaticAndNonStatic {

	public static void read() {
		System.out.println("reading static");
	}
	
	public void write() {
		read();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticAndNonStatic s = new StaticAndNonStatic();
		s.write();
	}

}
