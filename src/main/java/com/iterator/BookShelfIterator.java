package com.iterator;

public class BookShelfIterator implements Iterator<Book>{
    private int index ;
    private final BookShelf bookShelf;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0 ;
    }

    @Override
    public boolean hasNext() {
        return  index != bookShelf.getLength();
    }

    @Override
    public Book next() {
        if(!hasNext())
            return null;
        Book book = bookShelf.getBook(index);
        index ++ ;
        return book;
    }
}
