package _2.AspectOrientedProgramming._2_Advice_type.Порядок_выполнения_Aspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Aspect - это аннотация, которая помечает класс, который будет использоваться для реализации аспектов.
@Component
@Aspect
@Order(1)
public class MyAspectLoggingAspect {
    @Before("_2.AspectOrientedProgramming._2_Advice_type.Порядок_выполнения_Aspect.aspect.MyPointcut.allGetMethodsPoint()")
    public void beforeGetLoggingAdvice() {
        System.out.println("We do beforeGetLoggingAdvice() before any get method");
    }


}
