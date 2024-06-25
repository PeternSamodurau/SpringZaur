package _1.IoC_and_DI._1_inversion_of_control_;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();
        dog.say();
        Pet cat = new Cat();
        cat.say();
        System.out.println("_________________________________");

        // в конфиг файле можно управлять вызывая животными не писать код, создавать обьекты будет spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml"); // это создали контейнер

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
