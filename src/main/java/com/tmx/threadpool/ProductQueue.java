package com.tmx.threadpool;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created By Riven on 2020-11-14
 */
public class ProductQueue implements Runnable {

    private BlockingDeque<String> blockingDeque;

    private AtomicInteger atomicInteger = new AtomicInteger();

    private volatile boolean flag = true;

    public ProductQueue(BlockingDeque<String> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        try {
            System.out.println("#######生产者线程已经启动#######");
            while (flag) {
                String i = atomicInteger.incrementAndGet() + "";
                boolean ifOffer = blockingDeque.offer(i, 2, TimeUnit.SECONDS);
                if (ifOffer) {
                    System.out.println("加入生产者队列成功：" + i);
                    Thread.sleep(1000);
                } else {
                    System.out.println("加入生产者队列失败：" + i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("#######生产者线程已经停止#######");
    }

    public void stop() {
        flag = false;
    }
}
