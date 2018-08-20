package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Using Regex to find the special character in a string
		 */
		String str = "abcdefghijklmnopqrstuvwxyz!@#$%^&*():{}<>?;_=";
		Pattern p = Pattern.compile("[^a-zA-Z]");
		Matcher m = p.matcher(str);
		while(m.find()) {
			System.out.println("Special character found at position : "+m.start()+" and character "+m.group());
		}
		
		/*
		 * Using the Character class to find a special character in the string
		 */
		
		char[] c = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			if(Character.isLetterOrDigit(c[i])) {
				System.out.println("The charracter "+c[i]+" is not a special character");
			}
			else {
				System.out.println("The character "+c[i]+" is a special character");
			}
		}
	
	}
}
