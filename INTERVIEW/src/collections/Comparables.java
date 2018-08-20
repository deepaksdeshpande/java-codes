package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {

	private String name;
	private String location;
	private int age;
	
	public Person(String name, String location, int age) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", location=" + location + ", age="
				+ age + "]";
	}

	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(p.getName());
	}
	
}

public class Comparables {

	public Comparables() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<> ();
		pList.add(new Person("deepak", "mumbai", 32));
		pList.add(new Person("rishab", "mumbai", 24));
		pList.add(new Person("vivek", "mumbai", 27));
		pList.add(new Person("dinesh", "mumbai", 27));
		System.out.println("Unsorted : "+pList);
		Collections.sort(pList);
		System.out.println("Sorted List : "+pList);
	}

}
