package com.hillel.dunaievsky.homeworks.homework13;

public class Androids extends LinuxOS implements Smartphones {
    @Override
    void LinuxOS() {
        System.out.println("Android");
    }

    @Override
    public void call() {
        System.out.println("Call for android");
    }

    @Override
    public void sms() {
        System.out.println("Write sms from android");
    }

    @Override
    public void internet() {
        System.out.println("Go to the internet from android");
    }
}
