package springMy._2_dependency_injection;

import springMy._1_inversion_of_control.Pet;

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
