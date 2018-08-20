package strings;

public class EqualsEqualToTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		String s2=s1;
		String s3="abc";
				
		if(s1==s2 & s1==s3 & s2==s3) {
			System.out.println("==is true");
		}
		else {
			System.out.println("== is false");
		}
		
		if(s1.equals(s2) & s1.equals(s3) & s2.equals(s3)) {
			System.out.println("equals() is true");
		}
		else {
			System.out.println("equals() is false");
		}
		
		String s4 = new String("abc");
		String s5 = new String("abc");
		String s6 = s5;
		
		if(s4==s5 & s4==s6 & s5==s6) {
			System.out.println("== is true");
		}
		else {
			System.out.println("== is false");
		}
		
		String s7="Ram";
		s7 = s7+"Kumar";
		String s8 = "RamKumar";
		if(s7==s8) {
			System.out.println("RamKumar");
		}
		else {
			System.out.println("!RamKumar");
		}
	}

}
