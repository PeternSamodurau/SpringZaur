package _1.IoC_and_DI._2_dependency_injection.setter;


public class Person {

    private Pet pet;

    public Person() {
        System.out.println("Person bin is created" );
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: setPet" );
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
