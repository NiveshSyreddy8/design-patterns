package com.designpatterns.zemoso.mediator;

public class User1 extends Participant {

    private String name;
    private ChatRoom chat;

    public User1(ChatRoom chat) {
        this.chat = chat;
    }
    @Override
    public void sendMessage(String msg) {
        chat.showMsg(msg, this);

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}