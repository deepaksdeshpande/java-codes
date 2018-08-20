package interview;

import java.util.Random;
import java.util.Scanner;

public class RaqndomNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0 ;i<10;i++)
		{
			Random r = new Random(10111980);
			System.out.println(r.nextInt(10));
		}
		
		double rand=0.1*23%5;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Generated Random No is : "+(int)(sc.nextInt()*rand));
		
	}
}
