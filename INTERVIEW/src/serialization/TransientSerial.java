package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Collar1 {
	private int size;
	Collar1(int size) {
		this.setSize(size);
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}

class Dog1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1699552774140294280L;
	
	transient private Collar1 collar;
	private String name; 
	
	Dog1(String name, Collar1 collar) {
		this.name = name;
		this.collar = collar;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Collar1 getCollar1() {
		return collar;
	}
	
	public void setCollar1(Collar1 collar) {
		this.collar = collar;
	}
	
	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			oos.writeInt(collar.getSize());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			@SuppressWarnings("unused")
			Collar1 c = new Collar1(ois.readInt());
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


public class TransientSerial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collar1 c = new Collar1(10);
		Dog1 d = new Dog1("Fido", c);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TransientSerial.txt"));
			System.out.println("Before Serialization the values are : ");
			System.out.println(d.getName());
			System.out.println(d.getCollar1().getSize());
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
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("TransientSerial.txt"));
			Dog1 dog = (Dog1) ois.readObject(); 
			System.out.println("After De-Serialization the values are : ");
			System.out.println(dog.getName());
			System.out.println(dog.getCollar1());
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
