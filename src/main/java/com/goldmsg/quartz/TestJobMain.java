//package com.goldmsg.quartz;
//
//
//import org.apache.log4j.PropertyConfigurator;
//import org.quartz.Scheduler;
//import org.quartz.SchedulerException;
//import org.quartz.impl.StdSchedulerFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//
///**
// * Created with IntelliJ IDEA.
// * User: 周海明
// * Date: 2016/12/21
// * Time: 9:13
// */
//public class TestJobMain {
//    Logger logger = LoggerFactory.getLogger(TestJobMain.class);
//
//    public static void main(String[] args) {
//        PropertyConfigurator.configure("conf/log4j.properties");
//        TestJobMain testJobMain = new TestJobMain();
//        Scheduler scheduler = null;
//        try {
//            scheduler = testJobMain.createScheduler();
//            scheduler.start();
//
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    //创建调度器
//    public Scheduler createScheduler() throws SchedulerException {
//        return StdSchedulerFactory.getDefaultScheduler();
//    }
//}
