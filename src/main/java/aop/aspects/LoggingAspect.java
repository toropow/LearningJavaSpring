package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazine() {}
//
//    @Before("allMethodsExceptReturnMagazine()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
//    }


//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodFromUniLibrary() {}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodFromUniLibrary() {}
//
//    @Pointcut("allGetMethodFromUniLibrary() ||allReturnMethodFromUniLibrary()")
//    private void allGetAndReturnMethodFromUniLibrary(){}
//
//    @Before("allGetMethodFromUniLibrary()")
//    public void beforeGetLoggingAdvise(){
//        System.out.println("beforeGetLoggingAdvise: writing Log #1");
//    }
//
//    @Before("allReturnMethodFromUniLibrary()")
//    public void beforeReturnMethodFromUniLibrary(){
//        System.out.println("beforeReturnLoggingAdvise: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodFromUniLibrary()")
//    public void beforeGetAndReturnMethodFromUniLibrary(){
//        System.out.println("beforeGetAndReturnLoggingAdvise: writing Log #3");
//    }


//
////    @Before("execution(public void getBook(aop.Book))")
    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());

        System.out.println("beforeGetBookAdvice: logging to try to get book/magazine");
        System.out.println("------------------------------------");

         if (methodSignature.getName().equals("addBook")){
             Object[] arguments = joinPoint.getArgs();
             for (Object arg : arguments){
                 if (arg instanceof Book) {
                     Book book = (Book) arg;
                     System.out.println("info about book = " + book.getName() + ", author = " + book.getAuthor() + " , year of publication = " + book.getYearOfPublication());

                 } else if (arg instanceof String){
                     System.out.println("Book to lib add = " + arg);
                 }

             }

        }
    }




//    @Before("execution(* get*())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("ReturnGetBookAdvice: try to return book");
//    }
}
