package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MainClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		// TODO Auto-generated method stub
		TestCustom tc = new TestCustom();
		tc.customRead();
		tc.customReadWithParam();
		
		for(Method method: Class.forName("annotation.TestCustom").getMethods()) {
			if(method.isAnnotationPresent((Class<? extends Annotation>) annotation.TestCustom.class)) {
				for(Annotation annotation : annotation.TestCustom.class.getAnnotations()) {
					annotation.annotationType();
				}
			}
		}
	}

}
