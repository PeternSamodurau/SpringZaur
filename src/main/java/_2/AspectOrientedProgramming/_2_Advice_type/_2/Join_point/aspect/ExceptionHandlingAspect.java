package _2.AspectOrientedProgramming._2_Advice_type._2.Join_point.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("_2.AspectOrientedProgramming._2_Advice_type._2.Join_point.aspect.MyPointcut.allAddMethodsPoint()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("We do beforeAddExceptionHandlingAdvice() before add method");
        System.out.println("________________________________________________________________");
    }
}
