package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(null, null);
		map.put(null, "Hi");
		map.put(null, "Hello");
		map.put(1, null);
		map.put(2, null);
		map.put(null, null);
		
		
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		
	}
}
