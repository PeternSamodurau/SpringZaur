package _2.AspectOrientedProgramming._2_Advice_type._7.Around_exeption.aspect;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Log4j2
public class LoggingAspect {
    @Around("_2.AspectOrientedProgramming._2_Advice_type._7.Around_exeption.aspect.MyPointcut.returnBookPoint()")
    public Object aroundReturnLoggingAdvice(ProceedingJoinPoint joinPoint) {

        System.out.println("aroundReturnLoggingAdvice: в библиотеку пытаются вернуть книгу");
        Object returnBook = null;
        try {

            returnBook = joinPoint.proceed();

            System.out.println("aroundReturnLoggingAdvice: в библиотеку успешно вернули книгу");

        } catch (Throwable e) {
            log.error("aroundReturnLoggingAdvice: в методе возникло исключение");
            throw new RuntimeException(e);
        }
        return returnBook;
    }
}