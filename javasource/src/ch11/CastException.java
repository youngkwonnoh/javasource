package ch11;

public class CastException {
	public static void main(String[] args) {
		Dog dog = new Dog();
		change(dog);
		
		Cat cat = new Cat();
		// java.lang.ClassCastException
		change(cat);
	}
	public static void change(Animal animal) {
		// instanceof
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}

}
