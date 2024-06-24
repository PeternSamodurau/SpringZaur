package springMy._5_configuration_with_annotation.Autowired;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Log4j2
public class Main {

    /**
     * Этот метод демонстрирует, как использовать контекст приложения Spring для получения бинов.
     * Он пытается получить объект Cat и объект Person из контекста приложения и, если они найдены,
     * вызывает метод say() у кота и метод callYourPet() у человека.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml")) {

            // Попытка получить бин Cat из контекста приложения
            Cat cat = context.getBean("catBean", Cat.class);

            // Попытка получить бин Person из контекста приложения
            Person person = context.getBean("personBean", Person.class);

            // Если оба объекта (кот и человек) найдены
            if (cat != null && person != null) {

                // Вызов метода say() у кота
                cat.say();

                // Вызов метода callYourPet() у человека
                person.callYourPet();

                // Вывод сообщения, указывающего, что бин Cat был найден
                log.info("Бин Cat найден");

            } else {

                // Вывод сообщения, указывающего, что бин Cat не был найден
                System.out.println("Бин Cat не был найден");
            }

        } catch (BeansException e) {

            // Вывод сообщения об ошибке, если при создании контекста произошла ошибка
            System.out.println("При создании контекста произошла ошибка: " + e.getMessage());
        }
    }
}
