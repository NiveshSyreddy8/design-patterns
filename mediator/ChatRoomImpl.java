package com.designpatterns.zemoso.mediator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;  
import java.util.Date;  
  
public class ChatRoomImpl implements ChatRoom{
    //get current date time   
    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");  
    Date date = new Date();  
    @Override  
    public void showMsg(String message, Participant participant) {
          
        System.out.println(participant.getName()+" received a message: "+message);
        System.out.println("\t\t\t\t"+"["+dateFormat.format(date).toString()+"]\n");
    }     
}