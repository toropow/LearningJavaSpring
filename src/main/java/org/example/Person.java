package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    public Person() {
//        System.out.println("Person bean is created");
//    }

    public void callYourPet(){
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }

//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class person: setPet");
        this.pet = pet;
    }

    public String getSurname() {
        System.out.println("Get surname");
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Set Surname");
        this.surname = surname;
    }

    public int getAge() {
        System.out.println("Get Age");
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age");
        this.age = age;
    }
}
