package interview;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	        int x = 10;
	        int y = 20;
	        System.out.println("Before swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	        x = x+y;
	        y=x-y;
	        x=x-y;
	        System.out.println("After swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	      
	        
	        int[] arr = new int[]{2,3,4};
	        System.out.println(arr[-1]);	//this will throw an ArrayIndexOutOfBoundsException
	    }
}
