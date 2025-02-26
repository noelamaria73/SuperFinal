public class Main {


    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog("Canine");

        // Call overridden method
        myDog.makeSound();

        // Call final method from the parent class
        myDog.breathe();

        // Display the species using the displaySpecies method
        myDog.displaySpecies();
    }
}