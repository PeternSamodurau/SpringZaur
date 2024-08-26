package _1.IoC_and_DI._5_configuration_with_annotation._1.Component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.1.xml");

        Cat cat = context.getBean("catBean", Cat.class);

        cat.say();

        context.close();
    }
}
