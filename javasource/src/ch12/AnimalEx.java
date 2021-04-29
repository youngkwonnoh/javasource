package ch12;

public class AnimalEx {

	public static void main (String[] args) {
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		
		System.out.println(animal1 == animal2);
		System.out.println(animal1.equals(animal2));
		
		
	}
	
}
