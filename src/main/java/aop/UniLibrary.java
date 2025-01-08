package aop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We take book from UniLibrary ");
    }

    public void returnBook(){
        System.out.println("We return book from UniLibrary");
    }

    public void getMagazine(){
        System.out.println("We take magazine from UniLibrary");
    }

    public void returnMagazine(){
        System.out.println("We return magazine to UniLibrary");
    }

    public void addBook(){
        System.out.println("We add book to UniLibrary");
    }

    public void addMagazine(){
        System.out.println("We add magazine to UniLibrary");
    }
}
