package _2.AspectOrientedProgramming.Pointcut3;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("magazine")
@Log4j2
public class Magazine {
    @Value("${magazine.name}")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void init() {
        log.info("Magazine bean created with name: {}", name);
    }
}
