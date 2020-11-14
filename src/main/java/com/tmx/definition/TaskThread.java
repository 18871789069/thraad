package com.tmx.definition;

/**
 * Created By Riven on 2020-11-14
 */
public class TaskThread implements Runnable {

    private String name;

    public TaskThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "===" + name);
    }
}
