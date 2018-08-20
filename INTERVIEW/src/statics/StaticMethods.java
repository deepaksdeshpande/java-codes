package statics;

class Stat {
	static void abc() {
		System.out.println("super abc");
	}
	
	void read() {
		System.out.println("super read");
	}
}

public class StaticMethods extends Stat{
	
	static void abc() {
		System.out.println("sub abc");
	}
	
	void read() {
		System.out.println("sub read");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethods s = new StaticMethods();
		Stat st = new Stat();
		Stat stat = new StaticMethods();
		s.abc();
		st.abc();
		stat.abc();		//sub abc but super abc
		stat.read();	//sub read
		StaticMethods.abc();
	}

}
