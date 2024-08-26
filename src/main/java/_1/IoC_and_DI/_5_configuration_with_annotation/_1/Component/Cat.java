package _1.IoC_and_DI._5_configuration_with_annotation._1.Component;


import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat  {

    public Cat() {
        System.out.println("Cat bin is created");
    }


    public void say() {
        System.out.println("Meow-Meow");
    }
}
