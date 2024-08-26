package _1.IoC_and_DI._5_configuration_with_annotation._6.PropertySourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import _1.IoC_and_DI._1_inversion_of_control_.Pet;

@Configuration
@PropertySource("classpath:myApp.properties")
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
