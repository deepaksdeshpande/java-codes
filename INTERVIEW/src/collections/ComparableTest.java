/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int marks;
	
	Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.setMarks(marks);
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.marks-s.marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks
				+ "]";
	}

}
/**
 * @author deepak
 *
 */
public class ComparableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Deepak", 30);
		Student s2 = new Student(2, "Rishab", 50);
		Student s3 = new Student(3, "Dinesh", 10);
		Student s4 = new Student(4, "Vivek", 20);
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println("Unsorted list is : "+list);
		Collections.sort(list);
		System.out.println("Sorted list according to marks is "+list);
	}

}
