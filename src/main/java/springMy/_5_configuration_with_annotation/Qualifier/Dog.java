package springMy._5_configuration_with_annotation.Qualifier;

import org.springframework.stereotype.Component;
import springMy._1_inversion_of_control.Pet;

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


