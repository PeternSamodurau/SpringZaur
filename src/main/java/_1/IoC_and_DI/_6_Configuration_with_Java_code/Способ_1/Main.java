package _1.IoC_and_DI._6_Configuration_with_Java_code.Способ_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);


        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();


        context.close();
    }
}
