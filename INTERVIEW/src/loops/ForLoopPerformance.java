package loops;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ForLoopPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		System.out.println(Calendar.getInstance().getTimeInMillis());
		for(int i=0; i<10_000; i++) {
			list.add(i);
		}
		System.out.println(Calendar.getInstance().getTimeInMillis());
		
		System.out.println(Calendar.getInstance().getTimeInMillis());
		for(Integer e:list){
			//System.out.println(e);
		}
		System.out.println(Calendar.getInstance().getTimeInMillis());
	}

}
