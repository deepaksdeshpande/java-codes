package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MarksInfo implements Comparator<MarksInfo> {

	private int id;
	private String totalMarks;
	
	public MarksInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MarksInfo(int id, String totalMarks) {
		super();
		this.id = id;
		this.totalMarks = totalMarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(String totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "MarksInfo [id=" + id + ", totalMarks=" + totalMarks + "]";
	}

	@Override
	public int compare(MarksInfo m1, MarksInfo m2) {
		// TODO Auto-generated method stub
		return m1.getTotalMarks().compareTo(m2.getTotalMarks());
	}
}

public class ComparatorInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<MarksInfo> list = new ArrayList<MarksInfo>();
		list.add(new MarksInfo(1, "abc"));
		list.add(new MarksInfo(2, "cba"));
		list.add(new MarksInfo(3, "zab"));
		list.add(new MarksInfo(4, "bca"));
		System.out.println("Marks Info unsorted : "+list);
		Collections.sort(list, new MarksInfo());
		System.out.println("Sorted list is : "+list);
	}

}
