package _2.AspectOrientedProgramming.Pointcut4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
     //   Magazine magazine = context.getBean("magazine", Magazine.class);

        universityLibrary.getBook();
        universityLibrary.returnMagazine();
        universityLibrary.addBook();

        context.close();

    }
}
