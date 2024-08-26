package _1.IoC_and_DI._6_Configuration_with_Java_code.Способ_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat = context.getBean("catBean", Pet.class);
        cat.say();
        Pet dog = context.getBean("dogBean", Pet.class);
        dog.say();


        Person person1 = context.getBean("personBean1", Person.class);
        person1.callYourPet();
        Person person2 = context.getBean("personBean2", Person.class);
        person2.callYourPet();

        context.close();
    }
}
