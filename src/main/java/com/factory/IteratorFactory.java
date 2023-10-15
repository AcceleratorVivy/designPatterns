package com.factory;

import com.factory.framework.Factory;
import com.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IteratorFactory<T extends Product> {
//    @Override
//    protected Product createProduct(String name) {
//        return null;
//    }
//
//    @Override
//    protected void register(Product p) {
//
//    }
     static <T>   void f1(List<? extends Product> list,List<? super Product> list1,List<?> list3,T t){

    }

    public  static void main(String[] args) {
        f1(new ArrayList<Product>(),new ArrayList<Product>(),new ArrayList<Product>(),String.valueOf(1));
    }

}
