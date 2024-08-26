package _1.IoC_and_DI._5_configuration_with_annotation._3.Qualifier;

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


