package com.rizcky;

/**
 * Created by rizcky on 7/4/17.
 */
public class Main {

    public static void main(String args[]){
        System.out.println("Hello World, lets learn Inheritance!");

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog  = new Dog("Yorkie", 10, 20, 2, 4, 1, 24, "Silk Yellow");

        dog.eat();
        dog.walk();
        dog.run();
    }
}
