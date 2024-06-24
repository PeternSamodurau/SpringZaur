package springMy._1_inversion_of_control;

public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bin is created" );
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
