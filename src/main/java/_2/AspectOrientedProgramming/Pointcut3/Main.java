package _2.AspectOrientedProgramming.Pointcut3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
     //   Magazine magazine = context.getBean("magazine", Magazine.class);

        universityLibrary.getBook();
        universityLibrary.getMagazine();

        context.close();

    }
}
