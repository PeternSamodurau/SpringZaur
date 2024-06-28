package _2.AspectOrientedProgramming._2_Advice_type._6.Around.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Around("_2.AspectOrientedProgramming._2_Advice_type._6.Around.aspect.MyPointcut.returnBookPoint()")
    public Object aroundReturnLoggingAdvice(ProceedingJoinPoint joinPoint) {

        System.out.println("aroundReturnLoggingAdvice: в библиотеку пытаются вернуть книгу");

        try {
            long beginTime = System.currentTimeMillis();

            Object returnBook = joinPoint.proceed();

            long endTime = System.currentTimeMillis();

            System.out.println("aroundReturnLoggingAdvice: время выполнения метода: " + (endTime - beginTime) + " мс");
            System.out.println("aroundReturnLoggingAdvice: в библиотеку успешно вернули книгу");
            return returnBook;

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}