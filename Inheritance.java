// Parent class
class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Constructor
    Dog(String name) {
        super(name);
    }

    // Overriding makeSound() method
    @Override
    void makeSound() {
        System.out.println(name + " barks.");
    }
}

// Main class to run the program
public class InheritanceExample {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Some Animal");
        genericAnimal.makeSound();

        Dog myDog = new Dog("Buddy");
        myDog.makeSound();
    }
}
