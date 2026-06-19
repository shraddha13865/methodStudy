package interface1;

public class TextMessage implements WhatAPP, ChatGpt {
    public static void main(String[] args) {
        TextMessage textMessage = new TextMessage();
        textMessage.sendmessage();
        textMessage.status();
        textMessage.chatAi();
        textMessage.information();
        textMessage.reply();

    }

    @Override
    public void reply() { //i use default
        WhatAPP.super.reply();
        ChatGpt.super.reply();
    }

    @Override
    public void sendmessage() {
        System.out.println("whatapp send messages to another person quicky");
    }

    @Override
    public void status() {
        System.out.println("whatapp have status");
    }

    @Override
    public void chatAi() {
        System.out.println("chatAi slove our problem very fast");
    }

    @Override
    public void information() {
        System.out.println("chatAi give me more information to this question");
    }
}
