package strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Original : "+s);
		char[] ch = s.toCharArray();
		
		String str="";
		for(int i=ch.length-1; i>=0; i--) {
			str=str+ch[i];
		}
		System.out.println("Reverse : "+str);
		
		if(s.equals(str)){
			System.out.println("The entered string is a plaindrome");
		}
		else {
			System.out.println("The entered string is not a plaindrome");
		}
	}

}
