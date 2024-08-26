package _1.IoC_and_DI._6_Configuration_with_Java_code.Способ_1;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bin is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}


