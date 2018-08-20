package innerclasses;

class Vegetable {
	public void displayEatableVegetables(Eatable e) {
		e.eat();
		System.out.println("Carrot, Beans, Tomato, Potato, Onion, Garlic, Ginger");
	}
}


public class ArgDefAnonymousInnerClass {
	public static void main(String[] args) {
		Vegetable v = new Vegetable();
		v.displayEatableVegetables(new Eatable() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("Displaying all eatable vegetable names : ");
			}
		
		});
	}
}
