package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator<Employee> {
	private int empId;
	private String empName;
	private int empSalary;
	
	public Employee(int empId, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSalary=" + empSalary + "]";
	}

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getEmpName().compareTo(e2.getEmpName());
	}

}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(10, "deepak", 40000));
		list.add(new Employee(1, "dinesh", 10000));
		list.add(new Employee(20, "vivek", 35000));
		list.add(new Employee(3, "rishab", 20000));
		System.out.println("Unsorted list is : "+list);
		
		Collections.sort(list, employee);
		
		System.out.println("List sorted by salary is : "+list);
	}

}
