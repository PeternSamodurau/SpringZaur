package _1.IoC_and_DI._2_dependency_injection.constructor;

public class Person {

    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bin is created" );
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
