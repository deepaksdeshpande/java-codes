package operators;

public class PreIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int result = ++i;	//the value of i is incremented and assigned to result var before use
		System.out.println("The value of i is : "+result);
		result = i;
		System.out.println("The value of i is : "+result);
	}

}
