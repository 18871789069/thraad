package com.tmx.thread;

/**
 * Created By Riven on 2020-11-13
 */
public class ResThread02 extends Thread {

    public Res res;

    public ResThread02(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (res) {
                if (!res.flag) {
                    try {
                        res.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(res.name + "：" + res.sex);
                res.flag = false;
                res.notify();
            }
        }
    }
}
