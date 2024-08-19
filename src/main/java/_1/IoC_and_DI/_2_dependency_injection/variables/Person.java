package _1.IoC_and_DI._2_dependency_injection.variables;

import lombok.ToString;

@ToString
public class Person {

    private Pet pet;
    private String name;
    private int age;

    public Person() {
        System.out.println("Person bin is created" );
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: setPet" );
        this.pet = pet;
    }

    public void setName(String name) {
        System.out.println("Class Person: setName" );
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("Class Person: setAge" );
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
