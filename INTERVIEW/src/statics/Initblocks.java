package statics;

import java.util.ArrayList;
import java.util.List;

public class Initblocks {
	private static int i=1;
	private int j;
	static List<Cars> cars = new ArrayList<Cars>();
	{
		i=5;
		j=10;
		cars.add(new Ferrari());
		cars.add(new Lamborghini());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i is : "+i+" j is : "+new Initblocks().j);
		System.out.println("Cars has "+cars.size()+" elements");
	}

}
