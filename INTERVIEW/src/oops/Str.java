package oops;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		String s= "abc";
		sb.insert(0, s);
		s = sb.reverse().toString();
		System.out.println(s);
		
		String s1="abc";
		String s2 = s1.concat("def").replace('c', 'X').toUpperCase().substring(2, 4);
		System.out.println(s2);
		System.out.println(s2.indexOf('X'));
		
		String str1 = "ram";
		str1 = str1+"kumar";
		String str2 = "ramkumar";
		
		System.out.println(str1+" "+str2);
		
		if(str1==str2) {
			System.out.println("references are the same");
		}
		else {
			System.out.println("references are different");
		}
		
		if(str1.equals(str2)) {
			System.out.println("Contents are equal");
		}
		else {
			System.out.println("Contents are different");
		}
	}

}
