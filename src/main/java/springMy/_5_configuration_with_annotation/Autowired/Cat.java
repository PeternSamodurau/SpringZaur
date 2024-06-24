package springMy._5_configuration_with_annotation.Autowired;

import org.springframework.stereotype.Component;
import springMy._1_inversion_of_control.Pet;

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
