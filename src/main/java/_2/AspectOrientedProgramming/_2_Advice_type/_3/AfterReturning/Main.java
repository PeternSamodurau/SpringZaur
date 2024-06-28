package _2.AspectOrientedProgramming._2_Advice_type._3.AfterReturning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);

        university.addStudent();
        List<Student> students = university.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }

        context.close();

    }
}
