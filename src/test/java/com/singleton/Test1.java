package com.singleton;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Test1 {
    @Test
    void f1(){
//        ArrayList a = new ArrayList();
//        ArrayList clone = (ArrayList) a.clone();
//        a.add(1);
//        System.out.println(a);
//        System.out.println(clone);
        B o = (B) new B(
        ).f1();
        System.out.println(        o.a
        );
        A o1 = (A) new A().f1();System.out.println(        o1.a
        );
    }

    class A implements Cloneable{
        Integer a = 0;
        Object f1(){
            try {
                System.out.println(this.getClass().getName());
                 return clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    class B extends A{
        Integer a = 1 ;
    }
}
