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
        ScheduleJob scheduleJob=new ScheduleJob();
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(5);
        scheduledExecutorService.scheduleAtFixedRate(scheduleJob, 1, 1, SECONDS);//this对象本身
    }
}
