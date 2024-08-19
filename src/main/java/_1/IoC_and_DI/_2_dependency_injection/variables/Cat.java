package _1.IoC_and_DI._2_dependency_injection.variables;

import lombok.ToString;

@ToString
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bin is created" );
    }

    @Override
    public void say() {
        System.out.println("Cat say: "+"Meow-Meow");
    }
}
