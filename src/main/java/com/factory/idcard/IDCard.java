package com.factory.idcard;

import com.factory.framework.Product;

public class IDCard extends Product {
    private String id ;
    private String name;

    public IDCard(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("出示身份证,姓名:"+name+" 卡号:"+id);
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
