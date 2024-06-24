package springMy._4_init_and_destroy_methods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");

        Dog dog1 = context.getBean("myPet", Dog.class);
        dog1.say();
        Dog dog2 = context.getBean("myPet", Dog.class);
        dog2.say();

        context.close();
    }
}
