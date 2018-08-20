package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("1");
		set.add(2);
		set.add("3");
		set.add(null);
		set.add(null);
		Iterator it = set.iterator();
		System.out.println("HashSet Elements are: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set linkedSet = new LinkedHashSet();
		linkedSet.add("1");
		linkedSet.add(2);
		linkedSet.add("3");
		linkedSet.add(null);
		Iterator iter = linkedSet.iterator();
		System.out.println("LinkedHashSet elements are :");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		/*
		 * We can't add both integers and strings to a TreeSet. It will throw 
		 * a ClassCastException because when ever we add an element 
		 * to a TreeSet, it will make a comparison with the already existing 
		 * elements and SORT the elements in the natural order. 
		 * So, we can't compare an integer and a string. Hence, 
		 * the ClassCastException. 
		 * 
		 */
		Set treeSet = new TreeSet();
		treeSet.add("1");
		//treeSet.add(2);
		treeSet.add("3");
		Iterator itr = treeSet.iterator();
		System.out.println("Tree set elements are : ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		String s = "tRuE";
		if(Boolean.valueOf(s)==true) {
			System.out.println("true");
		}
		
	}

}
