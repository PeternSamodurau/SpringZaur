package _1.IoC_and_DI._5_configuration_with_annotation.PropertySourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
