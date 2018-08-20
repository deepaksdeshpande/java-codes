/**
 * 
 */
package oops;

/**
 * @author deepak
 *
 */
public class Overload {

	public int add(byte a, byte b) {
		System.out.println("in byte");
		return a+b;
	}
	
	public int add(short a, short b) {
		System.out.println("in primitive short");
		return a+b;
	}
	
	public int add(Short a, Short b) {
		System.out.println("in Short");
		return a+b;
	}
	
	public int add(int a, int b) {
		System.out.println("in int");
		return a+b;
	}
		
	public void disp(short a, short b) {
		System.out.println("disp short");
	}
	
	public void disp(Short a, Short b) {
		System.out.println("in wrapper short");
	}
	
	public void disp(int a, int b) {
		System.out.println("in int");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			byte a=7, b=7;
			@SuppressWarnings("unused")
			short c=8, d=8;
			@SuppressWarnings("unused")
			int e=9, f=9;
			Overload o = new Overload();
			o.add(a, c);		//byte, short
			o.add(c, b);		//Short short
			o.add(e, c);		//int   int
			
			o.disp(c, e);		//short int
			
	}

}
