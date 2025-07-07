package _16_OOP._08_Book;

import java.util.List;

public class Library {

    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void show_books() {
        for (Book book : bookList) {
            System.out.println(book.title);
        }
    }

}
