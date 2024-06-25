package _1.IoC_and_DI._6_Configuration_with_Java_code.Способ_1;

import org.springframework.stereotype.Component;
import _1.IoC_and_DI._1_inversion_of_control_.Pet;

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
