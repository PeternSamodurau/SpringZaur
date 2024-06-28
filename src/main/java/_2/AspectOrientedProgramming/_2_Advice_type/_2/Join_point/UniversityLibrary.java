package _2.AspectOrientedProgramming._2_Advice_type._2.Join_point;

import _2.AspectOrientedProgramming.Pointcut3.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component("universityLibrary")
public class UniversityLibrary {

    public void getBook() {
        System.out.println(" We take book from University library - 1 ");
        System.out.println("_________________________________________________________");
    }

    public void returnBook(int bookId) {
        System.out.println(" We return book to University library - " + bookId);
        System.out.println("_________________________________________________________");
    }

    public void getMagazine() {
        System.out.println(" We take magazine from University library - 4");
        System.out.println("______________________________________________________");
    }

    public void returnMagazine() {
        System.out.println(" We return magazine to University library - ");
        System.out.println("_________________________________________________________");
    }
    public void addBook(String personName, Book book) {
        System.out.println(" We add book to University library - 2 " + personName + " " + book.getName());
        System.out.println("_________________________________________________________");
    }

    public void addMagazine(String magazineName) {
        System.out.println(" We add magazine to University library - 3 " + magazineName);
        System.out.println("_________________________________________________________");
    }
}
