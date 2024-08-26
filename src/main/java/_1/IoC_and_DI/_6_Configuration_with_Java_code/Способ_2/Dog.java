package _1.IoC_and_DI._6_Configuration_with_Java_code.Способ_2;


public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bin is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}


