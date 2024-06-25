package _1.IoC_and_DI._6_Configuration_with_Java_code.Способ_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//
//        Pet cat1 = context.getBean("catBean", Pet.class);
//        cat1.say();
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat2.say();
//
//        System.out.println("Переменные ссылаются на один и тот же объект? " + (cat1 == cat2));

        Person person1 = context.getBean("personBean", Person.class);
        person1.callYourPet();
        Person person2 = context.getBean("personBean", Person.class);
        person2.callYourPet();
        System.out.println("Переменные ссылаются на один и тот же объект? " + (person1 == person2));
        context.close();
    }
}
