package com.goldmsg;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * 计划定时任务
 * JDKDemo
 */
public class BeeperControlMain implements Runnable {
    public static int corePoolSize = 5;
    public static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(corePoolSize);

    public static void main(String[] args) {
        for (int i = 0; i < corePoolSize; i++) {
            executorService.scheduleAtFixedRate(new BeeperControlMain(), 0, 2, SECONDS);
        }
    }

    public void run() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss:SSS");
        System.out.println(Thread.currentThread().getName() + "\t我是小蜜蜂..beep\t" + simpleDateFormat.format(new Date()));
        Random random = new Random();
        try {
            int a = 2;
//            int a = random.nextInt(2);
            int b = 1;
            System.out.println(b / a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
