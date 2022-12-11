package com.hillel.dunaievsky.homeworks.homework13;

public class iPhones extends IOS implements Smartphones {

    @Override
    void IOS() {
        System.out.println("Iphone");
    }

    @Override
    public void call() {
        System.out.println("Call from iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Write sms from iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Go to the internet from iPhone");
    }
}
