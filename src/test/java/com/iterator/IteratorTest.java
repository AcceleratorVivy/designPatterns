package com.iterator;

import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    void f1(){
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("hello"));
        bookShelf.addBook(new Book("hello1"));
        bookShelf.addBook(new Book("hello2"));
        bookShelf.addBook(new Book("hello3"));
        Iterator<Book> iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            Book next = iterator.next();
            System.out.println(next);
        }
    }
}
