package _1.IoC_and_DI._6_Configuration_with_Java_code.Способ_2;


public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bin is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
