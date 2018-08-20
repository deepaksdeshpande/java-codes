package oops;

public class OverloadingType1 {
	
	public int add(int a, int b) {
		System.out.println("int");
		return a+b;
	}
	
	public int add(short a, short b) {
		System.out.println("short");
		return a+b;
	}
	
	public Integer add(Integer a, Integer b) {
		System.out.println("Ineteger");
		return a+b;
	}
	
	public int add(int... a) {
		System.out.println("int...");
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingType1 ot1 = new OverloadingType1();
		short a=3, b=6;
		ot1.add(2,  3);
		ot1.add(a, b);
		ot1.add(a);
		
		
	}

}
