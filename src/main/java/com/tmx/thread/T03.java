package com.tmx.thread;

/**
 * Created By Riven on 2020-11-12
 */
public class T03 implements Runnable {

    static int tick = 100;
    static Object ob = "01";

    @Override
    public void run() {
        while (tick > 0) {
            synchronized (ob) {
                System.out.println(Thread.currentThread() + "===" + tick);
                tick--;
            }
            try {
                //暂停100毫秒
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
        }
    }
}
