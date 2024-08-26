package _1.IoC_and_DI._5_configuration_with_annotation._5.Scope_PostConstruct_PreDestroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext8.xml");

        Dog dog1 = context.getBean("dogBean", Dog.class);
        dog1.say();
        Dog dog2 = context.getBean("dogBean", Dog.class);
        dog2.say();
        System.out.println("Переменные ссылаются на один и тот же объект? " + (dog1 == dog2)); //false, потому что scope="prototype"
        System.out.println(dog1);
        System.out.println(dog2);
        context.close();
    }
}
