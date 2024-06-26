package _2.AspectOrientedProgramming._2_Advice_type._1.Before;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean( "libraryBean", Library.class);
        library.getBook();

        context.close();
    }
}
