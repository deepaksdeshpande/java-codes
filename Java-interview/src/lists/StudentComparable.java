package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparable implements Comparable<StudentComparable>{
	private int studentId;
	private String studentName;
	private String studentCity;

	public StudentComparable() {
		// TODO Auto-generated constructor stub
	}

	public StudentComparable(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", studentCity=" + studentCity + "]";
	}


	@Override
	public int compareTo(StudentComparable o) {
		// TODO Auto-generated method stub
		return this.getStudentName().compareTo(o.getStudentName());
	}
	
	public static void main(String[] args) {
		List<StudentComparable> slist = new ArrayList<StudentComparable>();
		slist.add(new StudentComparable(1, "vivek", "mumbai"));
		slist.add(new StudentComparable(2, "deepak", "mambai"));
		System.out.println("Unsorted : "+slist);
		Collections.sort(slist);
		System.out.println("Sorted : "+slist);
	}
}
