package java7;

public class StringInSwitchStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		switch(s.toString()) {
		case "abc": System.out.println(s);
				break;
		case "def": System.out.println("def");
				break;
		}
		
		switch(s.charAt(0)) {
		case 97 : System.out.println("a");	//can use the ascii value of 'a'
			break;
		
		case 'b' : System.out.println("b");
			break;
		}
	}

}
