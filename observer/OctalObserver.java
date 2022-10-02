package com.designpatterns.zemoso.observer;
public class OctalObserver implements Observer{
    private Subject subject;

    public OctalObserver() {
    }
    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
