package _2.AspectOrientedProgramming.Pointcut4.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect - это аннотация, которая помечает класс, который будет использоваться для реализации аспектов.
@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* _2.AspectOrientedProgramming.Pointcut4.UniversityLibrary.get*())")
    public void allGetMethodsFromUniversityLibraryPoint() {
        System.out.println("Выполняем allGetMethodsFromUniversityLibraryPoint() перед любым методом get");
    }

    @Pointcut("execution(* _2.AspectOrientedProgramming.Pointcut4.UniversityLibrary.return*())")
    public void allReturnMethodsFromUniversityLibraryPoint() {
        System.out.println("Выполняем allReturnMethodsFromUniversityLibraryPoint() перед любым методом return");
    }

    @Pointcut("allGetMethodsFromUniversityLibraryPoint() || allReturnMethodsFromUniversityLibraryPoint()")
    public void allGetOrReturnMethodsFromUniversityLibraryPoint() {
        System.out.println("Выполняем allGetOrReturnMethodsFromUniversityLibraryPoint() перед любым методом get или return");
    }

    @Pointcut("execution(* _2.AspectOrientedProgramming.Pointcut4.UniversityLibrary.*(..))")
    public void allMethodsFromUniversityLibraryPoint() {
        System.out.println("Выполняем allMethodsFromUniversityLibraryPoint() перед любым методом в UniversityLibrary");
    }

    @Pointcut("execution(public void _2.AspectOrientedProgramming.Pointcut4.UniversityLibrary.returnMagazine())")
    public void returnMagazineFromUniversityLibraryPoint() {
        System.out.println("Выполняем returnMagazineFromUniversityLibraryPoint() перед методом returnMagazine");
    }

    @Pointcut("allMethodsFromUniversityLibraryPoint() && !returnMagazineFromUniversityLibraryPoint()")
    public void allMethodsFromUniversityExceptReturnMagazineLibraryPoint() {
        System.out.println("Выполняем allMethodsFromUniversityExceptReturnMagazineLibraryPoint() перед любым методом, кроме returnMagazine");
    }

    @Before("allGetMethodsFromUniversityLibraryPoint()")
    public void beforeGetLoggingAdvice() {
        System.out.println("Выполняем beforeGetLoggingAdvice() перед любым методом get - 1");
    }

    @Before("allReturnMethodsFromUniversityLibraryPoint()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("Выполняем beforeReturnLoggingAdvice() перед любым методом return - 2");
    }

    @Before("allGetOrReturnMethodsFromUniversityLibraryPoint()")
    public void beforeGetOrReturnLoggingAdvice() {
        System.out.println("Выполняем beforeGetOrReturnLoggingAdvice() - 3");
    }

    @Before("allMethodsFromUniversityExceptReturnMagazineLibraryPoint()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("Выполняем beforeAllMethodsExceptReturnMagazineAdvice() - 4");
    }
}
