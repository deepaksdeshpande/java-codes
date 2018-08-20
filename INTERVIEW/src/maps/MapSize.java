package maps;

import java.util.HashMap;
import java.util.Map;

public class MapSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("1",  "Deepak");
		map.put("2", "Muralee");
		map.put("3", "Vivek");
		System.out.println("Map size is : "+map.size());
		map.remove("3");
		System.out.println("Map size is : "+map.size());
		for(Map.Entry<String, String> m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
