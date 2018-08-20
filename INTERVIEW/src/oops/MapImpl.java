package oops;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Rishab");
		map.put(2, "vivek");
		map.put(3,  "Dinesh");
		map.put(4,  "Deepak");
		
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		
		
	}

}
