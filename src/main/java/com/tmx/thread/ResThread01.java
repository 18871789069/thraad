package com.tmx.thread;

/**
 * Created By Riven on 2020-11-13
 */
public class ResThread01 extends Thread {

    public Res res;

    public ResThread01(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (res) {
                try {
                    if (res.flag) {
                        res.wait();
                    }
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (count == 0) {
                    res.name = "小明";
                    res.sex = "男";
                } else {
                    res.name = "小红";
                    res.sex = "女";
                }
                count = (count + 1) % 2;
                res.flag = true;
                res.notify();
            }
        }
    }
}
