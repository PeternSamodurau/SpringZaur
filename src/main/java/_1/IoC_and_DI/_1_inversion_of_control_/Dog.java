package _1.IoC_and_DI._1_inversion_of_control_;

public class Dog implements Pet {


    @Override
    public void say(){
        System.out.println("Dog say: " +"Bow-Wow");
    }
}
