package com.factory.idcard;

import com.factory.framework.Factory;
import com.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory<IDCard> {
    private List<IDCard> cards;

    public IDCardFactory() {
        this.cards = new ArrayList<>();
    }

    @Override
    protected IDCard createProduct(String name) {
        return new IDCard(cards.size()+"",name);
    }

    @Override
    protected void register(IDCard p) {
        cards.add(p);
    }

    @Override
    public String toString() {
        return "IDCardFactory{" +
                "cards=" + cards +
                '}';
    }
}
