package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Collar implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2851308042717569027L;
	private int size;
	Collar(int size) {
		this.setSize(size);
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}

class Dog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1699552774140294280L;
	
	private Collar collar;
	private String name; 
	Dog(String name, Collar collar) {
		this.setName(name);
		this.setCollar(collar);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collar getCollar() {
		return collar;
	}
	public void setCollar(Collar collar) {
		this.collar = collar;
	}
}

public class TestSerialWithObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collar c = new Collar(10);
		Dog d = new Dog("Fido", c);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ObjectSerial.txt"));
			System.out.println("Before Serialization the values are : ");
			System.out.println(d.getName());
			System.out.println(d.getCollar().getSize());
			oos.writeObject(d);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjectSerial.txt"));
			Dog dog = (Dog) ois.readObject(); 
			System.out.println("After De-Serialization the values are : ");
			System.out.println(dog.getName());
			System.out.println(dog.getCollar().getSize());
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
