package _1.IoC_and_DI._1_inversion_of_control_;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bin is created" );
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
