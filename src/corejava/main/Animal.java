package corejava.main;

public class Animal {
	public void animalSound() {
		System.out.println("animal makes a sound");
	}
}
	class Pig extends Animal{
		public void animalSound() {
			System.out.println("the pig says:wee wee");
		}
	}
	class Dog extends Animal{
		public void animalSound() {
			System.out.println("the dog says:bow bow");
		}
	}
	class Main {
		public static void main(String[] args) {

			Animal myAnimal=	new Animal();// create animal obj
			Animal myPig=	new Pig();   // create pig obj
			Animal myDog=		new Dog(); //create Dog obj
            myAnimal.animalSound();
            myPig.animalSound();
            myDog.animalSound();
		}
	}



