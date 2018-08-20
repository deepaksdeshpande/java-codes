package oops;

abstract class Abst {
	Abst() {
		System.out.println("abstract const");
	}
	
	abstract void write();
	
	void read() {
		System.out.println("Reading");
	}
	
}

class AbstImpl extends Abst {
	@Override
	void write() {
		// TODO Auto-generated method stub
		System.out.println("Writing data...");
	}
}

public class AbstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstImpl a = new AbstImpl();
		a.read();
		a.write();
	}
}
