package Inheriance;

//parent class
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }
}

//child class
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking");
 }
}

public class InheritanceExample {
 public static void main(String[] args) {
     Dog myDog = new Dog();
     
     myDog.eat();  // This is from the superclass
     myDog.bark(); // This is from the subclass
     
     
     Animal myAnimal = new Animal();
     // Uncommenting the line below would result in a compilation error
     // myAnimal.bark();
 }
}
