// Animal.java
public class Animal {
    // A final variable (constant)
    final String species;

    // Constructor
    public Animal(String species) {
        this.species = species;
    }

    // A method that can be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // A final method that cannot be overridden
    public void breathe() {
        System.out.println("Animal is breathing");
    }
}