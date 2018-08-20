package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TestGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("abc");
		list.add(12);
		list.add(new Object());
		System.out.println("Size of list is : "+list.size());
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			/*
			 * If the type of the variable value is anything
			 * other than Object we will need a cast.
			 */
			Object value = it.next();
			System.out.println(value.toString());
		}
	}

	
}
