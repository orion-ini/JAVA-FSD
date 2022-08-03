package pill;
class Animal {
	  public void animalSound() {
	    System.out.println("All animals has a unique sound");
	  }
	}

	class Goat extends Animal {
	  public void animalSound() {
	    System.out.println("Goat: meh meh ");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("dog: bow wow");
	  }
	}
	class ImplementPolymorphism {
		public static void main(String[] args) {
		    Animal myAnimal = new Animal();
		    Animal myGoat = new Goat();
		    Animal myDog = new Dog();
		        
		    myAnimal.animalSound();
		    myGoat.animalSound();
		    myDog.animalSound();
		  }
	}