/**
 * 
 */
package maps;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Deepak
 *
 */
public class MapIterating {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "abc");
		map.put("2", "def");
		map.put("3", "ghi");
		for(Map.Entry<String, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
