package _2.AspectOrientedProgramming.Pointcut2;

import _2.AspectOrientedProgramming.Pointcut1.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component("universityLibrary")
public class UniversityLibrary  {
    public void getBook(String bookName,String authorName) {
        System.out.println(" We take book from University library - " + bookName + "  " + authorName);
    }
    public void returnBook(int bookId) {
        System.out.println(" We return book to University library - " + bookId);
    }
    public void getMagazine(Magazine magazine) {
        System.out.println(" We take magazine from University library - " + magazine.getName());
    }
    public void returnMagazine() {
        System.out.println(" We return magazine to University library - " );
    }
}
