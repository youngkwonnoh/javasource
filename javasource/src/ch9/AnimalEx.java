package ch9;

public class AnimalEx {
	public static void main(String[] args) {
		Animal animal = new Cat();
		// animal.sound();
		animalSound(new Cat());
		animalSound(new Dog());
		
		animal = new Dog();
		// animal.sound();
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
	

}
