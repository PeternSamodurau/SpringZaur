package _1.IoC_and_DI._5_configuration_with_annotation._3.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import _1.IoC_and_DI._1_inversion_of_control_.Pet;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")     или так
    private Pet pet;
    private String surname;
    private int age;

    public Person() {
        System.out.println("Person bin is created");
    }

    public void callYourPet() {
        System.out.println("Hi, my lovely Pet!!!");
        pet.say();
    }

@Autowired
@Qualifier("catBean")
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
