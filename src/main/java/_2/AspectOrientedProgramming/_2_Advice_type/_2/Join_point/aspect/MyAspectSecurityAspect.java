package _2.AspectOrientedProgramming._2_Advice_type._2.Join_point.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class MyAspectSecurityAspect {
    @Before("_2.AspectOrientedProgramming._2_Advice_type._2.Join_point.aspect.MyPointcut.allAddMethodsPoint()")
    public void beforeAddSecurityAdvice() {
        System.out.println("We do beforeAddSecurityAdvice() before add method");
        System.out.println("________________________________________________________________");
    }
}
