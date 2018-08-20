package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsLegacyMixing {

	public List adder(List a) {
		/*
		 * a.add("abc"); //throws a ClassCastException
		 */
		Iterator i = a.iterator();
		int total = 0;
		while(i.hasNext()) {
			total = total+(Integer) i.next();
		}
		System.out.println("Sum of the elements in the list is : "+total);
		return a;
	}
	
	public List inserter(List ll) {
			ll.add("abc");
			ll.add(new Object());
			/*
			 * here, nothing is preventing me from adding a string
			 * or an object to my supposedly type-safe integer array
			 * list.
			 * 
			 * The compiler will compile the code properly and execute 
			 * the code also properly, but  warns us that we are adding 
			 * something to our non type-safe legacy collection.
			 * 
			 * Recompile with -Xlint:unchecked for details.
			 * 
			 * The compiler does NOT know whether the inserter()
			 * method is adding the right thing (Integer) or 
			 * wrong thing (String or Object). The reason the 
			 * compiler produces a warning is because the 
			 * method is ADDING something to the collection! 
			 * In other words, the compiler knows there's a 
			 * chance the method might add the wrong thing to 
			 * a collection the caller thinks is type safe.
			 * 
			 * This works at runtime because the JVM removes 
			 * all the generic type safety at runtime through 
			 * a process called type erasure. Generic type 
			 * safety is for the compiler. At runtime both
			 * legacy and non-legacy(generics) code is the same. 
			 * 
			 */
			System.out.println("Elements of the list are : "+ll);
			return ll;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		
		GenericsLegacyMixing g = new GenericsLegacyMixing();
		g.adder(l);
		g.inserter(l);
	}

}
