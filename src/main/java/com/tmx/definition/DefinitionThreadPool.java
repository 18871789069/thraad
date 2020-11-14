package com.tmx.definition;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created By Riven on 2020-11-14
 */
public class DefinitionThreadPool {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(3));
        for (int i = 0; i < 5; i++) {
            TaskThread taskThread = new TaskThread("任务" + i);
            threadPoolExecutor.execute(taskThread);
        }
        threadPoolExecutor.shutdown();
    }
}
