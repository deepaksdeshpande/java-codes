package collections;

import java.util.HashSet;
import java.util.Set;

class A {
	
}

class B extends A {
	
}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<A> set = new HashSet<>();
		set.add(new A());
		set.add(new B());
		System.out.println(set);
	}

}
