package com.designpatterns.zemoso.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {

        Observer observer1 = new HexaObserver();
        Observer observer2 = new OctalObserver();
        Observer observer3 = new BinaryObserver();

        Subject subject = new Subject();

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        System.out.println("First State change: 15");
        subject.setState(15);

        System.out.println("\nSecond State change: 10");
        subject.setState(10);

    }
}
