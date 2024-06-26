package _2.AspectOrientedProgramming.Pointcut2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApp.properties")
@ComponentScan("_2.AspectOrientedProgramming.Pointcut2")
@EnableAspectJAutoProxy
public class MyConfig {
}
