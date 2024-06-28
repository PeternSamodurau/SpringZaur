package _2.AspectOrientedProgramming._2_Advice_type._3.AfterReturning.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut("execution(* getStudents())")
    public void allGetMethodsPoint() {}
}
