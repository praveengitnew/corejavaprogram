package corejava;

public class Animal {
	public void animalSound() {
		System.out.println("animal make a sound");
	}
	
	class Pig extends Animal{
		public void animalSound() {
			System.out.println("pig says:we we");
		}
	}
	class Dog extends Animal{
		public void animalSound() {
			System.out.println();
		}
	}
	}
