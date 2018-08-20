package interview;

import java.util.Scanner;

public class Factorial {
	public int factorial(int n) {
		if(n==1) {
			return n;
		}
		else {
			int result = n*factorial(n-1);
			return result;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=0, result=0, fact=1;
		System.out.println("Enter the number to calculate factorial : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		result = new Factorial().factorial(no);
		System.out.println("Factroial of "+no+" is : "+result);
		
		
		//without using recursion
		
		for(int i=1; i<=no; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial without recursion is : "+fact);
	}

}
