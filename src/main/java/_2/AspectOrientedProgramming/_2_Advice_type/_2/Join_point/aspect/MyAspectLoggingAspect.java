package _2.AspectOrientedProgramming._2_Advice_type._2.Join_point.aspect;

import _2.AspectOrientedProgramming._2_Advice_type._2.Join_point.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Aspect - это аннотация, которая помечает класс, который будет использоваться для реализации аспектов.
@Component
@Aspect
@Order(1)
public class MyAspectLoggingAspect {

    @Before("_2.AspectOrientedProgramming._2_Advice_type._2.Join_point.aspect.MyPointcut.allAddMethodsPoint()")

    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("We do beforeAddLoggingAdvice() before add method");
        System.out.println("________________________________________________________________");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("MethodSignature: " + methodSignature);
        System.out.println("MethodGetMethod: " + methodSignature.getMethod());
        System.out.println("MethodGetReturnType: " + methodSignature.getReturnType());
        System.out.println("MethodGetName: " + methodSignature.getName());
        System.out.println("MethodGetParameterType: " + Arrays.toString(methodSignature.getParameterTypes()));

        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object arg : args) {
                if (arg instanceof Book) {
                    Book book = (Book) arg;
                    System.out.println("Book: " + book.getName() + " " + book.getAuthor() + " " + book.getYear());
                }else if (arg instanceof String) {
                    System.out.println("String: " + arg);
                }
            }
        }
        System.out.println("________________________________________________________________");
    }
}



