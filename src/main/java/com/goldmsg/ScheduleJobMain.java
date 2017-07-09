package com.goldmsg;



import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 *
 *一个删除文件的的定时任务
 * */
public class ScheduleJobMain {
    public static void main(String[] args) {
        int corePoolSize =5;
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(corePoolSize);
        /*
        * 五个线程
        * */
        for (int i=0 ;i<corePoolSize;i++) {
            scheduledExecutorService.scheduleAtFixedRate(new ScheduleJob(), 1, 1, SECONDS);//this对象本身
        }
    }
}
