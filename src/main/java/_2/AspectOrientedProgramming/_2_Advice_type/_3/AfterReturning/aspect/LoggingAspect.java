package _2.AspectOrientedProgramming._2_Advice_type._3.AfterReturning.aspect;

import _2.AspectOrientedProgramming._2_Advice_type._3.AfterReturning.Student;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
@Log4j2
public class LoggingAspect {
    @Before("_2.AspectOrientedProgramming._2_Advice_type._3.AfterReturning.aspect.MyPointcut.allGetMethodsPoint()")
    public void beforeGetLoggingAdvice() {
        log.info("beforeGetLoggingAdvice: логируем получение списка студентов ПЕРЕД методом getStudents()");
        System.out.println("beforeGetLoggingAdvice: логируем получение списка студентов ПЕРЕД методом getStudents()");
        System.out.println("________________________________________________________________");
    }
    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetLoggingAdvice(JoinPoint joinPoint,List<Student> students) {
        // так лучше не делать, т.к. логируем не то, что получаем, плохой код
        System.out.println("меняем имя первого студента на Mr. и увеличиваем средний балл на 1.1 перед тем как отработает getStudents() " );
        Student firstStudent = students.get(0);
        String firstName = firstStudent.getName();
        firstName = "Mr. " + firstName;
        firstStudent.setName(firstName);

        double averageGrade = firstStudent.getAvgGrade();
        averageGrade = averageGrade + 1.1;
        firstStudent.setAvgGrade(averageGrade);

        log.info("_2.AspectOrientedProgramming._2_Advice_type._3.AfterReturning.aspect.MyPointcut.allGetMethodsPoint()");
        System.out.println("afterGetLoggingAdvice: логируем получение списка студентов ПОСЛЕ метода getStudents()");
        System.out.println("________________________________________________________________");
    }
}
