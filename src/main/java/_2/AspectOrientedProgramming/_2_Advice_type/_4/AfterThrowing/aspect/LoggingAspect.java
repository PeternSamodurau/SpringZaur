package _2.AspectOrientedProgramming._2_Advice_type._4.AfterThrowing.aspect;

import _2.AspectOrientedProgramming._2_Advice_type._3.AfterReturning.Student;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
@Log4j2
public class LoggingAspect {

   @AfterThrowing(pointcut = "_2.AspectOrientedProgramming._2_Advice_type._4.AfterThrowing.aspect.MyPointcut.allGetMethodsPoint()", throwing = "exception")
    public void afterGetLoggingAdvice(JoinPoint joinPoint, Throwable exception) {
        log.info("afterThrowLoggingAdvice: логируем выброс исключения ПОСЛЕ метода getStudents()" + " " + exception);
        System.out.println("afterThrowLoggingAdvice: логируем выброс исключения ПОСЛЕ метода getStudents()" +" "+ exception);
        System.out.println("________________________________________________________________");
    }
}
