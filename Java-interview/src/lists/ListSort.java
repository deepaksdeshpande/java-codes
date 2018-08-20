package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("< A>");
		list.add("< a>");
		list.add("<Aa>");
		list.add("<aA>");
		list.add("<A >");
		Collections.sort(list);
		System.out.println(list);
		/*
		 * first spaces, then capitals then small case
		 */
	}

}
