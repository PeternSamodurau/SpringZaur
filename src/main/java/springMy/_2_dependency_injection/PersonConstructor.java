package springMy._2_dependency_injection;

import springMy._1_inversion_of_control.Pet;

public class PersonConstructor {
    private Pet pet;

    public PersonConstructor(Pet pet) {
        System.out.println("Person bin is created" );
        this.pet = pet;
    }
    public void  callYourPet(){
        System.out.println("Hi, my lovely Pet!!!");
        pet.say();
    }
}
