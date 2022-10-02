package com.designpatterns.zemoso.observer;

public class HexaObserver implements Observer{
    private Subject subject;
    
    public HexaObserver() {
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
