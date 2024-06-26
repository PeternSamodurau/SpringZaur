package _2.AspectOrientedProgramming.Pointcut2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        Magazine magazine = context.getBean("magazine", Magazine.class);

        universityLibrary.getBook("Math", "Jasmine");
        universityLibrary.returnBook(10);
        universityLibrary.getMagazine(magazine);
        universityLibrary.returnMagazine();

        context.close();
    }
}
