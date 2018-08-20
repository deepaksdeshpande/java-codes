package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Collar {
	private int size;

	public Collar(int size) {
		super();
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
	private static final long serialVersionUID = 1L;
	private String name;
	private transient Collar collar;
	public Dog(String name, Collar collar) {
		this.name = name;
		this.collar = collar;
		// TODO Auto-generated constructor stub
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
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeInt(collar.getSize());
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		Collar collar = new Collar(ois.readInt());
	}
	
}

public class SerialTransient {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Dog d = new Dog("Fido", new Collar(40));

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial.txt"));
			System.out.println("Before serialization : "+d.getName()+" "+d.getCollar().getSize());
			oos.writeObject(d);
			oos.flush();
			oos.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream ios = new ObjectInputStream(new FileInputStream("serial.txt"));
			Dog dog = (Dog) ios.readObject();
			System.out.println("After Deserialization : "+dog.getName()+" "+dog.getCollar().getSize());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
