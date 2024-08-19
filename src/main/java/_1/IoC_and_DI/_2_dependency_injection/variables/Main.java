package _1.IoC_and_DI._2_dependency_injection.variables;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.2.xml");
        // вначале происходит создание всех бинов в applicationContext2.2.xml
        // присваиваются значения переменных myPerson1 и myPerson2 в бинах, но прописывать их так не верно, пользуются properties
        System.out.println("____________________________________");
        Person person1 = context.getBean("myPerson1", Person.class);
        Person person2 = context.getBean("myPerson2", Person.class);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println("____________________________________");
        person1.callYourPet();
        person2.callYourPet();

        context.close();
    }
}
