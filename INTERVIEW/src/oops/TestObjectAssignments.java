package oops;

class AA {
	void hello() {
		System.out.println("AA");
	}
	
}

class BB extends AA { 
	void hello() {
		System.out.println("BB");
	}
	
}
 
class CC {
	void hello() {
		System.out.println("CC");
	}
}

class DD extends CC {

	public void hello() {
		System.out.println("DD");
	} 
}

public class TestObjectAssignments {
	public static void main(String[] args) {
		AA aa = new AA();
		AA ab = new BB();
		BB bb = new BB();
		CC cc = new CC();
		CC cd = new DD();
		DD dd = new DD();
		
		BB newab = (BB)ab; 
		newab.hello();
		
		AA newaa = ab;
		newaa.hello();
		
		DD newdd = (DD) cd;
		newdd.hello();
		
	}
}
