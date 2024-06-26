package _2.AspectOrientedProgramming.Pointcut1.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
//@Aspect - это аннотация, которая помечает класс, который будет использоваться для реализации аспектов.
@Component
@Aspect
public class MyAspect {
    //@Before("execution(public void _2.AspectOrientedProgramming.Pointcut1.UniversityLibrary.getBook())") //сработает только перед getBook UniversityLibrary
    //@Before("execution(public void getBook())") //сработает для всех классов, которые наследуются от AbstractLibrary
    @Before("execution(public void get*())") //сработает для всех методов, которые начинаются с get
    public void beforeGetBookAdvice() {
        System.out.println("We do something before getBook() method");
    }
    @Before("execution(public * returnBook())") //сработает  перед любым методом, который начинается с returnBook с любым типом возвращаемого значения
    public void beforeReturnBookAdvice() {
        System.out.println("We do something before returnBook() method");
    }
}
