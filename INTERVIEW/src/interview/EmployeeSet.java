/**
 * 
 */
package interview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Deepak Deshpande
 *
 */
public class EmployeeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "deepak");
		Employee e2 = new Employee(1, "deepak");
		Set<Employee> set = new HashSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e1);
		set.add(e2);
		System.out.println(set.size());
		System.out.println(set.contains(e1));
		System.out.println(set.contains(e2));
		Iterator<Employee> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
