package generics;

import java.util.ArrayList;
import java.util.List;

class Animal {
	
}

class Dog extends Animal {
	
}

class Bird extends Animal {
	
}

class Leopard extends Animal {
	
}

public class GenericPolymorphism {
	
	public List<Animal> addElements(List<Animal> animal) {
		List<Dog> d = new ArrayList<Dog>();
		/*
		 * here we can't return a list of type Dog. This
		 * will throw a compiler error. In fact we can't return
		 * anything that is not a type of List<Animal>
		 */
		animal.add(new Dog());
		animal.add(new Bird());
		animal.add(new Leopard());
		return animal;
	}
	
	public void addAnimals(List<Animal> animal) {
		animal.add(new Dog());
		animal.add(new Bird());
		animal.add(new Leopard());
	}
	
	public void addAnimals(Animal[] d) {
		d[0] = new Dog();
		d[1] = new Dog();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Animal> list = new ArrayList<Animal>();
		list.add(new Dog());
		list.add(new Bird());
		list.add(new Leopard());
		System.out.println("Size of list is : "+list.size());
		
		GenericPolymorphism gp = new GenericPolymorphism();
		gp.addElements(list);
		
		System.out.println("After adding elements size is : "+list.size());
		
		List<Dog> dog = new ArrayList<Dog>();
		dog.add(new Dog());
		/*
		 * dog.add(new Bird());
		 * 
		 * The only thing that is allowed in a collection of 
		 * type Dog is a Dog or any instance of a subtype of
		 * Dog. 
		 */
		
		/*
		 * gp.addAnimals(dog);
		 * 
		 * We cannot pass in an ArrayList of type dog to a 
		 * method that accepts an ArrayList of type Animal, 
		 * which is a super type of Dog.
		 * 
		 * The method will ONLY take an ArrayList of type 
		 * Animal and not a subtype or not a supertype of
		 * Animal, but just Animal. But we can add a sub-type of Animal
		 * to a List<Animal>
		 */
		
		Animal[] a = new Animal[4];
		a[2]=new Animal();
		a[3] = new Bird();
		
		gp.addAnimals(a);
		System.out.println("Size of the Animal array is : "+a.length);
		
		for(Animal animal:a) {
			System.out.println(animal.toString());
		}
		/*
		 * gp.addAnimals(a);
		 * 
		 * This wont work for arrays also as the addAnimals() method is 
		 * expecting an array of Dog and not an array of type Animal which 
		 * has Bird, Leopard and all. If we change the parameter to 
		 * Animal[] then it will work. 
		 * 
		 * But the visa-versa will work.
		 * When the method parameter is an array of Animals[] and if
		 * we are passing an array of Dog[] it will work fine.
		 * 
		 *  Generics will not allow the same. i.e if the method parameter
		 *  is a List<Animal>, it wont take a List<Dog>
		 */
		
	}

}
