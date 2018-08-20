package collections;

import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable t = new Hashtable();
		//t.put(null, "hi");
		//t.put(null, "Hello");
		/*
		 * A hashtable contains basically a key/value pair
		 * we cannot put anything null(key or the value) into a hashtable.
		 * If we put anything null then the hashtable will throw a 
		 * NullPointerException.
		 */
		t.put("key", "How");
		t.put("key1", "are");
		System.out.println(t.values());
		System.out.println(t.keys());
		System.out.println(t.keySet());
		System.out.println(t.entrySet());
	}

}
