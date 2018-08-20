package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudInfo implements Comparable<StudInfo> {

	private int id;
	private String name;
	
	public StudInfo(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "StudInfo [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(StudInfo s) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(s.getName());
	}
	
}

public class ComparableInterfaceDemo {
	
	public static void main(String[] args) {
		List<StudInfo> list = new ArrayList<>();
		list.add(new StudInfo(1, "Deepak"));
		list.add(new StudInfo(2, "Rishab"));
		list.add(new StudInfo(3, "Vivek"));
		list.add(new StudInfo(4, "Dinesh"));
		list.add(new StudInfo(5, "Muralee"));
		System.out.println("Unsorted List is : "+list);
		Collections.sort(list);
		System.out.println("Sorted list : "+list);
	}

}
