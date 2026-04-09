package com.itheima.demo;

public class DrawThread extends Thread{
    private Account account;

    public DrawThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        account.draw(100000);
    }
}
