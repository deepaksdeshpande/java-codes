package java7;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceForGenericInstance {

	public List<String> addElements(List<String> al) {
		System.out.println(al);
		return al;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		l.add("a");
		l.add("b");
		System.out.println(l);
		TypeInferenceForGenericInstance t = new TypeInferenceForGenericInstance();
		t.addElements(l);
	}

}
