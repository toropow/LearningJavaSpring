package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat1.say();

       Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
//       person.callYourPet();

       context.close();
    }
}
