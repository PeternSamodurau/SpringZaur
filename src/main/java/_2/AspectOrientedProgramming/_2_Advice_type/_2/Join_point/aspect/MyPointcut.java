package _2.AspectOrientedProgramming._2_Advice_type._2.Join_point.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut("execution(* add*(..))")
    public void allAddMethodsPoint() {}
}
