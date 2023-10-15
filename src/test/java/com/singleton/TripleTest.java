package com.singleton;

import org.junit.jupiter.api.Test;

class TripleTest {

    @Test
    void triple()throws Exception{

        class A extends Thread {
//            @Override
//            public synchronized void start() {
//                super.start();
//            }

            @Override
            public void run() {
                super.run();
                for(int i = 0 ; i< 10; i++){
                    TicketMaker.getNextTicketNumber();
                }
            }
        }
        class B extends Thread {
//            @Override
//            public synchronized void start() {
//                super.start();
//            }

            @Override
            public void run() {
                super.run();
                for(int i = 0 ; i< 10; i++){
                    TicketMaker.getNextTicketNumber();
                }
            }
        }
        class C  extends Thread {
//            @Override
//            public synchronized void start() {
//                super.start();
//            }

            @Override
            public void run() {
                super.run();
                for(int i = 0 ; i< 10; i++){
                    TicketMaker.getNextTicketNumber();
                }
            }
        }
        new A().start();
        new B().start();
        new C().start();
        for(int i = 0 ; i< 10; i++){
            TicketMaker.getNextTicketNumber();
        }
    }
}