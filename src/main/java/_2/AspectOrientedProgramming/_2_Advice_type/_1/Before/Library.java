package _2.AspectOrientedProgramming._2_Advice_type._1.Before;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook() {
        System.out.println("We do bookBook() method from library");
    }
}
