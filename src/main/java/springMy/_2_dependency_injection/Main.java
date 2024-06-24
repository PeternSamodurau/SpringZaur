package springMy._2_dependency_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");

        //Pet pet3 = context.getBean("myPetDog", Pet.class);       ТЕПЕРЬ ЭТО НЕ НАДО ЕСТЬ СВЯЗКА

        PersonConstructor person3 = context.getBean("myPersonConstructor", PersonConstructor.class);
        person3.callYourPet();
        System.out.println("--------------------------------------");

        PersonSet person4 = context.getBean("myPersonSet", PersonSet.class);
        person4.callYourPet();
        System.out.println("--------------------------------------");

        PersonVariables person5 = context.getBean("myPersonVariables", PersonVariables.class);
        person5.callYourPet();
        System.out.println(person5.getSurname());
        System.out.println(person5.getAge());


        context.close();
    }
}
