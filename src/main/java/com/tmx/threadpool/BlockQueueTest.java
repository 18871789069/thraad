package com.tmx.threadpool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created By Riven on 2020-11-14
 */
public class BlockQueueTest {

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>(3);
        blockingDeque.offer("A");
        blockingDeque.offer("B");
        blockingDeque.offer("C");
        blockingDeque.offer("D", 3, TimeUnit.SECONDS);
        System.out.println(blockingDeque.poll());
        System.out.println(blockingDeque.poll());
        blockingDeque.offer("E", 3, TimeUnit.SECONDS);
        System.out.println(blockingDeque.poll(3, TimeUnit.SECONDS));
        System.out.println(blockingDeque.poll(3, TimeUnit.SECONDS));
        System.out.println(blockingDeque.poll(3, TimeUnit.SECONDS));
    }
}
