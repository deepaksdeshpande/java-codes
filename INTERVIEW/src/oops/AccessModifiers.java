/**
 * 
 */
package oops;

import packa.*;
import packb.ClassB;
/**
 * @author deepak
 *
 */

public class AccessModifiers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB cb = new ClassB();
		cb.display();
		
		ClassA ca = new ClassA();
		ca.read();
		
		/*
		 * ClassAA caa = new ClassAA();
		 */
		// ClassAA is not visible from the package packa as ClassAA has a default access modifier
		// even if the CLassAA has public methods and instance variables they cannot be accessed 
		// outside the package.
	}

}
