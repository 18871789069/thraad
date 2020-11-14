package com.tmx.thread;

/**
 * Created By Riven on 2020-11-13
 */
public class ResThreadTest {

    public static void main(String[] args) {
        Res res = new Res();
        ResThread01 resThread01 = new ResThread01(res);
        ResThread02 resThread02 = new ResThread02(res);
        resThread01.start();
        resThread02.start();
    }
}
