package com.iterator;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//		TreeSet s = new TreeSet();
        List<String> list = new ArrayList<>();
        list.add("asldjk");
        list.add("nsa");
        list.add("dsa");
        list.sort(String::compareTo);
        System.out.println(list);
    }
}
