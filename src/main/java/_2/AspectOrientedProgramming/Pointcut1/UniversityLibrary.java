package _2.AspectOrientedProgramming.Pointcut1;

import org.springframework.stereotype.Component;

@Component("universityLibrary")
public class UniversityLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("We take book from University library");
    }
    public void returnBook() {
        System.out.println(" We return book to University library");
    }
    public void getMagazine() {
        System.out.println("We take magazine from University library");
    }
    public void returnMagazine() {
        System.out.println(" We return magazine to University library");
    }
}
