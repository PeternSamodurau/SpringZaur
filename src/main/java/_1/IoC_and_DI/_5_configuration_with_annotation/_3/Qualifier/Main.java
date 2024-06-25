package _1.IoC_and_DI._5_configuration_with_annotation._3.Qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();
    }
}
