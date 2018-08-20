package maps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> ht = new Hashtable<String, String>();
		ht.put("1", "Deepak");
		ht.put("2", "Rishab");
		ht.put("3", "Vivek");
		ht.put("3", "gopi");
		ht.put("null", null);
		
		for(Map.Entry<String, String> hashTable: ht.entrySet()) {
			System.out.println(hashTable.getKey()+" "+hashTable.getValue());
		}
		
		Set<Entry<String, String>> set = ht.entrySet();
		
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
