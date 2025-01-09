package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Sherlock Holmes")
    private String name;
    @Value("Artur Konan")
    private String author;

    @Value("1919")
    private int yearOfPublication;

    public String getName(){
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
