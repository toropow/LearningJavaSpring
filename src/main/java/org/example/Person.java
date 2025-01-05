package org.example;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean is created");
    }

    public void callYourPet(){
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }

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
