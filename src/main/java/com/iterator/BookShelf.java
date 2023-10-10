package com.iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate<Book>{
    private ArrayList<Book> books;



    public BookShelf() {
        books = new ArrayList<>();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Book getBook(int index ) {
        return books.get(index);
    }
}
