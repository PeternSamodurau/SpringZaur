package _1.IoC_and_DI._6_Configuration_with_Java_code.Способ_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import _1.IoC_and_DI._1_inversion_of_control_.Pet;

public class MyConfig {
    @Bean
    @Scope("prototype")      // два объекта ссылаются
  //  @Scope("singleton")        // один и тот же объект
    public Pet catBean() {
        return new Cat();
    }
    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
