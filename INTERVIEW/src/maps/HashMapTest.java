package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Deepak");
		map.put("2",  "Rishab");
		map.put("3", "Vivek");
		map.put("3", "Gopi");
		map.put(null, null);
		map.put(null, null);
		
		for(Map.Entry<String, String> m: map.entrySet()) {
			System.out.println("key : "+m.getKey()+" value : "+m.getValue());
		}
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		
		Iterator<Entry<String, String>> it = entrySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
