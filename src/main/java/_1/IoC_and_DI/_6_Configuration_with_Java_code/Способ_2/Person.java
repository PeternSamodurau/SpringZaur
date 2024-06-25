package _1.IoC_and_DI._6_Configuration_with_Java_code.Способ_2;

import _1.IoC_and_DI._1_inversion_of_control_.Pet;


public class Person {

    private Pet pet;

    private String surname;

    private int age;

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Person bin is created");
    }

    public void callYourPet() {
        System.out.println("Hi, my lovely Pet!!!");
        pet.say();
    }


    public void setPet(Pet pet) {
        System.out.println("Class Person: setPet");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: setSurname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: setAge");
        this.age = age;
    }
}
