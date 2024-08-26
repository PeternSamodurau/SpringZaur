package _1.IoC_and_DI._5_configuration_with_annotation._3.Qualifier;

import org.springframework.stereotype.Component;


@Component("catBean")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bin is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
