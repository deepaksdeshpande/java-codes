package exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Java7Exceptions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 1 / 1;
			System.out.println("x is : "+x);
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}
/*
 * The resource used in the brackets for the try will be automatically closed
 */
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(
				new FileWriter("testException.txt")))) {
			pw.print("Hi");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
