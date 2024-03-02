package LMS;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;

public class Library {
    private HashMap<String,Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(Book book){
        if(books.containsKey(book.getISBN())){
            System.out.println("Book with ISBN already exists");
        }else{
            books.put(book.getISBN(),book);
            System.out.println("Book Added");
        }
    }

    public void removeBook(String ISBN){
        if(books.containsKey(ISBN)){
            books.remove(ISBN);
            System.out.println("Book removed");
        }else {
            System.out.println("Book with ISBN not found");
        }
    }


}
