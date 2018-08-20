package innerclasses;

class Popcorn implements Eatable {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating popcorn");
	}
	
}

class Food {
	Popcorn p = new Popcorn() {
		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("Eating food anonymous");
		}
	};
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Eatable e = new Popcorn() {
			public void eat() {
				System.out.println("Eating popcorn...");
			}
			
			@SuppressWarnings("unused")
			public void drink() {
				System.out.println("Drinking popcorn");
			}
		};
		
		e.eat();
		//e.drink(); can't do this as Eatable interface doesn't have drink()
		
		Food f = new Food();
		f.p.eat();
	}
	
}
