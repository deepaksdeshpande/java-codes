package oops;

class Horse extends Animal {
	
}

public class OverloadingType2 {

	public void makeNoise(Animal a) {
		System.out.println("Animal");
	}
	
	public void makeNoise(Horse h) {
		System.out.println("Horse");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Horse h = new Horse();
		Animal an = new Horse();
		Horse ho = (Horse) an;	//'an' is a horse object so No ClassCastException!
		
		OverloadingType2 ot2 = new OverloadingType2();
		ot2.makeNoise(an);	//will invoke animal only as overloading resolves at compile time
		ot2.makeNoise(h);
		ot2.makeNoise(ho);
		ot2.makeNoise(a);
		
	}

}
