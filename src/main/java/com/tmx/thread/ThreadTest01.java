package com.tmx.thread;

/**
 * Created By Riven on 2020-11-12
 */
public class ThreadTest01 {

    public static void main(String[] args) {
        T01 t01 = new T01();
        Thread t1 = new Thread(t01, "A");
        T02 t02 = new T02();
        Thread t2 = new Thread(t02, "B");
        t1.start();
        t2.start();
    }
}
