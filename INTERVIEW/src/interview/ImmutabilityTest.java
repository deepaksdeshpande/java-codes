package interview;

final class ImmutableEmployee {
	private final int id;
	private final String name;
	private final String emailId;
	
	private ImmutableEmployee(int id, String name, String emailId) {
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}
	
	
	
	public final int getId() {
		return id;
	}
	
	public final String getName() {
		return name;
	}
	
	
	
	public final String getEmailId() {
		return emailId;
	}
	
	public static ImmutableEmployee getInstance(int id, String name, String emailId) {
		return new ImmutableEmployee(id, name, emailId);
	}
	
}


public class ImmutabilityTest {

	public static void main(String[] args) {
		ImmutableEmployee e = ImmutableEmployee.getInstance(100, "Deepak", "deepaksd@cse.iitb.ac.in");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getEmailId());
	}
}
