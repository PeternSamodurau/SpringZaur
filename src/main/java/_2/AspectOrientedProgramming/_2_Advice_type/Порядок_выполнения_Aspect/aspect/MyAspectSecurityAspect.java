package _2.AspectOrientedProgramming._2_Advice_type.Порядок_выполнения_Aspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class MyAspectSecurityAspect {
    @Before("_2.AspectOrientedProgramming._2_Advice_type.Порядок_выполнения_Aspect.aspect.MyPointcut.allGetMethodsPoint()")
    public void beforeGetSecurityAdvice() {
        System.out.println("We do beforeGetSecurityAdvice() before any get method");
    }
}
