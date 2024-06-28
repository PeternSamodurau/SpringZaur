package _2.AspectOrientedProgramming._2_Advice_type._5.After;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);

        university.addStudent();
        try {
            List<Student> students = university.getStudents();
            for (Student student : students) {
                System.out.println(student);
            }
        }catch (Exception e) {
            log.error("Было выброшено исключение: " + e.getMessage());
            System.out.println("Было выброшено исключение: " + e.getMessage());
        }
        context.close();

    }
}
