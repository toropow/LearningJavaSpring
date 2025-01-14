package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method start");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        long begin = System.currentTimeMillis();
        String bookName = library.returnBook();
        long end = System.currentTimeMillis();

        System.out.println("In lib return book: " + bookName);

        context.close();

        System.out.println("aroundReturnBookLoggingAdvice: method returnBook duration: " + (end - begin) + " ms");
        System.out.println("Method end");
    }
}

