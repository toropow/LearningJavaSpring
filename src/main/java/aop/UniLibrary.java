package aop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We take book from UniLibrary ");
        System.out.println("------------------------------------");
    }

    public String returnBook(){
        System.out.println("We return book from UniLibrary");
        System.out.println("------------------------------------");
        return "Sherlock Holmes 2";
    }

    public void getMagazine(){
        System.out.println("We take magazine from UniLibrary");
        System.out.println("------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("We return magazine to UniLibrary");
        System.out.println("------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("We add book to UniLibrary");
        System.out.println("------------------------------------");
    }

    public void addMagazine(){
        System.out.println("We add magazine to UniLibrary");
        System.out.println("------------------------------------");
    }
}
