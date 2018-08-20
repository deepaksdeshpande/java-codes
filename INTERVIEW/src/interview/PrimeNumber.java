package interview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int count=0;
		System.out.println("Enter the number of prime numbers you want : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=2; i<=n; i++) {
			if(i==2 || i==3 || i==5 || i==7) {
				System.out.println(i+ " is prime");
				count++;
			}
			
			else if(i%2==0 || i%3==0 || i%4==0 || i%5==0||i%7==0) {
				//System.out.println(i+" Not prime");
			}
			
			else {
				System.out.println(i+ " is prime");
				count++;
			}
		}
		System.out.println("The number of prime numbers between 1 and "+n+" is : "+count);
	}

}
