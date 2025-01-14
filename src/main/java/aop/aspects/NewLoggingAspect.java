package aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: in lib try to return book");
        Object targetMethodResult = joinPoint.proceed();
//        targetMethodResult = "Sherlock Holmes 3";
        System.out.println("aroundReturnBookLoggingAdvice: in lib final return book");
        return targetMethodResult;

    }
}
