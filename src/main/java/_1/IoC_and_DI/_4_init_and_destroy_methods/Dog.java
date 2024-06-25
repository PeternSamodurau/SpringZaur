package _1.IoC_and_DI._4_init_and_destroy_methods;

import _1.IoC_and_DI._1_inversion_of_control_.Pet;


public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bin is created");
    }
    public void init(){
        System.out.println("Dog init");
    }
    public void destroy(){
        System.out.println("Dog destroy");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}


