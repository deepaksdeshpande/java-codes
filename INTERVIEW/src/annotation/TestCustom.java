package annotation;

public class TestCustom {
	@CustomAnnotation("deepak")
	void customRead() {
		System.out.println("Custom annotation is successful");
	}
	
	@CustomWithParam(id = 100, email = "deepaksd@cse.iitb.ac.in", 
			name = "Deepak", password = "abcdef")
	void customReadWithParam() {
		System.out.println("Custom annotaton with parameters successful");
	}
}
