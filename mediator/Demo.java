package com.designpatterns.zemoso.mediator;

public class Demo {
      
    public static void main(String args[])  
    {
        ChatRoom chat = new ChatRoomImpl();

        User1 Nivesh = new User1(chat);
        User2 Akash = new User2(chat);

        Nivesh.setName("Akash");
        Nivesh.sendMessage("Hi Akash! how are you?");

        Akash.setName("Nivesh");
        Akash.sendMessage("I am Fine ! How are you doing?");
    }  
  
}