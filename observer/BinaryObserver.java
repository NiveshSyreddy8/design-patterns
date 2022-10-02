package com.designpatterns.zemoso.observer;

public class BinaryObserver implements Observer{
    private Subject subject;

    public BinaryObserver() {
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));

    }
}
