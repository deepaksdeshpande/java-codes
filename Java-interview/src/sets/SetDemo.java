package sets;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("abc");
		set.add("def");
		set.add(null);
		set.add(null);
		System.out.println(set);
	}

}
