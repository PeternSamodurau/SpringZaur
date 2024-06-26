package _2.AspectOrientedProgramming.Pointcut2.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect - это аннотация, которая помечает класс, который будет использоваться для реализации аспектов.
@Component
@Aspect
public class MyAspect {
    @Before("execution(public void *(..))") //сработает для всех методов, void, с любыми количеством параметрами или без параметров
    public void beforeGetBookAdvice() {
        System.out.println("We do GetBookAdvice before any method");
    }
    @Before("execution(public void *(*))") //сработает  для всех методов, void, с любыми параметрами
    public void beforeReturnBookAdvice() {
        System.out.println("We do ReturnBookAdvice before any method");
    }
    @Before("execution(public void getMagazine(_2.AspectOrientedProgramming.Pointcut2.Magazine))") //сработает  для метода getMagazine, который принимает объект типа Magazine
    public void beforeReturnBookAdvice2() {
        System.out.println("We do ReturnBookAdvice2 before getMagazine method");
    }
}
