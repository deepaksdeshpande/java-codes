package java7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	
	public TryWithResources() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		String s="";
		try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		} 
		
	}

}
