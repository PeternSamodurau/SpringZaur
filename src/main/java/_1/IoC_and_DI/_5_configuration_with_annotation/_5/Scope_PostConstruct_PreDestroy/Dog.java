package _1.IoC_and_DI._5_configuration_with_annotation._5.Scope_PostConstruct_PreDestroy;

import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@ToString
@Component("dogBean")
@Scope("prototype")               //если singleton, то один и тот же объект
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bin is created");
    }
    @PostConstruct
    public void init(){
        System.out.println("Dog init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog destroy");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}


