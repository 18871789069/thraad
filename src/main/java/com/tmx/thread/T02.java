package com.tmx.thread;

/**
 * Created By Riven on 2020-11-12
 */
public class T02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + "===" + (10-i));
        }
    }
}
