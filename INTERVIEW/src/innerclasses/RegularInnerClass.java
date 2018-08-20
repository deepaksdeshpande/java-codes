package innerclasses;
/*
 * A regular inner class should not have anything that is static,
 * except for constants that are static and final. Even methods can't be
 * marked static and final.
 * 
 */
class MyOuter {
	int x=10;
	static int y=20;
	
	MyOuter() {
		System.out.println("Outer class constructor");
	}
	
	public static void read() {
		System.out.println("Static variable in outer class is  : "+y);
	}
	
	class MyInner {
		MyInner() {
			System.out.println("Inner class Constructor");
		}
		
		int i=30;
		static final int j=40;
		
		public void readInnerVaribale() {
			System.out.println("Inner class variable is : "+i);
		}
		
		public void readOuterVaribale() {
			System.out.println("Outer class variable is : "+x);
		}
		
		void write() {
			System.out.println("Writing in inner class : "+j);
		}
	}
}

public class RegularInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOuter.MyInner inout = new MyOuter().new MyInner();
		inout.readOuterVaribale();
		inout.readInnerVaribale();
		inout.write();
		
		MyOuter.read();
	}
}
