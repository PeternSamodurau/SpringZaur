package _1.IoC_and_DI._1_inversion_of_control_;

public class Cat implements Pet{

    @Override
    public void say() {
        System.out.println("Cat say: "+"Meow-Meow");
    }
}
