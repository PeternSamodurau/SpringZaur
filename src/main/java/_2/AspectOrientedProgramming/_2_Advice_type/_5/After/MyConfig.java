package _2.AspectOrientedProgramming._2_Advice_type._5.After;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

//Аннотация @Configuration указывает, что этот класс является конфигурационным классом и содержит бин-определения и методы управления бинами.
//Аннотация @PropertySource("classpath:myApp.properties") указывает на файл свойств myApp.properties, который будет использоваться для загрузки настроек приложения.
//Аннотация @ComponentScan("_2.AspectOrientedProgramming._2_Advice_type._3.AfterReturning") указывает Spring, где искать компоненты (бины) для автоматического сканирования и регистрации в контейнере.
//Аннотация @EnableAspectJAutoProxy включает поддержку аспектов в Spring, что позволяет использовать аспектно-ориентированное программирование (AOP) с помощью AspectJ.
//Таким образом, класс MyConfig выполняет роль конфигурационного класса, который определяет настройки и сканирование компонентов, а также включает поддержку аспектов в приложении Spring.
@Configuration
@PropertySource("classpath:myApp.properties")
@ComponentScan("_2.AspectOrientedProgramming._2_Advice_type._5.After")
@EnableAspectJAutoProxy
public class MyConfig {
}
