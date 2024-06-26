package _2.AspectOrientedProgramming._2_Advice_type._1.Before;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("_2.AspectOrientedProgramming._2_Advice_type")
@EnableAspectJAutoProxy
public class MyConfig {
}
