package maps;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("a", "1");
		map.put("b", "2");
		map.put("b", "3");	// 2 will be replaced by 3
		System.out.println(map.get("1"));
		System.out.println(map.get("b"));
	}

}
