package _2.AspectOrientedProgramming._2_Advice_type._3.AfterReturning;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student student1 = new Student("John", 1, 3.5);
        Student student2 = new Student("Mary", 2, 3.0);
        Student student3 = new Student("Tom", 3, 4.0);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }
    public List<Student> getStudents() {
        System.out.println("We do getStudents() method: " + students);
        return students;
    }
}
