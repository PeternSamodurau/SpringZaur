package _1.IoC_and_DI._2_dependency_injection;

import _1.IoC_and_DI._1_inversion_of_control_.Pet;

public class PersonSet {
    private Pet pet;

    public PersonSet() {
        System.out.println("Person bin is created" );
    }
    public void  callYourPet(){
        System.out.println("Hi, my lovely Pet!!!");
        pet.say();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
