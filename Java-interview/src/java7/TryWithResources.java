package java7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (PrintWriter pw = new PrintWriter(new FileWriter(new File("TryWithResources.txt")))) {
			pw.print("Added a new line of text");		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File("TryWithResources.txt")))) {
			String str = new String();
			while((str = br.readLine())!=null) {
				System.out.println("From File : "+str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
