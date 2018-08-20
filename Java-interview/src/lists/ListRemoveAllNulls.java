/**
 * 
 */
package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Deepak
 *
 */
public class ListRemoveAllNulls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add(null);
		list.add(null);
		System.out.println(list);
		list.removeAll(Collections.singleton(null));
		System.out.println(list);
	}

}
