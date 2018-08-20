package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cat implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -113653853622217666L;
	
	private String sound;
	private int intensity;
	
	public Cat(String sound, int intensity) {
		// TODO Auto-generated constructor stub
		this.sound = sound;
		this.setIntensity(intensity);
	}
		
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}
}

public class TestSerialWithPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat("Meow", 90);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TestSerial.txt"));
			System.out.println("Before serialization sound and intensity is : "+c.getSound()+" "+c.getIntensity());
			oos.writeObject(c);
			oos.flush();
			oos.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("TestSerial.txt"));
			Cat cat = (Cat) ois.readObject();
			System.out.println("After de-serialization the sound and intensity is : "+cat.getSound()+" "+cat.getIntensity());
			ois.close();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		

		
	}
}
