package interview;

public class Employee {
	private int id;
	private String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
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
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public int hashCode() {
		return id*2;
	}
	
	/*public boolean equals(Object o) {
		Employee e = (Employee) o;
		if(o instanceof Object && e.getName()== e.getName())
		return true;
		else {
			return false;
		}
	}
	*/

}
