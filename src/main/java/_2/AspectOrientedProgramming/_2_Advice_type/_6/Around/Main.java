package _2.AspectOrientedProgramming._2_Advice_type._6.Around;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Method main starts");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

       UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);


        String returnBook = universityLibrary.returnBook();
        System.out.println("В библиотеку вернули книгу: " + returnBook);

        context.close();


        System.out.println("Method main ends");

    }
}
