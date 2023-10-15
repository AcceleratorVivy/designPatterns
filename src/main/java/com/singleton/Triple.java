package com.singleton;

public class Triple {
    private static Triple[] triples;
    private Triple(){

    }
    public static synchronized Triple Triple(int i){
        if(triples == null)
            triples = new Triple[3];
        return i>=0&& i<3 ? triples[i] : null;
    }
}
