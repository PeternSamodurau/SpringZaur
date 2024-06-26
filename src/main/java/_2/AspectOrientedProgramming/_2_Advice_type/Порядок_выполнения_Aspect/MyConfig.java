package _2.AspectOrientedProgramming._2_Advice_type.Порядок_выполнения_Aspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApp.properties")
@ComponentScan("_2.AspectOrientedProgramming._2_Advice_type.Порядок_выполнения_Aspect")
@EnableAspectJAutoProxy
public class MyConfig {
}
