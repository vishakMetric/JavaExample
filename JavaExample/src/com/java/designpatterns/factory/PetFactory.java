package com.java.designpatterns.factory;

public class PetFactory {

    public Pet getPetFactory(String pet) {
        Pet petObj = null;
        if("Cat".equalsIgnoreCase(pet)) {
             petObj = new Cat();
        } else if("Dog".equalsIgnoreCase(pet)) {
             petObj = new Dog();
        }
        return petObj;
    }
}
