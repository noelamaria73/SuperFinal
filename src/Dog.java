// Dog.java
public class Dog extends Animal {
    // Constructor
    public Dog(String species) {
        // Using super to call the parent class constructor
        super(species);
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dogs bark");
    }

    @Override
    public void breathe() {
        System.out.println("Dog is breathing");
    }


    // A method to demonstrate the use of super
    public void displaySpecies() {
        // Using super to access the parent class's final variable
        System.out.println("Species: " + super.species);
    }
}