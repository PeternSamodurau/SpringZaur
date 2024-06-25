package _1.IoC_and_DI._3_bean_scope;

import _1.IoC_and_DI._1_inversion_of_control_.Pet;


public class Dog implements Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
        System.out.println("Dog bin is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}


