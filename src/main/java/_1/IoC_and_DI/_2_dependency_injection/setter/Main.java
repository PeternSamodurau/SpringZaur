package _1.IoC_and_DI._2_dependency_injection.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.1.xml");
        // вначале происходит создание всех бинов в applicationContext2.1.xml
        System.out.println("____________________________________");

        Person person1 = context.getBean("myPerson1", Person.class);
        person1.callYourPet();

        Person person2 = context.getBean("myPerson2", Person.class);
        person2.callYourPet();
        context.close();
    }
}
