package java7;

import java.io.IOException;

class CustomResource implements AutoCloseable {

	public void accessResource() {
		System.out.println("Accessing resource");
	}
	
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Resource closed successfully");
	}
	
}
public class TryWithResources1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (CustomResource cr = new CustomResource()) {
			cr.accessResource();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
