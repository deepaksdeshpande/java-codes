/**
 * 
 */
package packb;
import packa.Vehicle;
/**
 * @author deepak
 *
 */
public class Car extends Vehicle {
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
		System.out.println("Value of protected variable is : "+c.x);
		/*
		 * Since the Class Vehicle's drive method and the instance are protected, we cannot
		 * just create an instance of the Vehicle class and access the drive() method.
		 * Instead, we have to subclass it and that subclass can access the drive() method
		 * using it's own instance.
		 * 
		 * WE CAN'T DO THIS.
		 * 
		 * Vehicle v = new Vehicle()
		 * v.drive();
		 * 
		 * We can access PROTECTED instances and METHODS ONLY through inheritance.
		 * 
		 */
	}
}
