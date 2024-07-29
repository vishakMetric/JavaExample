package com.java.designpatterns.factory;

public class SimpleFactoryMethod {

    public static void main(String[]args) {
        PetFactory petFactory = new PetFactory();
        String sound = petFactory.getPetFactory("cat").petSound();
        System.out.println("Cat Sound is::"+sound);

        String dogSound = petFactory.getPetFactory("dog").petSound();
        System.out.println("Dog Sound is::"+dogSound);
    }
}
