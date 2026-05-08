package Day3;

abstract class Animal {
    abstract void sound(); 

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal obj = new Dog(); 

        obj.sound(); 
        obj.sleep(); 
    }
}