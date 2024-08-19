package _1.IoC_and_DI._2_dependency_injection.variables;

import lombok.ToString;

@ToString
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bin is created" );
    }

    @Override
    public void say(){
        System.out.println("Dog say: " +"Bow-Wow");
    }
}
