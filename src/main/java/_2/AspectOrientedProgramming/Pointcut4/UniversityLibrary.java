package _2.AspectOrientedProgramming.Pointcut4;

import _2.AspectOrientedProgramming.Pointcut3.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component("universityLibrary")
public class UniversityLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println(" We take book from University library - ");
    }

    public void returnBook(int bookId) {
        System.out.println(" We return book to University library - " + bookId);
    }

    public void getMagazine() {
        System.out.println(" We take magazine from University library - ");
    }

    public void returnMagazine() {
        System.out.println(" We return magazine to University library - ");
    }

    public void addBook() {
        System.out.println(" We add book to University library - " );
    }

    public void addMagazine() {
        System.out.println(" We add magazine to University library - ");
    }

}
