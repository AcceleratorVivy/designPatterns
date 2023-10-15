package com.factory.framework;

public abstract class Factory<T extends Product> {
    public  Product create(String name){
        T p = createProduct(name);
        register(p);
        return p;
    }

    protected abstract  T createProduct(String name);
    protected abstract  void register(T p);

}
