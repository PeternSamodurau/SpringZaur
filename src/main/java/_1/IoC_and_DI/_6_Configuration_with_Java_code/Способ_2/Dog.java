package _1.IoC_and_DI._6_Configuration_with_Java_code.Способ_2;

import _1.IoC_and_DI._1_inversion_of_control_.Pet;


public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bin is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}


