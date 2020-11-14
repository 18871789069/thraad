package com.tmx.threadpool;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created By Riven on 2020-11-14
 */
public class CustomQueue implements Runnable {

    private BlockingDeque<String> blockingDeque;

    private volatile boolean flag = true;

    public CustomQueue(BlockingDeque blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        try {
            System.out.println("消费者线程启动。。。。");
            while (flag) {
                Thread.sleep(8000);
                String data = blockingDeque.poll(2, TimeUnit.SECONDS);
                if (data == null) {
                    System.out.println("没有获取到信息");
                    flag = false;
                    return;
                }
                System.out.println("读取成功：" + data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("消费者线程停止。。。。");
        }
    }
}
