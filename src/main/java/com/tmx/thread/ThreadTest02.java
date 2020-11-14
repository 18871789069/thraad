package com.tmx.thread;

/**
 * Created By Riven on 2020-11-12
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        new Thread(new T03(), "A").start();
        new Thread(new T03(), "B").start();
        new Thread(new T03(), "C").start();
        new Thread(new T03(), "D").start();
    }
}
