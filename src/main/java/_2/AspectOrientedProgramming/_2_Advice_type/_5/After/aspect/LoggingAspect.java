package _2.AspectOrientedProgramming._2_Advice_type._5.After.aspect;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Log4j2
public class LoggingAspect {

   @After("_2.AspectOrientedProgramming._2_Advice_type._5.After.aspect.MyPointcut.allGetMethodsPoint()")

    public void afterGetLoggingAdvice() {

        log.info("afterLoggingAdvice: логируем нормальную работу метода getStudents() или выброс исключения");

        System.out.println("afterLoggingAdvice: логируем нормальную работу метода getStudents() или выброс исключения");

        System.out.println("________________________________________________________________");
    }
}
