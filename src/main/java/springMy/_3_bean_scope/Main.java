package springMy._3_bean_scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        //сразу создаются бины даже если мы их не запрашиваем и он общий для всех dog
        Dog dog1 = context.getBean("myPet", Dog.class);
        dog1.setName("Belka");

        Dog dog2 = context.getBean("myPet", Dog.class);
        dog2.setName("Strelka");

        System.out.println(dog2.getName());  // будет 2 Strelka  мы меняем состояние всех обьектов
        System.out.println(dog1.getName());

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println("Переменные ссылаются на один обьект? " + (dog1==dog2)); // будет true
        // надо поменять  <bean id="myPet" class="springMy._3_bean_scope.Dog" scope="prototype" /> вместо scope="singleton"
        //теперь ссылаются на разные обьекты
        context.close();
    }
}
