package com.tmx.threadpool;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created By Riven on 2020-11-14
 */
public class QueueTest {

    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>(10);
        ProductQueue productQueue = new ProductQueue(blockingDeque);
        CustomQueue customQueue = new CustomQueue(blockingDeque);
        Thread t1 = new Thread(productQueue);
        Thread t2 = new Thread(customQueue);
        t1.start();
        t2.start();
        Thread.sleep(1000 * 20);
        productQueue.stop();
    }
}
