package _2.AspectOrientedProgramming.Pointcut3.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect - это аннотация, которая помечает класс, который будет использоваться для реализации аспектов.
@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* get*())")
    public void allGetMethodsPoint() {}

    @Before("allGetMethodsPoint()")
    public void beforeGetLoggingAdvice() {
        System.out.println("We do beforeGetLoggingAdvice() before any get method");
    }

    @Before("allGetMethodsPoint()")
    public void beforeGetSecurityAdvice() {
        System.out.println("We do beforeGetSecurityAdvice() before any get method");
    }
}
