package _1.IoC_and_DI._6_Configuration_with_Java_code.Способ_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class MyConfig {
    @Bean
    @Scope("prototype")      // два объекта
  //  @Scope("singleton")        // один и тот же объект
    public Pet catBean() {
        return new Cat();
    }
    @Bean
    @Scope("prototype")
    public Pet dogBean() {
        return new Dog();
    }
    @Bean
    public Person personBean1() {
        return new Person(catBean());
    }
    @Bean
    public Person personBean2() {
        return new Person(dogBean());
    }
}
