package com.factory;

import com.factory.framework.Factory;
import com.factory.framework.Product;
import com.factory.idcard.IDCard;
import com.factory.idcard.IDCardFactory;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    void f1(){
        Factory<IDCard> factory = new IDCardFactory();
        Product product = factory.create("你好");
        Product product1 = factory.create("你好1");
        Product product2 = factory.create("你好2");
        System.out.println(factory);

    }
}
