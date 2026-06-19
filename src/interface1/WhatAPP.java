package interface1;

public interface WhatAPP {

    default void reply() {

        System.out.println("whatapp give reply");
    }

    void sendmessage();

    void status();


}
