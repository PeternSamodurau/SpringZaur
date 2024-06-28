package _2.AspectOrientedProgramming._2_Advice_type._4.AfterThrowing;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
    private String name;
    private int course;
    private double avgGrade;

    public Student(String name, int course, double avgGrade) {
        this.name = name;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
