package _2.AspectOrientedProgramming._2_Advice_type._6.Around.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut("execution(public String returnBook())")
    public void returnBookPoint() {}
}
