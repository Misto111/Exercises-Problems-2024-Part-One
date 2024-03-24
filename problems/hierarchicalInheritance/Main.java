package hierarchicalInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println();

        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.weep();
    }
}
