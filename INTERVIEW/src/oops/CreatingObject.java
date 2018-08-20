package oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CreatingObject implements Serializable, Cloneable {
	
	public void test() {
		System.out.println("Object created successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1st way : using the new
		 */
		CreatingObject cb = new CreatingObject();
		cb.test();
		
		/*
		 * 2nd way : using class.forName
		 */
		try {
			CreatingObject cobj = (CreatingObject) Class.forName("oops.CreatingObject").newInstance();
			cobj.test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * 3rd way: using clone() method
		 */
		
		try {
			CreatingObject cobj1 = (CreatingObject) cb.clone();
			cobj1.test();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * 4th way: Using de-serialization
		 */
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ObjectCreation.txt"));
			oos.writeObject(cb);
			oos.flush();
			oos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjectCreation.txt"));
			CreatingObject creatingObject = (CreatingObject) ois.readObject();
			creatingObject.test();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
