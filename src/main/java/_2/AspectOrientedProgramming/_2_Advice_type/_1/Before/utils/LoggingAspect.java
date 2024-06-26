package _2.AspectOrientedProgramming._2_Advice_type._1.Before.utils;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

@Component
@Aspect
@Log4j2
public class LoggingAspect {
    @PostConstruct
    public void createNewLoggerFileAdvice() {
    System.out.println("CreateNewLoggerFileAdvice");

        File infoLog = new File("src/main/resources/log/info.log");
        File errorsLog = new File("src/main/resources/log/errors.log");

        try {
            infoLog.createNewFile();
            log.info("Hello i am logger info");

            errorsLog.createNewFile();
            log.error("Hello i am logger error");
        } catch (
                IOException e) {
            log.error("Files not created:{}", e.getMessage());
        }
    }
}
