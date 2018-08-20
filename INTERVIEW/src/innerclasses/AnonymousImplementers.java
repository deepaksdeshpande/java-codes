package innerclasses;

class CookType {
	public void cookingStyle(Cookable c) {
		System.out.println("Cooking style");
	}
}

class Foodie {
	Cookable c = new Cookable() {
		public void cook() {
			System.out.println("Foodie cooking");
		}
	};
	
	public void implementer() {
		c.cook();
	}
	
}

public class AnonymousImplementers {
	public static void main(String[] args) {
		Foodie f = new Foodie();
		f.implementer();
		
		CookType ct = new CookType();
		ct.cookingStyle(new Cookable() {

			@Override
			public void cook() {
				// TODO Auto-generated method stub
				System.out.println("Argument defined anonymous inner class");
			}
			
		});
		
	}
}
