package com.singleton;

public class TicketMaker {
    private static int ticket = 0 ;
    public static synchronized int getNextTicketNumber(){
        System.out.println(ticket);
        return ticket++;
    }
}
