package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void get*())")
    public void boefreGetBookAdvice(){
        System.out.println("boefreGetBookAdvice: try to get book");
    }

    @Before("execution(* get*())")
    public void beforeReturnBookAdvice(){
        System.out.println("ReturnGetBookAdvice: try to return book");
    }
}
