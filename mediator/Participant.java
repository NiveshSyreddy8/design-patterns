package com.designpatterns.zemoso.mediator;

public abstract class Participant {
      public abstract void sendMessage(String message);

      public abstract void setName(String name);

      public abstract String getName();
}