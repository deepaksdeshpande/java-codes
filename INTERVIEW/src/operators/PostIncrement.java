package operators;

public class PostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int result = i++;	//value incremented but not assigned to result var.
		System.out.println("value of i is : "+result);
		result=i;	//the incremented value of i is assigned to result as it is used once
		System.out.println("Value of i is : "+result);
		
	}

}
