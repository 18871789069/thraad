package com.tmx.threadpool;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created By Riven on 2020-11-14
 */
public class ConcurrentLinkedQequeTest {

    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> linkedDeque = new ConcurrentLinkedDeque<>();
        linkedDeque.offer("A");
        linkedDeque.offer("B");
        linkedDeque.add("C");
        linkedDeque.offer("D");
        linkedDeque.offer("E");
        System.out.println(linkedDeque.size());
        System.out.println(linkedDeque.poll());
        System.out.println(linkedDeque.peek());
        System.out.println(linkedDeque.poll());
        System.out.println(linkedDeque.poll());
        System.out.println(linkedDeque.poll());
    }
}
