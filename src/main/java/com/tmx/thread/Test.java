package com.tmx.thread;

/**
 * Created By Riven on 2020-11-6
 */
public class Test {

    static int count = 50;

    synchronized void m1() {
        while (count > 0) {
            count--;
            System.out.println(Thread.currentThread() +":"+count);
        }
    }

    synchronized void m2() {
        while (count > 0) {
            count--;
            System.out.println(Thread.currentThread() +":"+count);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        new Thread(test::m1, "r1").start();
        new Thread(test::m2, "r2").start();
    }
}
