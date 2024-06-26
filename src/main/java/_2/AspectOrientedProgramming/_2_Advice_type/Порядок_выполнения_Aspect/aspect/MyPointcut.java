package _2.AspectOrientedProgramming._2_Advice_type.Порядок_выполнения_Aspect.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut("execution(* get*())")
    public void allGetMethodsPoint() {}
}
