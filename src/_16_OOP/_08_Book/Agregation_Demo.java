package _16_OOP._08_Book;

import java.util.ArrayList;
import java.util.List;

public class Agregation_Demo {
    public static void main(String[] args) {


        Book b1 = new Book("Voina i mir", "L.Tolstoy");
        Book b2 = new Book("Lord of the Rings", "J.R.R.Tolkin");

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(b1);
        listOfBooks.add(b2);

        Library library = new Library(listOfBooks);
        library.show_books();


    }
}