package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook(Book bookName) {
        System.out.println("We take book from UniLibrary " + bookName.getName());
    }

    public String returnBook(){
        System.out.println("We return book from UniLibrary");
        return "OK";
    }

    public void getMagazine(int a, int b){
        System.out.println("We take magazine from UniLibrary");
    }
}
