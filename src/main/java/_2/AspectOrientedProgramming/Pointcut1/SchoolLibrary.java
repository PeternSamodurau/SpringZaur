package _2.AspectOrientedProgramming.Pointcut1;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("We take book from School library");
    }

    public String returnBook() {
        System.out.println(" We return book to School library");
        return "Return book to School library";
    }
}
