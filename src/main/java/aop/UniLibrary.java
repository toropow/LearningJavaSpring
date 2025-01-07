package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook(){
        System.out.println("We take book from UniLibrary");
    }

    public String returnBook(){
        System.out.println("We return book from UniLibrary");
        return "OK";
    }

    public void getMagazine(){
        System.out.println("We take magazine from UniLibrary");
    }
}
